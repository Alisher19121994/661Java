package com.example.a661java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1, recyclerView2, recyclerView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data_1();
        data_2();
        data_3();
    }

    void data_1() {
        recyclerView1 = findViewById(R.id.main_recyclerview_id);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<Hor_0> list = new ArrayList<>();
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        list.add(new Hor_0("fRIEND", R.drawable.rasm));
        Adapter_H adapter_h = new Adapter_H(list, this);
        recyclerView1.setAdapter(adapter_h);


    }

    void data_2() {
        recyclerView2 = findViewById(R.id.main_recyclerview_2_id);
        recyclerView2.setLayoutManager(new GridLayoutManager(this, 2));
        ArrayList<G_1> list = new ArrayList<>();
        list.add(new G_1(R.drawable.s1));
        list.add(new G_1(R.drawable.s2));
        list.add(new G_1(R.drawable.s1));
        list.add(new G_1(R.drawable.s2));
        list.add(new G_1(R.drawable.s1));
        list.add(new G_1(R.drawable.s2));
        Adapter_G_1 adapter_g_1 = new Adapter_G_1(list, this);
        recyclerView2.setAdapter(adapter_g_1);
    }

    void data_3() {
        recyclerView3 = findViewById(R.id.main_recyclerview_3_id);
        recyclerView3.setLayoutManager(new GridLayoutManager(this, 2));
        ArrayList<G_2> list = new ArrayList<>();
        list.add(new G_2(R.drawable.c2));
        list.add(new G_2(R.drawable.c2));
        list.add(new G_2(R.drawable.c3));
        list.add(new G_2(R.drawable.c4));
        list.add(new G_2(R.drawable.c2));
        list.add(new G_2(R.drawable.c5));
        list.add(new G_2(R.drawable.c2));

        Adapter_G_2 adapter_g_2 = new Adapter_G_2(list, this);
        recyclerView3.setAdapter(adapter_g_2);
    }
}