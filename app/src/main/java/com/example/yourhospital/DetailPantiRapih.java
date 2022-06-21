package com.example.yourhospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailPantiRapih extends AppCompatActivity {
    ImageView kempr;
    Button addpantirapih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailpantirapih);

        kempr = findViewById(R.id.prback);
        addpantirapih = findViewById(R.id.btnPantiRapih);

        kempr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPantiRapih.this,Opening.class);
                startActivity(intent);
            }
        });

        addpantirapih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailPantiRapih.this,form.class);
                startActivity(intent);
            }
        });


    }
}
