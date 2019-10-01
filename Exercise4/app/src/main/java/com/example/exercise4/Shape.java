package com.example.exercise4;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "red";

    public Shape(int x, int y, String color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
}
