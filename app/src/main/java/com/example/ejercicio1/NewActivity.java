package com.example.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import utilities.AppConstants;

public class NewActivity extends AppCompatActivity {

    TextView mText;
    Button mSubmitAction;
    String aux_tex = "Texto quemado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mText = findViewById(R.id.tv_prueba);
        mSubmitAction = findViewById(R.id.btn_share);

        Intent capture_intent = getIntent();

        if (capture_intent != null){
            aux_tex = capture_intent.getStringExtra(AppConstants.TEXT1_KEY);
        }

        mText.setText(aux_tex);
        mSubmitAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2 = new Intent();

                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");
                m_intent2.putExtra(Intent.EXTRA_TEXT, aux_tex);
                startActivity(m_intent2);
            }

        });
    }
}
