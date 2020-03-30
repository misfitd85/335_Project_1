/*
Square.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Implements and overrides TwoDimensionalShape parent class methods to calculate and return area of a Square.
 */
import java.util.Scanner;

public class Square extends TwoDimensionalShape {

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

    //@Override
    public double takeInput(double s) {
        System.out.println("Enter a side of your square: ");
        s =  scan.nextDouble();
       // System.out.println("Enter the height of your Square: ");
       // h = scan.nextDouble();

        shape1.setBase(s);
       // shape1.setHeight(h);


        area = (s * s);
        //System.out.println("The area of your square is: "+ area);
        return area;
    }


    public void displayData(){
        System.out.println("The area of your square is: " + area);
    }

}
