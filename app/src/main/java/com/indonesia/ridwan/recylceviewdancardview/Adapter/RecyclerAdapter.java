package com.indonesia.ridwan.recylceviewdancardview.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.indonesia.ridwan.recylceviewdancardview.R;

/**
 * Created by hasanah on 7/10/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{

    //deklarasi variable context
    private final Context context;

    String[] name = {"Apple","Facebook","Twitter","Google",
    "Microsoft","Wikipedia","Yahoo","Youtube"};
    //menampilkan list item dalambentuk tect dengan tipe data string dengan variable name

    LayoutInflater inflater;
    public RecyclerAdapter(Context context){
        this.context= context;
        inflater = LayoutInflater.from(context);
    }

    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent , int viewType){
        View v = inflater.inflate(R.layout.item_list,parent,false);
        RecyclerViewHolder viewHolder =  new RecyclerViewHolder(v);
        return viewHolder;
    }

    public void onBindViewHolder(RecyclerViewHolder holder, int position){

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);
    }

    View.OnClickListener clickListener = new View.OnClickListener(){

        public void onClick(View v){
            //member aksi saat cadrview di klik berdasarkan posisi tertentu
            RecyclerViewHolder vHolder = (RecyclerViewHolder) v.getTag();
            int position = vHolder.getPosition();

            Toast.makeText(context,"Menu ini berada di posisi" + position,Toast.LENGTH_SHORT).show();
        }
    };

    public int getItemCount(){
        return name.length;
    }
}
