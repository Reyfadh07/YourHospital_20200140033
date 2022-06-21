package com.example.yourhospital;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.yourhospital.database.databaseuser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class detailpemesanan extends AppCompatActivity {

    TextView txNama, txNik, txTtl,txJK, txNotelp, txTglP, txRS,txid;
    //protected Cursor cursor;
    String snm, snik, sttl, sjk, snt, stglp, srs,sid;
    databaseuser dbuser = new databaseuser(this);
    private ImageView kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailpemesanan);

        txid = findViewById(R.id.tvnoreff);
        txNama = findViewById(R.id.tvNama);
        txNik = findViewById(R.id.tvNik);
        txTtl = findViewById(R.id.tvTanggalLahir);
        txJK = findViewById(R.id.tvTanggalPemesanan);
        txNotelp = findViewById(R.id.tvnotelp);
        txTglP = findViewById(R.id.tvTanggalPemesanan);
        txRS = findViewById(R.id.tvrumahsakit);

        sid = getIntent().getStringExtra("id");
        snm = getIntent().getStringExtra("Nama");
        snik = getIntent().getStringExtra("NIK");
        sttl = getIntent().getStringExtra("Ttl");
        sjk = getIntent().getStringExtra("JK");
        snt = getIntent().getStringExtra("Notelp");
        stglp = getIntent().getStringExtra("TglPesan");
        srs = getIntent().getStringExtra("RS");

        setTitle("Detail Pemesanan");
        txid.setText(sid);
        txNama.setText(snm);
        txNik.setText(snik);
        txTtl.setText(sttl);
        txJK.setText(sjk);
        txNotelp.setText(snt);
        txTglP.setText(stglp);
        txRS.setText(srs);

        kembali = (ImageView) findViewById(R.id.dpback);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detailpemesanan.this,DaftarUser.class);
                startActivity(intent);
            }
        });



    }

}