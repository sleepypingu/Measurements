package com.example.measurements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class phenomena_and_illusions extends AppCompatActivity {

    private android.widget.Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phenomena_and_illusions);

        button9 = (Button) findViewById(R.id.button9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(phenomena_and_illusions.this, sub1.class);
                startActivity(int1);
            }
        });
    }
}