package com.example.yourhospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailRSjih extends AppCompatActivity {
    ImageView kemjih;
    Button addjih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailrsjih);

        kemjih = findViewById(R.id.jihback);
        addjih = findViewById(R.id.btnJIH);

        kemjih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailRSjih.this,Opening.class);
                startActivity(intent);
            }
        });

        addjih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailRSjih.this,form.class);
                startActivity(intent);
            }
        });


    }
}
