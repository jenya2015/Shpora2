package com.example.shpora2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shpora2.databinding.ActivityF2Binding;

public class f2 extends Activity {

    private ImageView mTextView;
    private ActivityF2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityF2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.imageView1;
    }
}