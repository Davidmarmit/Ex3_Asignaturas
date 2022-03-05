package com.lsasignaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView[] text = new TextView[6];

    @Override
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
                text[0].setText(R.string.a1);
                text[1].setText(R.string.a1_professor);
                text[2].setText(R.string.a1_detail);
                text[3].setText(R.string.a1_credits);
                text[4].setText(R.string.a1_becarios);
                text[5].setText(R.string.a1_aula);
                break;

            case 1:
                text[0].setText(R.string.a2);
                text[1].setText(R.string.a2_professor);
                text[2].setText(R.string.a2_detail);
                text[3].setText(R.string.a2_credits);
                text[4].setText(R.string.a2_becarios);
                text[5].setText(R.string.a2_aula);
                break;

            case 2:
                text[0].setText(R.string.a3);
                text[1].setText(R.string.a3_professor);
                text[2].setText(R.string.a3_detail);
                text[3].setText(R.string.a3_credits);
                text[4].setText(R.string.a3_becarios);
                text[5].setText(R.string.a3_aula);
                break;

            case 3:
                text[0].setText(R.string.a4);
                text[1].setText(R.string.a4_professor);
                text[2].setText(R.string.a4_detail);
                text[3].setText(R.string.a4_credits);
                text[4].setText(R.string.a4_becarios);
                text[5].setText(R.string.a4_aula);
                break;
        }
    }
}