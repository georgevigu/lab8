package com.company;

public class Motorcycle extends Vehicle{

    @Override
    public void start() {
        System.out.println("Motocicleta porneste vrum vrum");
    }

    @Override
    public void stop() {
        System.out.println("Motocicleta se opreste");
    }
}
