package com.example.yourhospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.yourhospital.database.databaseuser;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class editform extends AppCompatActivity {
    TextInputEditText Nama, NIK, Ttl, JK, Notelp, TglP, RS;
    Button Save;
    String nm,nik,ttl,jk,nt,tglp,rs,id;
    databaseuser controller = new databaseuser(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editform);

        Nama = findViewById(R.id.edNama);
        NIK = findViewById(R.id.edNik);
        Ttl = findViewById(R.id.edTanggalLahir);
        JK = findViewById(R.id.edjeniskelamin);
        Notelp = findViewById(R.id.ednotelp);
        TglP = findViewById(R.id.edtanggalpemesanan);
        RS = findViewById(R.id.edrumahsakit);
        Save = findViewById(R.id.buttonedit);

        id = getIntent().getStringExtra("id");
        nm = getIntent().getStringExtra("Nama");
        nik = getIntent().getStringExtra("NIK");
        ttl = getIntent().getStringExtra("Ttl");
        jk = getIntent().getStringExtra("JK");
        nt = getIntent().getStringExtra("Notelp");
        tglp = getIntent().getStringExtra("TglPesan");
        rs = getIntent().getStringExtra("RS");

        setTitle("Edit Data User");
        Nama.setText(nm);
        NIK.setText(nik);
        Ttl.setText(ttl);
        JK.setText(jk);
        Notelp.setText(nt);
        TglP.setText(tglp);
        RS.setText(rs);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Nama.getText().equals("")||NIK.getText().toString().equals("")||Ttl.getText().toString().equals("")||
                        JK.getText().toString().equals("") || Notelp.getText().toString().equals("") || TglP.getText().toString().equals("") ||
                        RS.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Mohon isi semua data terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }else {
                    nm = Nama.getText().toString();
                    nik = NIK.getText().toString();
                    ttl = Ttl.getText().toString();
                    jk = JK.getText().toString();
                    nt = Notelp.getText().toString();
                    tglp = TglP.getText().toString();
                    rs = RS.getText().toString();
                    HashMap<String,String> values = new HashMap<>();
                    values.put("id",id);
                    values.put("Nama",nm);
                    values.put("NIK",nik);
                    values.put("Ttl",ttl);
                    values.put("JK",jk);
                    values.put("Notelp",nt);
                    values.put("TglPesan",tglp);
                    values.put("RS",rs);
                    controller.UpdateData(values);
                    callData();
                }
            }
        });
    }

    private void callData() {
        Intent i = new Intent(editform.this,DaftarUser.class);
        startActivity(i);
        finish();
    }
}