package com.ossovita.javacountrylist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ossovita.javacountrylist.R;
import com.ossovita.javacountrylist.model.Country;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private ArrayList<Country> countries;

    public RecyclerViewAdapter(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TextView countryNameText = holder.itemView.findViewById(R.id.countryNameText);
        TextView countryRegionText = holder.itemView.findViewById(R.id.countryRegionText);

    }

    @Override
    public int getItemCount() {
        return countries.size();
    }


}
