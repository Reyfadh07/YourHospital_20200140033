package com.example.yourhospital.adapter;

import  android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.yourhospital.DaftarUser;
import com.example.yourhospital.MainActivity;
import com.example.yourhospital.R;
import com.example.yourhospital.database.databaseuser;
import com.example.yourhospital.database.datauser;
import com.example.yourhospital.detailpemesanan;
import com.example.yourhospital.editform;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
    private ArrayList<datauser> listData;
    private Context control;

    public UserAdapter(ArrayList<datauser> listData) {
        this.listData = listData;
    }

    @Override
    public UserAdapter.UserViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInf = LayoutInflater.from(parent.getContext());
        View view = layoutInf.inflate(R.layout.row_data_user,parent,false);
        control = parent.getContext();
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder( UserAdapter.UserViewHolder holder, int position) {
        String nik,nm,ttl,tglp,jk, nt, rs, id;


        id = listData.get(position).getId();
        nm = listData.get(position).getNama();
        nik = listData.get(position).getNIK();
        ttl = listData.get(position).getTtl();
        jk = listData.get(position).getJK();
        nt = listData.get(position).getNotelp();
        tglp = listData.get(position).getTglPesan();
        rs = listData.get(position).getRS();
        databaseuser db = new databaseuser(control);


        holder.namaTxt.setTextColor(Color.BLUE);
        holder.namaTxt.setTextSize(30);
        holder.namaTxt.setText(nm);
        holder.nikTxt.setText(nik);
        holder.ttlTxt.setText(ttl);
        holder.jkTxt.setText(jk);
        holder.ntTxt.setText(nt);
        holder.tglpTxt.setText(tglp);
        holder.rsTxt.setText(rs);

        holder.cardku.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                PopupMenu popupMenu = new PopupMenu(control, holder.cardku);
                popupMenu.inflate(R.menu.menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.ppdetail:
                                Intent i = new Intent (control, detailpemesanan.class);
                                i.putExtra("id",id);
                                i.putExtra("Nama",nm);
                                i.putExtra("NIK",nik);
                                i.putExtra("Ttl",ttl);
                                i.putExtra("JK",jk);
                                i.putExtra("Notelp",nt);
                                i.putExtra("TglPesan",tglp);
                                i.putExtra("RS",rs);
                                control.startActivity(i);
                                break;
                            case R.id.ppedit:
                                Intent j = new Intent (control, editform.class);
                                j.putExtra("id",id);
                                j.putExtra("Nama",nm);
                                j.putExtra("NIK",nik);
                                j.putExtra("Ttl",ttl);
                                j.putExtra("JK",jk);
                                j.putExtra("Notelp",nt);
                                j.putExtra("TglPesan",tglp);
                                j.putExtra("RS",rs);
                                control.startActivity(j);
                                break;
                            case R.id.ppHapus:
                                HashMap<String,String> values = new HashMap<>();
                                values.put("id",id);
                                db.DeleteData(values);
                                Intent h = new Intent(control, DaftarUser.class);
                                control.startActivity(h);
                                break;
                        }
                        return true;
                    }
                });
                popupMenu.show();
                return false;
            }
        });


    }

    @Override
    public int getItemCount() {
        return (listData != null)?listData.size() : 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private CardView cardku;
        private TextView namaTxt,nikTxt,ttlTxt,jkTxt,ntTxt,tglpTxt,rsTxt;
        public UserViewHolder(View view) {
            super(view);
            cardku = (CardView) itemView.findViewById(R.id.kartuku);
            namaTxt = (TextView) view.findViewById(R.id.textNama);
            nikTxt = (TextView) view.findViewById(R.id.textNIK);
            ttlTxt = (TextView) view.findViewById(R.id.textTtl);
            jkTxt = (TextView) view.findViewById(R.id.textJK);
            ntTxt = (TextView) view.findViewById(R.id.textNotelp);
            tglpTxt = (TextView) view.findViewById(R.id.textTglPesan);
            rsTxt = (TextView) view.findViewById(R.id.textRS);
        }
    }
}
