package com.pichuproductions.sortearfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random random = new Random();

        Button botao = (Button) findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numeroSorteado= 0;

                EditText numero1 = findViewById(R.id.numero_inicial);
                EditText numero2 = findViewById(R.id.numero_final);


                String num1 = numero1.getText().toString();
                String num2 = numero2.getText().toString();

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);


                numeroSorteado = random.nextInt((n2 - n1) + 1) + n1;
                String sorteio = Integer.toString(numeroSorteado);

                TextView resultadoFinal = (TextView) findViewById(R.id.resultado);

                resultadoFinal.setText(sorteio);

            }

        });
    }
}

