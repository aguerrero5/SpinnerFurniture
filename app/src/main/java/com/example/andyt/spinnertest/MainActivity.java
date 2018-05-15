package com.example.andyt.spinnertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<FurnitureItem> mFurnitureList;
    private FurnitureAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();

        Spinner spinnerFurniture = findViewById(R.id.spinner_countries);

        mAdapter = new FurnitureAdapter(this, mFurnitureList);
        spinnerFurniture.setAdapter(mAdapter);

        spinnerFurniture.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                FurnitureItem clickedItem = (FurnitureItem) parent.getItemAtPosition(position);
                String clickedFurnitureName = clickedItem.getFurnitureName();
                Toast.makeText(MainActivity.this, clickedFurnitureName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initList() {
        mFurnitureList = new ArrayList<>();
        mFurnitureList.add(new FurnitureItem("Wardrobe", R.drawable.wardrobe));
        mFurnitureList.add(new FurnitureItem("Bed", R.drawable.bed));
        mFurnitureList.add(new FurnitureItem("Washing Machine", R.drawable.washing));
        mFurnitureList.add(new FurnitureItem("Vanity", R.drawable.vanity));
        mFurnitureList.add(new FurnitureItem("Cot", R.drawable.cot));
    }
}
