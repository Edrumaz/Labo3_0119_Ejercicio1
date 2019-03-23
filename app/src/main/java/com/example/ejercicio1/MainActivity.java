package com.example.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import utilities.AppConstants;

public class MainActivity extends AppCompatActivity {

    Button m_submit;
    EditText user, pass, gender, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_submit = findViewById(R.id.btn_submit);
        user = findViewById(R.id.et_user);
        pass = findViewById(R.id.et_pass);
        gender = findViewById(R.id.et_gender);
        email = findViewById(R.id.et_email);

        m_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent  =new Intent(MainActivity.this, NewActivity.class);
                Bundle extras = new Bundle();
                extras.putString("EXTRA_USERNAME", user.getText().toString());
                extras.putString("EXTRA_PASSWORD", pass.getText().toString());
                extras.putString("EXTRA_GENDER", gender.getText().toString());
                extras.putString("EXTRA_EMAIL", email.getText().toString());
                m_intent.putExtras(extras);

                startActivity(m_intent);
            }
        });
    }
}
