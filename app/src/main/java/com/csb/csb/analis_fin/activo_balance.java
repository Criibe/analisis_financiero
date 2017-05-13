package com.csb.csb.analis_fin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by csb on 06/05/17.
 */

public class activo_balance extends Activity {

    Button btn_activo_siguiente;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activo_balance);

        btn_activo_siguiente = (Button) findViewById(R.id.btn_activo_siguiente);
        btn_activo_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), pasivo_balance.class);
                startActivity(i);
            }
        });
    }
}
