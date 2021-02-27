package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertAmount (View view) {
        EditText editTextAmount = findViewById(R.id.editTextAmount);
        Double amount = Double.valueOf(editTextAmount.getText().toString());
        Double dollar = amount * 0.014;
        Toast.makeText(this, "₹" + editTextAmount.getText().toString() + " is " + "$" + String.format("%.2f", dollar), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}