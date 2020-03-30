/*
Circle.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Implements and overrides TwoDimensionalShape parent class methods to calculate and return area of a Circle.
 */

import java.util.Scanner;

public class Circle extends TwoDimensionalShape {

    TwoDimensionalShape shape1 = new TwoDimensionalShape();

    //private double base;
    //private double height;
    private double radius;
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

    //@Override
    public double takeInput(double r) {
        System.out.println("Enter the radius of your Circle: ");
        r =  scan.nextDouble();
        shape1.setBase(r);
        area = 3.14*(r*r);
        //System.out.println("The area of your Circle is: "+ area);
        return area;
    }


    public void displayData(){
        System.out.println("The area of your Circle is: " + area);
    }

}
