package com.example.nuevacalculadora;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;

public class Mainpotencia extends AppCompatActivity {

    private EditText edit01, edit02;
    private TextView textViewResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edit01 = findViewById(R.id.edit01);
        edit02 = findViewById(R.id.edit02);
        textViewResult = findViewById(R.id.textViewResult);
        Button buttonPower = findViewById(R.id.buttonPower);


        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatePower();
            }
        });

        Button button1= findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Mainpotencia.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnFibonacci= findViewById(R.id.btnFibonacci);
        btnFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Mainpotencia.this,Mainfibonacci.class);
                startActivity(intent);
            }
        });
    }


    public void calculatePower() {
        double base = Double.parseDouble(edit01.getText().toString());
        double exponent = Double.parseDouble(edit02.getText().toString());
        double result = Math.pow(base, exponent);
        textViewResult.setText(String.format(Locale.getDefault(), "Potencia: %.2f", result));
    }
}
