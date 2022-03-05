package com.lsasignaturas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView[] text = new TextView[6];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int temp = intent.getIntExtra("asignatura",4);
        text[0] = (TextView) findViewById(R.id.nom_assig);
        text[1] = (TextView) findViewById(R.id.profesor);
        text[2] = (TextView) findViewById(R.id.detalle);
        text[3] = (TextView) findViewById(R.id.creditos);
        text[4] = (TextView) findViewById(R.id.becarios);
        text[5] = (TextView) findViewById(R.id.aula);

        switch (temp){
            case 0:


            case 1:


            case 2:


            case 3:


            case 4:

        }
    }


}
