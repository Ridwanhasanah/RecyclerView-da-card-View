package com.indonesia.ridwan.recylceviewdancardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.indonesia.ridwan.recylceviewdancardview.Adapter.RecyclerAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menampilkan recyclerview yang ada pada file layout dgn id recyclerview
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        //menampilakn recyclerview yang ada pada file layout

        RecyclerAdapter adapter = new RecyclerAdapter(this);
        //membuat adapter baru untuk recyclerview
        recyclerView.setAdapter(adapter);
        //mensset nilai dari adapter
        recyclerView.setHasFixedSize(true);
        //menset ukuran
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //menset layoutmanager dan menampilkan dafter list
        //dalam bentuk linearlayoutmanager pada class saat ini


    }
}
