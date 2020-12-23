package com.hardsoftday.vacationtourapp.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hardsoftday.vacationtourapp.R;
import com.hardsoftday.vacationtourapp.models.RecentsData;

import java.util.List;

public class RecentsDataAdapter  extends RecyclerView.Adapter<RecentsDataAdapter.RecentsViewHolder> {

    Context context;
    List<RecentsData> recentsDataList;

    public RecentsDataAdapter(Context context, List<RecentsData> recentsDataList) {
        this.context = context;
        this.recentsDataList = recentsDataList;
    }

    @NonNull
    @Override
    public RecentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recents_rows_item, parent, false);

        return new RecentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentsViewHolder holder, int position) {
        holder.countryName.setText(recentsDataList.get(position).getCountryName());
        holder.placeName.setText(recentsDataList.get(position).getPlaceName());
        holder.price.setText(recentsDataList.get(position).getPrice());
        holder.placeImage.setImageResource(recentsDataList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return recentsDataList.size();
    }


    public static final class RecentsViewHolder extends RecyclerView.ViewHolder {

        ImageView placeImage;
        TextView countryName, placeName, price;

        public RecentsViewHolder(@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.placeImagen);
            countryName = itemView.findViewById(R.id.countryName);
            placeName = itemView.findViewById(R.id.placeName);
            price = itemView.findViewById(R.id.price);


        }
    }
}
