package com.example.fragmets;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Agrega el fragment de mensaje al contenedor
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainer, new MessageFragment())
                    .commit();
        }

        // Configura el OnClickListener para el botón
        Button btnSwitchFragment = findViewById(R.id.btnSwitchFragment);
        btnSwitchFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Reemplaza el fragmento actual con el fragmento de colores
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, new ColorFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
