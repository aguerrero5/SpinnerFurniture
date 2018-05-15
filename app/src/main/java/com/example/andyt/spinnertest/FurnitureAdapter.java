package com.example.andyt.spinnertest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class FurnitureAdapter extends ArrayAdapter<FurnitureItem> {

    public FurnitureAdapter(Context context, ArrayList<FurnitureItem> furnitureList) {
        super(context, 0, furnitureList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.furniture_spinner_row, parent, false
            );
        }

        ImageView imageViewFurniture = convertView.findViewById(R.id.image_view_furniture);
        TextView textViewName = convertView.findViewById(R.id.text_view_name);

        FurnitureItem currentItem = getItem(position);

        if (currentItem != null) {
            imageViewFurniture.setImageResource(currentItem.getFurnitureImage());
            textViewName.setText(currentItem.getFurnitureName());
        }

        return convertView;
    }
}