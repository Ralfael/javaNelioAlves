package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre the measures of triangle X ");
        x.a = sc.nextDouble(); // 3.00
        x.b = sc.nextDouble(); //4.00
        x.c = sc.nextDouble(); //5.00
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble(); //7.50
        y.b = sc.nextDouble(); //4.50
        y.c = sc.nextDouble(); //4.02

        double p = (x.a + x.b + x.c ) /2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c ) /2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Area of X: %.2f%n", areaX);
        System.out.printf("Area of Y: %.2f%n", areaY);


    }

}
