package com.example.sr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPersonName;
    TextView a;
    TextView b;
    Double A;
    Double B;
    Double C;
    final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bntCalc = findViewById(R.id.button);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        a = findViewById(R.id.textView9);
        b = findViewById(R.id.textView10);
        a.setText(String.valueOf(random.nextInt(10)+1));
        b.setText(String.valueOf(random.nextInt(10)+1));
        A = Double.parseDouble(Objects.requireNonNull(a.getText().toString()));
        B = Double.parseDouble(Objects.requireNonNull(a.getText()).toString());
        a.setText(String.valueOf("A = "+A));
        b.setText(String.valueOf("B = "+B));
        bntCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long startTime = System.nanoTime();
                add();
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                TextView addTime = findViewById(R.id.textView5);
                addTime.setText(Long.toString(duration) + " ms");
                startTime = System.nanoTime();
                substract();
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                TextView substract = findViewById(R.id.textView6);
                substract.setText(Long.toString(duration) + " ms");
                startTime = System.nanoTime();
                mul();
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                TextView multext = findViewById(R.id.textView7);
                multext.setText(Long.toString(duration) + " ms");
                startTime = System.nanoTime();
                div();
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                TextView divtext = findViewById(R.id.textView8);
                divtext.setText(Long.toString(duration) + " ms");
            }
        });


    }

    private void add(){
        for (int i=0; i< Integer.parseInt(editTextTextPersonName.getText().toString()); i++){
            C = A + B;
        }
    }

    private void substract(){
        for (int i=0; i< Integer.parseInt(editTextTextPersonName.getText().toString()); i++){
            C = A - B;
        }
    }

    private void mul(){
        for (int i=0; i< Integer.parseInt(editTextTextPersonName.getText().toString()); i++){
            C = A * B;
        }
    }

    private void div(){
        for (int i=0; i< Integer.parseInt(editTextTextPersonName.getText().toString()); i++){
            C = A / B;
        }
    }
}