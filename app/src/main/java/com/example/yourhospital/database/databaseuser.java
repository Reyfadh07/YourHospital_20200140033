package com.example.yourhospital.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;

public class databaseuser extends SQLiteOpenHelper {
    public databaseuser(Context context) {
        super(context, "DatabaseUserRS", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table userrs (id integer primary key, Nama text, NIK text, Ttl text, JK text, Notelp text, TglPesan text, RS text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists userrs");
        onCreate(db);

    }

    public void insertData(HashMap<String,String> queryValues){
        SQLiteDatabase basisdata = this.getWritableDatabase();
        ContentValues nilai = new ContentValues();
        nilai.put("Nama",queryValues.get("Nama"));
        nilai.put("NIK",queryValues.get("NIK"));
        nilai.put("Ttl",queryValues.get("Ttl"));
        nilai.put("JK",queryValues.get("JK"));
        nilai.put("Notelp",queryValues.get("Notelp"));
        nilai.put("TglPesan",queryValues.get("TglPesan"));
        nilai.put("RS",queryValues.get("RS"));
        basisdata.insert("userrs",null,nilai);
        basisdata.close();
    }

    public void UpdateData(HashMap<String,String> queryValues){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues nilai = new ContentValues();
        nilai.put("Nama",queryValues.get("Nama"));
        nilai.put("NIK",queryValues.get("NIK"));
        nilai.put("Ttl",queryValues.get("Ttl"));
        nilai.put("JK",queryValues.get("JK"));
        nilai.put("Notelp",queryValues.get("Notelp"));
        nilai.put("TglPesan",queryValues.get("TglPesan"));
        nilai.put("RS",queryValues.get("RS"));
        db.update("userrs", nilai,"id=?",new String[]{queryValues.get("id")});
        db.close();
    }

    public void DeleteData(HashMap<String,String> queryValue){
        SQLiteDatabase db = getWritableDatabase();
        db.delete("userrs","id=?",new String[]{queryValue.get("id")});
        db.close();
    }

    public ArrayList<HashMap<String,String>> getAllUser(){
        ArrayList<HashMap<String,String>> daftarUser;
        daftarUser = new ArrayList<>();
        String selectQuery = "Select * from userrs";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if(cursor.moveToFirst()){
            do {
                HashMap<String,String> map = new HashMap<>();
                map.put("id", cursor.getString(0));
                map.put("Nama", cursor.getString(1));
                map.put("NIK", cursor.getString(2));
                map.put("Ttl", cursor.getString(3));
                map.put("JK", cursor.getString(4));
                map.put("Notelp", cursor.getString(5));
                map.put("TglPesan", cursor.getString(6));
                map.put("RS", cursor.getString(7));
                daftarUser.add(map);
            }while (cursor.moveToNext());
        }
        db.close();
        return daftarUser;
    }

}