package com.contoh.rachgunawan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btnLogin(View view) {
        EditText etUser = (EditText) findViewById(R.id.et_username);
        EditText etPass = (EditText) findViewById(R.id.et_password);
        String user = etUser.getText().toString();
        String pass = etPass.getText().toString();
        if(user.equals("admin")&&pass.equals("admin")){
            Context context = this;
            Class classDirection = BayarActivity.class;
            Intent intent = new Intent(context, classDirection);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnBack(View view) {
        Context context = this;
        Class classDirection = MainActivity.class;
        Intent t = new Intent(context, classDirection);
        startActivity(t);

    }
}

