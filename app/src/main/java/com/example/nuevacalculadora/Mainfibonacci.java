package com.example.nuevacalculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigInteger;
import java.util.ArrayList;

public class Mainfibonacci extends AppCompatActivity {

    public EditText editText01;
    public TextView texfibo02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText01 = findViewById(R.id.editText01);
        texfibo02 = findViewById(R.id.texfibo02);
        Button bottonfibo1 = findViewById(R.id.bottonfibo1);

        bottonfibo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el número ingresado por el usuario en el EditText
                String input = editText01.getText().toString();
                if (!input.isEmpty()) {
                    // Convertir el número a un entero
                    int number = Integer.parseInt(input);
                    // Calcular la secuencia de Fibonacci para el número especificado
                    String fibonacciSequence = fibonacci(number);
                    // Mostrar la secuencia de Fibonacci en el TextView texfibo02
                    texfibo02.setText(fibonacciSequence);
                } else {
                    // Si el EditText está vacío, mostrar un mensaje de error
                    texfibo02.setText("Por favor, ingrese un número antes de calcular la secuencia de Fibonacci.");
                }
            }
        });

        Button button1 = findViewById(R.id.button01);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mainfibonacci.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnfactorial01 = findViewById(R.id.btnfactorial01);
        btnfactorial01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mainfibonacci.this, Mainfactorial.class);
                startActivity(intent);
            }
        });
    }


    // Función para generar y devolver una secuencia de Fibonacci hasta el número especificado
    // Cambia el nombre de la función de FIBONACCI a fibonacci
    public static String fibonacci(int n) {
        StringBuilder text = new StringBuilder();
        ArrayList<BigInteger> fib = new ArrayList<>();//almacena los numeros
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        fib.add(first);
        fib.add(second);
        for (int i = 2; i <= n; i++) {
            fib.add(fib.get(i - 1).add(fib.get(i - 2)));
        }
        for (int i = 0; i <= n; i++) {
            text.append(i).append(".").append(fib.get(i)).append("\n");
        }
        return text.toString();
    }


}

