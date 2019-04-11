package com.example.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void Login(View view)
    {
        EditText var = (EditText) findViewById(R.id.username);
        EditText pass = (EditText) findViewById(R.id.password);

        Log.i("Username",var.getText().toString());
        Log.i("Username",pass.getText().toString());
        Log.i("Info","Button pressed");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
