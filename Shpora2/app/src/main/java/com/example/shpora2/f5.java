package com.example.shpora2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shpora2.databinding.ActivityF5Binding;

public class f5 extends Activity {

    private ImageView mTextView;
    private ActivityF5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityF5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.imageView1;
    }
}