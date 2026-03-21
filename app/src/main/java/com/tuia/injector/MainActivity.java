package com.tuia.injector;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = findViewById(R.id.btnConnect);
        final EditText payloadInput = findViewById(R.id.editPayload);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String payload = payloadInput.getText().toString();
                // Aquí usamos la lógica que creamos antes
                String finalPayload = PayloadGenerator.generate(payload, "127.0.0.1", 8080);
                Toast.makeText(MainActivity.this, "Inyectando Payload...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
