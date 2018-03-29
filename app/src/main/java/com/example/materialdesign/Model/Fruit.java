package com.example.materialdesign.Model;

/**
 * Created by JackR on 2018/3/29.
 */

public class Fruit {
    private String fruitName;
    private int imageName;

    public Fruit(String fruitName, int imageName){
        this.fruitName = fruitName;
        this.imageName = imageName;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getImageName() {
        return imageName;
    }

    public void setImageName(int imageName) {
        this.imageName = imageName;
    }
}
