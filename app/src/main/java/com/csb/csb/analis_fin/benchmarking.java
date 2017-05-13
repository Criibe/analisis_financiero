package com.csb.csb.analis_fin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by csb on 06/05/17.
 */

public class benchmarking extends Activity {

    Button btn_benchmarking_siguiente;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benchmarking);

        btn_benchmarking_siguiente = (Button) findViewById(R.id.btn_benchmarking_siguiente);
        btn_benchmarking_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), cargar_analisis_financiero.class);
                startActivity(i);
            }
        });
    }
}
