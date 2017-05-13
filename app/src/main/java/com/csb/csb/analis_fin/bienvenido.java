package com.csb.csb.analis_fin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bienvenido extends AppCompatActivity {

    Button continuar;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        continuar = (Button) findViewById(R.id.btn_continuar_welcome);

        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), activo_balance.class);
                startActivity(i);
            }
        });
    }
}
