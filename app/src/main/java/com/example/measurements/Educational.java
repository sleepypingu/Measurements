package com.example.measurements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Educational extends AppCompatActivity {

    private android.widget.Button button4;
    private android.widget.Button button5;
    private android.widget.Button button6;
    private android.widget.Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational);

        button4 = (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Educational.this, phenomena_and_illusions.class);
                startActivity(int1);
            }
        });

        button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Educational.this, length_mass_and_time.class);
                startActivity(int1);
            }
        });

        button6 = (Button) findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Educational.this, estimating_quantities.class);
                startActivity(int1);
            }
        });

        button7 = (Button) findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Educational.this, heat_and_tempt.class);
                startActivity(int1);
            }
        });
    }
}