package com.hardsoftday.vacationtourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.vacationtourapp.adapter.RecentsDataAdapter;
import com.hardsoftday.vacationtourapp.models.RecentsData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler;
    RecentsDataAdapter recentsDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Cocibolca Lake", "Rivas", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Isla Ometepe", "Granada", "From $150", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Cocibolca Lake", "Rivas", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Isla Ometepe", "Granada", "From $150", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Cocibolca Lake", "Rivas", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Isla Ometepe", "Granada", "From $150", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Cocibolca Lake", "Rivas", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Isla Ometepe", "Granada", "From $150", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Cocibolca Lake", "Rivas", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Isla Ometepe", "Granada", "From $150", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Cocibolca Lake", "Rivas", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Isla Ometepe", "Granada", "From $150", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Cocibolca Lake", "Rivas", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Isla Ometepe", "Granada", "From $150", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Cocibolca Lake", "Rivas", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Isla Ometepe", "Granada", "From $150", R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

    }

    private void setRecentRecycler(List<RecentsData> recentsDataList) {

        recentRecycler = findViewById(R.id.recents_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsDataAdapter = new RecentsDataAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsDataAdapter);

    }

}