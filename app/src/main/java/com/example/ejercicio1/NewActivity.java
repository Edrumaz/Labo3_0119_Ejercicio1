package com.example.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import utilities.AppConstants;

import static android.content.Intent.EXTRA_USER;

public class NewActivity extends AppCompatActivity {

    TextView mUser, mPassword, mGender, mEmail;
    Button mSubmitAction;
    String aux_user = "Texto quemado";
    String aux_pass = "Texto quemado";
    String aux_gender = "Texto quemado";
    String aux_email = "Texto quemado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mUser = findViewById(R.id.tv_show_user);
        mPassword = findViewById(R.id.tv_show_password);
        mGender = findViewById(R.id.tv_show_gender);
        mEmail = findViewById(R.id.tv_show_email);
        mSubmitAction = findViewById(R.id.btn_share);

        Intent capture_intent = getIntent();
        Bundle extras = capture_intent.getExtras();

        if (extras != null){
            aux_user = extras.getString("EXTRA_USERNAME");
            aux_pass = extras.getString("EXTRA_PASSWORD");
            aux_gender = extras.getString("EXTRA_GENDER");
            aux_email = extras.getString("EXTRA_EMAIL");
        }

        mUser.setText(aux_user);
        mPassword.setText(aux_pass);
        mGender.setText(aux_gender);
        mEmail.setText(aux_email);

        mSubmitAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent2 = new Intent();

                m_intent2.setAction(Intent.ACTION_SEND);
                m_intent2.setType("text/plain");
                m_intent2.putExtra(Intent.EXTRA_TEXT, aux_user);
                startActivity(m_intent2);
            }
        });
    }
}
