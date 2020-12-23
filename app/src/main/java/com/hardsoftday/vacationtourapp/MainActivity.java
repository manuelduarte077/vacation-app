package com.hardsoftday.vacationtourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.vacationtourapp.adapter.RecentsDataAdapter;
import com.hardsoftday.vacationtourapp.adapter.TopPlacesAdapter;
import com.hardsoftday.vacationtourapp.models.RecentsData;
import com.hardsoftday.vacationtourapp.models.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsDataAdapter recentsDataAdapter;
    TopPlacesAdapter topPlacesAdapter;

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
        recentsDataList.add(new RecentsData("Cocibolca Lake", "Rivas", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Isla Ometepe", "Granada", "From $150", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Cocibolca Lake", "Rivas", "From $200", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Isla Ometepe", "Granada", "From $150", R.drawable.recentimage2));
        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        topPlacesDataList.add(new TopPlacesData("Cocibolca Lake", "Rivas", "$400 - $200", R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Isla Ometepe", "Granada", "$800 - $150", R.drawable.recentimage2));
        setTopPlacesRecycler(topPlacesDataList);

    }

    private void setRecentRecycler(List<RecentsData> recentsDataList) {

        recentRecycler = findViewById(R.id.recents_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsDataAdapter = new RecentsDataAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsDataAdapter);

    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList) {

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }

}