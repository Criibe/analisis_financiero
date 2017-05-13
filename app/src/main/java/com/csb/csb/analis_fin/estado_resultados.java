package com.csb.csb.analis_fin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by csb on 06/05/17.
 */

public class estado_resultados extends Activity {

    Intent i;
    Button btn_siguiente_estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estado_resultados);

        btn_siguiente_estado = (Button) findViewById(R.id.btn_siguiente_estado);
        btn_siguiente_estado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), benchmarking.class);
                startActivity(i);
            }
        });
    }
}
