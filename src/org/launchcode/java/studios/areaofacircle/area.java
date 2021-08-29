package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");
        double radius = input.nextDouble();
        double area = circle.getArea(radius);
        System.out.println(area);
    }
}
