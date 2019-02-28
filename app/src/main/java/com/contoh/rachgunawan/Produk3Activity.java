package com.contoh.rachgunawan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Produk3Activity extends AppCompatActivity {
    Button btnKembali;
    Button btnBeli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk3);
        getSupportActionBar().setTitle("Nawan Shop");
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;
        btnBeli = (Button) findViewById(R.id.btnBeli);
        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(context, LoginActivity.class);
                startActivity(i);
            }
        });
        btnKembali = (Button) findViewById(R.id.btnKembali);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent t = new Intent(context, MainActivity.class);
                startActivity(t);
            }
        });
    }
}
