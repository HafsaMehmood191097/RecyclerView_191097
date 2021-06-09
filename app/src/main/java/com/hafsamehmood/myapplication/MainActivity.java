package com.hafsamehmood.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    LinearLayoutManager layoutmanager;
    Adapter adapter;
    List<Model> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Define ActionBar object
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FFFF66"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(Html.fromHtml("<font color='#101010'>MealSwish </font>"));

        InitiateData();
        InitiateRecyclerView();
    }

    private void InitiateRecyclerView() {
        recyclerview=findViewById(R.id.recyclerview);
        layoutmanager=new LinearLayoutManager(this);
        layoutmanager.setOrientation(RecyclerView.VERTICAL);
        recyclerview.setLayoutManager(layoutmanager);
        adapter=new Adapter(list);
        recyclerview.setAdapter(adapter);
        recyclerview.setHasFixedSize(true);
        adapter.notifyDataSetChanged();
    }

    private void InitiateData() {
        list=new ArrayList<>();
        list.add(new Model(R.drawable.turkeysandwitch,R.drawable.star3olter,R.drawable.ic_baseline_delete_24,"Turkish SandWich","FastFood : Rs 270","Reviews 53","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.tawafry,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Tawa Fry","FastFood : Rs 450","Reviews 62","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.madhuvan,R.drawable.star3olter,R.drawable.ic_baseline_delete_24,"Madhuvaan","FastFood : Rs 330","Reviews 55","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.hakkanoodles,R.drawable.star3olter,R.drawable.ic_baseline_delete_24,"Hakka Noodles","FastFood : Rs 450","Reviews 54","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.grossingpizza,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Grossing Pizza","FastFood : Rs 550","Reviews 56","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.grilledsandwich,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Grilled Sadwich","FastFood : Rs 350","Reviews 67","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.ginospizza,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Ginos Pizza","FastFood : Rs 650","Reviews 71","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.fridechicks,R.drawable.star3olter,R.drawable.ic_baseline_delete_24,"Fried Chicks","FastFood : Rs 570","Reviews 58","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.friedchicken,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Fried Chicken","FastFood : Rs 810","Reviews 74","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.burger,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Chicken Burger","FastFood : Rs 250","Reviews 70","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.madhuvan,R.drawable.star3olter,R.drawable.ic_baseline_delete_24,"Madhuvaan","FastFood : Rs 330","Reviews 55","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.hakkanoodles,R.drawable.star3olter,R.drawable.ic_baseline_delete_24,"Hakka Noodles","FastFood : Rs 450","Reviews 54","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.grossingpizza,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Grossing Pizza","FastFood : Rs 550","Reviews 56","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.grilledsandwich,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Grilled Sadwich","FastFood : Rs 350","Reviews 67","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.ginospizza,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Ginos Pizza","FastFood : Rs 650","Reviews 71","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.fridechicks,R.drawable.star3olter,R.drawable.ic_baseline_delete_24,"Fried Chicks","FastFood : Rs 570","Reviews 58","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.friedchicken,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Fried Chicken","FastFood : Rs 810","Reviews 74","_________________________________________________________________________________________________________________________________________________"));
        list.add(new Model(R.drawable.burger,R.drawable.reviewstrs,R.drawable.ic_baseline_delete_24,"Chicken Burger","FastFood : Rs 250","Reviews 70","_________________________________________________________________________________________________________________________________________________"));

    }
}