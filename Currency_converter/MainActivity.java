package com.example.currency_converter;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert_click(View view)
    {
        EditText var = (EditText) findViewById(R.id.amount);

        Log.i("Converted",var.getText().toString());
        String s = var.getText().toString();
        double val = Double.parseDouble(s);
        val = val*69.02;

        Toast.makeText(MainActivity.this, String.format("%.2f",val)+" Rupees", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
