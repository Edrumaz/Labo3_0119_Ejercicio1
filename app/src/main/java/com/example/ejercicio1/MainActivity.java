package com.example.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import utilities.AppConstants;

public class MainActivity extends AppCompatActivity {

    Button m_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_submit = findViewById(R.id.btn_submit);

        m_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent  =new Intent(MainActivity.this, NewActivity.class);

                m_intent.putExtra(AppConstants.TEXT1_KEY, "Texto prueba enviado");

                startActivity(m_intent);
            }
        });
    }
}
