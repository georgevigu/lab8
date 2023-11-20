package com.company;
import static java.lang.Math.PI;


public class Circle extends Shape{
        int raza;

        Circle(int raza) {
                this.raza=raza;
        }

        public double calculateArea() {
                return PI*this.raza*this.raza;
        }

        public void draw() {
                System.out.println("\n" +
                        "         , - ~ ~ ~ - ,\n" +
                        "     , '               ' ,\n" +
                        "   ,                       ,\n" +
                        "  ,                         ,\n" +
                        " ,                           ,\n" +
                        " ,                           ,\n" +
                        " ,                           ,\n" +
                        "  ,                         ,\n" +
                        "   ,                       ,\n" +
                        "     ,                  , '\n" +
                        "       ' - , _ _ _ ,  '");
        }

}
