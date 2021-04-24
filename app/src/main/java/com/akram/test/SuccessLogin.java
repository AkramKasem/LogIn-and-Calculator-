package com.akram.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SuccessLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_login);

        Bundle bundle = getIntent().getExtras();

        TextView name = findViewById(R.id.textView);
        name.setText("Hello , "+bundle.getString("name"));

    }

    public void Cal(View view) {
        startActivity(new Intent(SuccessLogin.this,Calculator.class));
    }
}