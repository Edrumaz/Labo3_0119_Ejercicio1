package com.example.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import utilities.AppConstants;

public class ShareActivity extends AppCompatActivity {

    TextView mSharedText;
    private String aux_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        mSharedText.findViewById(R.id.shared_text);

        Intent capture_intent = getIntent();

        if (capture_intent != null){
            aux_text = capture_intent.getStringExtra(AppConstants.TEXT1_KEY);
        }
    }
}
