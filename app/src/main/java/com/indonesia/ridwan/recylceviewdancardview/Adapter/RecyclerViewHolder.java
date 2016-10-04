package com.indonesia.ridwan.recylceviewdancardview.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.indonesia.ridwan.recylceviewdancardview.R;

/**
 * Created by hasanah on 7/10/16.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    //ViewHolder akan mendeskripsikan item view yang di tempatkan di dalam RecyclerView

    TextView tv1,tv2; // deklarasi texview
    ImageView imageView; //deklarasi ImageView

    public RecyclerViewHolder (View itemView){
        super(itemView);

        tv1 = (TextView) itemView.findViewById(R.id.daftar_judul);
        //menampilkan text dari widget CardVIew pada id daftar_judul
        tv2 = (TextView) itemView.findViewById(R.id.daftar_deskripsi);
        //menampilakn text dsekripsi dari widget CardView pada is daftar_deskrpsi
        imageView = (ImageView)itemView.findViewById(R.id.daftar_icon);
        //menmpilkan gambar atau icon pada widget CardVIew pada id daftar_icon
    }
}
