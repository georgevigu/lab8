package com.company;

public class Rectangle extends Shape{
    int length, width;

    Rectangle(int length, int width) {
        this.length=length;
        this.width=width;
    }

    public double calculateArea() {
        return this.length*this.width;
    }
}
