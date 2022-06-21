package com.example.yourhospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailBathesda extends AppCompatActivity {
    ImageView kembath;
    Button addbathesda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailrsbathesda);

        kembath = findViewById(R.id.bathback);
        addbathesda = findViewById(R.id.btnBathesda);

        kembath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailBathesda.this,Opening.class);
                startActivity(intent);
            }
        });

        addbathesda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailBathesda.this,form.class);
                startActivity(intent);
            }
        });


    }
}
