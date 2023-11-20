package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println("Problema 1");
        Person persoana = new Person("Marcel", "Strada Iuliu Maniu 4", 21);

        String x=persoana.getName();
        String y=persoana.getAddress();
        int z=persoana.getAge();

        System.out.println("Nume = " + x);
        System.out.println("Adresa = " + y);
        System.out.println("Varsta = " + z);


        //2
        System.out.println("Problema 2");
        Circle cerc = new Circle(8);
        double arie1=cerc.calculateArea();

        Rectangle dreptunghi = new Rectangle(12, 14);
        double arie2=dreptunghi.calculateArea();

        System.out.println("Arie cerc = " + arie1);
        System.out.println("Arie dreptunghi = " + arie2);


        //3
        System.out.println("Problema 3");
        Triangle triunghi = new Triangle();
        Square patrat = new Square();

        ArrayList<Shape> forme = new ArrayList<Shape>();

        forme.add(cerc);
        forme.add(triunghi);
        forme.add(patrat);

        for(int i=0; i<forme.size(); i++) {
            forme.get(i).draw();
        }


        //4
        System.out.println("Problema 4");
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);
        double balance = bankAccount.getBalance();
        System.out.println("\nSoldul contului este " + balance);

        //5
        System.out.println("Problema 5");
        Car masina = new Car();
        Motorcycle motocicleta = new Motorcycle();
        masina.start();
        motocicleta.start();
        masina.stop();
        motocicleta.stop();
    }
}
