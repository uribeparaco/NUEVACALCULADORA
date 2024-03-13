package com.example.nuevacalculadora;

import static java.lang.Math.pow;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    // Declaración de variables para los elementos de la interfaz de usuario
    public EditText editTextNumber1, editTextNumber2;
    public TextView textViewResult, textViewFibo;

    /********************************************************/
    public void onClick(View view){
        Intent miIntent = new Intent(MainActivity.this,Mainpotencia.class);
        new Intent(MainActivity.this,Mainfibonacci.class);
        startActivity(miIntent);

    }



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  variables con elementos de la interfaz de usuario mediante sus ID
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textViewResult = findViewById(R.id.textViewResult);
        /*textViewFibo = findViewById(R.id.textViewFibo);*/

        // Asociar botones con sus listeners para responder a los clics del usuario
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSubtract = findViewById(R.id.buttonSubtract);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        /* Button buttonPower = findViewById(R.id.buttonPower);*/
        /*Button buttonfibonacci1 = findViewById(R.id.buttonfibonacci1);*/
        Button buttonFactorial = findViewById(R.id.buttonFactorial);



        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult("+",5,3);
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult("-",5,3);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult("*",5,3);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult("/",3,2);
            }
        });

        /*Listener para el botón de potencia
        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatePower(); // Llama a la función para calcular y mostrar el resultado de la potencia
            }
        });*/

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mainpotencia.class);
                startActivity(intent);
            }
        });
        // Listener para el botón de generar secuencia de Fibonacci
       /* buttonfibonacci1.setOnClickListener(new View.OnClickListener() {
        @Override
                public void onClick(View view) {
            // Llama a la función para generar y mostrar la secuencia de Fibonacci
            textViewFibo.setText(fibonacci(Integer.parseInt(editTextNumber1.getText().toString())));
        }
            });*/

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mainfibonacci.class);
                startActivity(intent);
            }
        });

        // Listener para el botón de calcular factorial
        /*buttonFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateFactorial(); // Llama a la función para calcular y mostrar el factorial

            }
        });*/

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mainfactorial.class);
                startActivity(intent);
            }
        });
    }

    // Función para generar y devolver una secuencia de Fibonacci hasta el número especificado
   /* public static String fibonacci(int n) {
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
    }*/

    // esta funcion es para calcular el factorial de un número
    public void calculateFactorial() {
        String input = editTextNumber1.getText().toString();
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


    // Funciones para realizar operaciones matemáticas básicas

    public static double suma(double num1, double num2){
        double resultado = (int) (num1 +  num2);
        return resultado;
    }
    public static double resta(double num1, double num2){
        double resultado = (int) (num1 -  num2);
        return resultado;
    }
    public static double multiplicacion(double num1, double num2){
        double resultado = (int) (num1 *  num2);
        return resultado;
    }
    public static double division(double num1, double num2){
        double resultado = (double) (num1 /  num2);
        return resultado;
    }



    // Función para calcular y mostrar el resultado de operaciones matemáticas básicas

    public void calculateResult(String operator, double num1,double num2) {
        num1 = Integer.parseInt(editTextNumber1.getText().toString());
        num2 = Integer.parseInt(editTextNumber2.getText().toString());
        double result = 0;

        switch (operator) {
            case "+":
                result = suma(num1 , num2);
                break;
            case "-":
                result = resta( num1 ,num2);
                break;
            case "*":
                result = multiplicacion(num1 , num2);
                break;
            case "/":
                if (num2 != 0) {
                    result = division(num1 , num2);
                } else {
                    textViewResult.setText("División por cero no permitida");
                    return;
                }
                break;
        }

        textViewResult.setText(String.format(Locale.getDefault(), "Resultado: %.2f", result));
    }


    // Función para calcular y mostrar el resultado de una potencia
   /* public void calculatePower() {
        double base = Integer.parseInt(editTextNumber1.getText().toString());
        double exponent = Integer.parseInt(editTextNumber2.getText().toString());
        double result = pow(base, exponent);
        textViewResult.setText(String.format(Locale.getDefault(), "Potencia: %.2f", result));
    }*/





}


