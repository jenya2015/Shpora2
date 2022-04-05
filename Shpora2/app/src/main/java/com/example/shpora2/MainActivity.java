package com.example.shpora2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.ImageView;

import com.example.shpora2.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;


    }

    public void onClick1(View view) {
        Intent intent = new Intent(MainActivity.this, f1.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(MainActivity.this, f2.class);
        startActivity(intent);
    }

    public void onClick3(View view) {
        Intent intent = new Intent(MainActivity.this, f3.class);
        startActivity(intent);
    }

    public void onClick4(View view) {
        Intent intent = new Intent(MainActivity.this, f4.class);
        startActivity(intent);
    }

    public void onClick5(View view) {
        Intent intent = new Intent(MainActivity.this, f5.class);
        startActivity(intent);
    }

    public void onClick6(View view) {
        Intent intent = new Intent(MainActivity.this, f6.class);
        startActivity(intent);
    }

}