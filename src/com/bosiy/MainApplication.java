package com.bosiy;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные: ");

        System.out.println("Radius: ");
        double radius = scanner.nextDouble();

        System.out.println("Triangle side: ");
        double triangleSide = scanner.nextDouble();
        System.out.println("Triangle height: ");
        double triangleH = scanner.nextDouble();

        System.out.println("Rectangle side a: ");
        double rectangleSideA = scanner.nextDouble();
        System.out.println("Rectangle side b: ");
        double rectangleSideB = scanner.nextDouble();


        Shape[] array = new Shape[3];

        array[0] = new Circle(radius);
        array[1] = new Triangle(triangleSide,triangleH);
        array[2] = new Rectangle(rectangleSideA, rectangleSideB);


        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i].area());
        }

    }
}
