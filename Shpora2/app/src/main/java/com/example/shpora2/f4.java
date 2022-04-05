package com.example.shpora2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shpora2.databinding.ActivityF4Binding;

public class f4 extends Activity {

    private ImageView mTextView;
    private ActivityF4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityF4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.imageView1;
    }
}