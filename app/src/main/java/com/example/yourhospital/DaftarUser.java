package com.example.yourhospital;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.example.yourhospital.adapter.UserAdapter;
import com.example.yourhospital.database.datauser;
import com.example.yourhospital.database.databaseuser;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;

public class DaftarUser extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private ArrayList<datauser> userArrayList;
    databaseuser controller = new databaseuser(this);
    private ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_user);

        recyclerView = findViewById(R.id.recyclerView);
        btnBack = findViewById(R.id.dfback);
        BacaData();
        adapter = new UserAdapter(userArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarUser.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarUser.this,Opening.class);
                startActivity(intent);
            }
        });
    }

    public void BacaData(){
        ArrayList<HashMap<String,String>> daftarUser = controller.getAllUser();
        userArrayList = new ArrayList<>();
        //memindah dari hasil query ke dalam DaftarUser
        for (int i=0;i<daftarUser.size();i++){
            datauser dv = new datauser();

            dv.setId(daftarUser.get(i).get("id").toString());
            dv.setNama(daftarUser.get(i).get("Nama").toString());
            dv.setNIK(daftarUser.get(i).get("NIK").toString());
            dv.setTtl(daftarUser.get(i).get("Ttl").toString());
            dv.setJK(daftarUser.get(i).get("JK").toString());
            dv.setNotelp(daftarUser.get(i).get("Notelp").toString());
            dv.setTglPesan(daftarUser.get(i).get("TglPesan").toString());
            dv.setRS(daftarUser.get(i).get("RS").toString());
            //pindahkan dari DataVaksin kedalam ArrayList teman di adapter
            userArrayList.add(dv);
        }
    }

}