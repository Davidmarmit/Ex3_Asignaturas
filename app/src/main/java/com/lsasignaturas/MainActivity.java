package com.lsasignaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private final LinearLayout[] boton = new LinearLayout[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton[0] = (LinearLayout) findViewById(R.id.b_a1);
        boton[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("asignatura",0);
                startActivity(intent);
            }
        });
        boton[1] = (LinearLayout) findViewById(R.id.b_a2);
        boton[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("asignatura",1);
                startActivity(intent);
            }
        });
        boton[2] = (LinearLayout) findViewById(R.id.b_a3);
        boton[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("asignatura",2);
                startActivity(intent);
            }
        });
        boton[3] = (LinearLayout) findViewById(R.id.b_a4);
        boton[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("asignatura",3);
                startActivity(intent);
            }
        });


    }
}