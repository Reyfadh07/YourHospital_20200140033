package com.example.yourhospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailRSpku extends AppCompatActivity {
    ImageView kempku;
    Button addpku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailrspku);

        kempku = findViewById(R.id.pkmback);
        addpku = findViewById(R.id.btnPKU);

        kempku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailRSpku.this,Opening.class);
                startActivity(intent);
            }
        });

        addpku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailRSpku.this,form.class);
                startActivity(intent);
            }
        });


    }
}
