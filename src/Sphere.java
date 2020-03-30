/*
Sphere.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Implements and overrides ThreeDimensionalShape parent class methods to calculate and return volume/area of a Sphere.
 */

import java.util.Scanner;
public class Sphere extends ThreeDimensionalShape{

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
        System.out.println("Please enter the radius of your sphere:");
        r = scan.nextFloat();
        float v = (float) ((4*Math.PI*Math.pow(r, 3))/3);
        shape2.setVolume(v);
        float a = (float) (4*3.14*Math.pow(r,2));
        shape2.setArea(a);
    }

    public void displayData(){
       System.out.println("The volume of your sphere is: " + shape2.getVolume() + " and the area is: " + shape2.getArea() + ".");

    }





}
