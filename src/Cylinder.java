/*
Cylinder.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Implements and overrides ThreeDimensionalShape parent class methods to calculate and return volume/area of a cylinder.
 */

import java.util.Scanner;
public class Cylinder extends ThreeDimensionalShape{

    ThreeDimensionalShape shape2 = new ThreeDimensionalShape();
    Scanner scan = new Scanner(System.in);

    @Override
    public void setArea(float area){
        shape2.setArea(area);
    }

    @Override
    public double getArea(){
        return shape2.getArea();
    }


    public void setVolume(float volume){
        shape2.setVolume(volume);
    }

    public double getVolume(){
        return shape2.getVolume();
    }



    public void takeInput(float r){
        System.out.println("Please enter the radius of your cylinder:");
        r = scan.nextFloat();
        System.out.println("Please enter the height of your cylinder:");
        float h = scan.nextFloat();
        float v = (float) ((Math.PI*Math.pow(r, 2))*h);
        shape2.setVolume(v);
        float a = (float) (2*Math.PI*r*h + 2*Math.PI*Math.pow(r, 2));
        shape2.setArea(a);
    }

    public void displayData(){
        System.out.println("The volume of your cylinder is: " + shape2.getVolume() + " and the area is: " + shape2.getArea() + ".");

    }





}
