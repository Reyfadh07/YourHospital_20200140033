package com.example.yourhospital;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.yourhospital.database.databaseuser;
import com.google.android.material.textfield.TextInputEditText;

import java.util.HashMap;

public class form extends AppCompatActivity {
    private TextInputEditText tNama, tNIK, tTtl, tJK, tNotelp, tTglPesan, tRS;
    private Button simpanBtn;
    String nm,nik,ttl,jk,nt,tglp,rs;
    databaseuser controller = new databaseuser(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        tNama = (TextInputEditText) findViewById(R.id.inputnama);
        tNIK = (TextInputEditText) findViewById(R.id.inputNik);
        tTtl = (TextInputEditText) findViewById(R.id.inputTanggalLahir);
        tJK = (TextInputEditText) findViewById(R.id.inputjeniskelamin);
        tNotelp = (TextInputEditText) findViewById(R.id.inputnotelp);
        tTglPesan = (TextInputEditText) findViewById(R.id.inputtanggalpemesanan);
        tRS= (TextInputEditText) findViewById(R.id.inputRumahSakit);
        simpanBtn = (Button) findViewById(R.id.buttonsave);


        simpanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tNama.getText().equals("")||tNIK.getText().toString().equals("")||tTtl.getText().toString().equals("")||
                        tJK.getText().toString().equals("") || tNotelp.getText().toString().equals("") || tTglPesan.getText().toString().equals("") || tRS.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Mohon isi semua data!", Toast.LENGTH_SHORT).show();
                }else {
                    nm = tNama.getText().toString();
                    nik = tNIK.getText().toString();
                    ttl = tTtl.getText().toString();
                    jk = tJK.getText().toString();
                    nt = tNotelp.getText().toString();
                    tglp = tTglPesan.getText().toString();
                    rs = tRS.getText().toString();

                    HashMap<String ,String> qvalues = new HashMap<>();
                    qvalues.put("Nama",nm);
                    qvalues.put("NIK",nik);
                    qvalues.put("Ttl",ttl);
                    qvalues.put("JK",jk);
                    qvalues.put("Notelp",nt);
                    qvalues.put("TglPesan",tglp);
                    qvalues.put("RS",rs);

                    controller.insertData(qvalues);
                    callHome();

                }
            }
        });

    }

    public void callHome(){
        Intent intent = new Intent(form.this,DaftarUser.class);
        startActivity(intent);
        finish();
    }

}
