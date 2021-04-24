package com.akram.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText name , pass ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pass = findViewById(R.id.pass);
        name = findViewById(R.id.name);
    }


    public void LogIn(View view) {
        if (!name.getText().toString().isEmpty() ){
            if (!pass.getText().toString().isEmpty()){

                if (name.getText().toString().equals("akram") && pass.getText().toString().equals("1234")){
                    Intent intent = new Intent(MainActivity.this,SuccessLogin.class);
                    intent.putExtra("name",name.getText().toString());
                    startActivity(intent);
                }else{
                    Toast.makeText(this, "something went worng", Toast.LENGTH_SHORT).show();
                }

            }else {
                pass.setError("Enter Password");
                pass.requestFocus();
            }

        }else {
            name.setError("Enter user name");
            name.requestFocus();
        }


    }
}