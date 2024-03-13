package com.example.nuevacalculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigInteger;

public class Mainfactorial extends AppCompatActivity {

    public EditText edit01;
    public TextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        edit01 = findViewById(R.id.edit01);
        textViewResult = findViewById(R.id.textViewResult);
        Button buttonFactorial = findViewById(R.id.buttonFactorial);


        // Listener para el botón de calcular factorial
        buttonFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateFactorial(); // Llama a la función para calcular y mostrar el factorial

            }
        });

        Button button01= findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Mainfactorial.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }


    public void calculateFactorial() {
        String input = edit01.getText().toString();
        if (!input.isEmpty()) {
            int number = Integer.parseInt(input);
            BigInteger factorial = calculateRecursiveFactorial(number);
            textViewResult.setText("Factorial: " + factorial); // Muestra el resultado del factorial en el textViewResult
        } else {
            textViewResult.setText("Por favor, ingrese un número antes de calcular el factorial.");
        }
    }


    // Función recursiva para calcular el factorial de un número
    public BigInteger calculateRecursiveFactorial(int n) {
        if (n == 0 || n == 1)
            return BigInteger.ONE;
        else
            return BigInteger.valueOf(n).multiply(calculateRecursiveFactorial(n - 1));
    }


}
