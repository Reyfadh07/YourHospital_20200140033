package com.example.yourhospital.database;

public class datauser {

    String id;
    String Nama;
    String NIK;
    String Ttl;
    String JK;
    String Notelp;
    String TglPesan;
    String RS;


    public datauser() {
    }

    public datauser(String id, String Nama, String NIK, String Ttl, String JK, String Notelp, String TglPesan, String RS) {
        this.id = id;
        this.Nama = Nama;
        this.NIK = NIK;
        this.Ttl = Ttl;
        this.JK = JK;
        this.Notelp = Notelp;
        this.TglPesan = TglPesan;
        this.RS = RS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getTtl() {
        return Ttl;
    }

    public void setTtl(String Ttl) {
        this.Ttl = Ttl;
    }

    public String getJK() {
        return JK;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }

    public String getNotelp() {
        return Notelp;
    }

    public void setNotelp(String Notelp) {
        this.Notelp = Notelp;
    }

    public String getTglPesan() {
        return TglPesan;
    }

    public void setTglPesan(String TglPesan) {
        this.TglPesan = TglPesan;
    }

    public String getRS() {
        return RS;
    }

    public void setRS(String RS) {
        this.RS = RS;
    }
}