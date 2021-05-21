package com.example.measurements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Educational extends AppCompatActivity {

    private android.widget.Button button3;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational);

        Button button = (Button) findViewById(R.id.button3);
    }
}