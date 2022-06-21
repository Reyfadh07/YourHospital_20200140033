package com.example.yourhospital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailDrYap extends AppCompatActivity {

    ImageView kemyap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailrsdryap);

        kemyap = findViewById(R.id.yapback);

        kemyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailDrYap.this,Opening.class);
                startActivity(intent);
            }
        });


    }
}
