package com.company;

public class Car extends Vehicle{

    @Override
    public void start() {
        System.out.println("Masina porneste brbrbr");
    }

    @Override
    public void stop() {
        System.out.println("Masina se opreste");
    }

}
