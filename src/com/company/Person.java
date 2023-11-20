package com.company;

public class Person {
    public String name, address;
    public int age;

    Person(String name, String address, int age) {
        this.name=name;
        this.address=address;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
