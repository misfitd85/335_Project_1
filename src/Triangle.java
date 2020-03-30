/*
Triangle.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Implements and overrides TwoDimensionalShape parent class methods to calculate and return area of a Triangle.
 */
import java.util.Scanner;

public class Triangle extends TwoDimensionalShape {

    TwoDimensionalShape shape1 = new TwoDimensionalShape();

    private double base;
    private double height;
    private double area;
    Scanner scan = new Scanner(System.in);

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double takeInput(double b, double h) {
        System.out.println("Enter the base of your Triangle: ");
        b =  scan.nextDouble();
        System.out.println("Enter the height of your Triangle: ");
        h = scan.nextDouble();

        shape1.setBase(b);
        shape1.setHeight(h);


        area = (b * h)/2;
        //System.out.println("The area of your triangle is: "+ area);
        return area;
    }


    public void displayData(){
        System.out.println("The area of your triangle is: " + area);
    }

}
