package com.company;

import java.util.Scanner;

public class Circle {
    private double PI;


    void setPI(double PI) {
        this.PI = PI;
        area();
        circumference();
    }

    double getPI() {
        return PI;
    }

    public static void  area() {
        Scanner scanner = new Scanner(System.in);
        double area;
        System.out.println("Input a radius: ");
        int radius = scanner.nextInt();
        area = Math.PI * (radius * radius);
        System.out.println("Area of the circle is: " + area);
    }

    public static void circumference() {
        Scanner scanner = new Scanner(System.in);
        double circumference;
        System.out.println("\nInput a radius: ");
        int radius = scanner.nextInt();
        circumference = Math.PI * 2 * radius;
        System.out.println("Circumference of the circle is: " + circumference);

    }
}

