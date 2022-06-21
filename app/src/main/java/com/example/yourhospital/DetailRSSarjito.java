package com.example.yourhospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailRSSarjito extends AppCompatActivity {
    ImageView kemsj;
    Button addsarjito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailrssarjito);

        kemsj = findViewById(R.id.sjback);
        addsarjito = findViewById(R.id.btnSarjito);

        kemsj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailRSSarjito.this,Opening.class);
                startActivity(intent);
            }
        });

        addsarjito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailRSSarjito.this,form.class);
                startActivity(intent);
            }
        });

    }
}
