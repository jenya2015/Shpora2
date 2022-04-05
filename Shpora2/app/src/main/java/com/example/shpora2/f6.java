package com.example.shpora2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shpora2.databinding.ActivityF6Binding;

public class f6 extends Activity {

    private ImageView mTextView;
    private ActivityF6Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityF6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.imageView1;
    }
}