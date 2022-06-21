package com.example.yourhospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Opening extends AppCompatActivity {
    CardView tosarjito, topantirapih, topkujogja, tobathesda, tojih, toyap;
    ImageView imgfdrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opening);

        tosarjito = findViewById(R.id.rssarjito);
        topantirapih = findViewById(R.id.rspantirapih);
        topkujogja = findViewById(R.id.rspkujogja);
        tobathesda = findViewById(R.id.rsbathesda);
        tojih = findViewById(R.id.rsjih);
        toyap = findViewById(R.id.dryap);
        imgfdrl = findViewById(R.id.folder);


        tosarjito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opening.this,DetailRSSarjito.class);
                startActivity(intent);
            }
        });

        topantirapih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( Opening.this,DetailPantiRapih.class);
                startActivity(intent);
            }
        });

        topkujogja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opening.this,DetailRSpku.class);
                startActivity(intent);
            }
        });

        tobathesda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opening.this,DetailBathesda.class);
                startActivity(intent);
            }
        });

        tojih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opening.this,DetailRSjih.class);
                startActivity(intent);
            }
        });

        toyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opening.this,DetailDrYap.class);
                startActivity(intent);
            }
        });

        imgfdrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opening.this,DaftarUser.class);
                startActivity(intent);
            }
        });


    }
}