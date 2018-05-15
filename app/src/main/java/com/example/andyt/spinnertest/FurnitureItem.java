package com.example.andyt.spinnertest;

public class FurnitureItem {
    private String mFurnitureName;
    private int mFurnitureImage;

    public FurnitureItem(String furnitureName, int furnitureImage) {
        mFurnitureName = furnitureName;
        mFurnitureImage = furnitureImage;
    }

    public String getFurnitureName() {
        return mFurnitureName;
    }

    public int getFurnitureImage() {
        return mFurnitureImage;
    }
}