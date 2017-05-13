package com.csb.csb.analis_fin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by csb on 06/05/17.
 */

public class pasivo_balance extends Activity {

    Intent i;
    Button btn_siguiente_pasivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasivo_balance);

        btn_siguiente_pasivo = (Button) findViewById(R.id.btn_siguiente_pasivo);
        btn_siguiente_pasivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), estado_resultados.class);
                startActivity(i);
            }
        });

    }

}
