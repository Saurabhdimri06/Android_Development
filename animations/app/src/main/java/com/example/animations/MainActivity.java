package com.example.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void shift(View view)
    {
        ImageView goku = (ImageView) findViewById(R.id.goku);
        goku.animate().translationX(-1000f).setDuration(1000); //Getting transalted to the left side

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
