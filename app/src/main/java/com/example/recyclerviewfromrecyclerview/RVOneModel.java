package com.example.recyclerviewfromrecyclerview;

public class RVOneModel {
    // this variable will store main-list item title
    private String name;
    // this will help differentiate between the main-list items
    private int num;

    // parameterized constructor
    public RVOneModel(String name, int num) {
        this.name = name;
        this.num = num;
    }

    // getter functions for these two variables
    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
}
