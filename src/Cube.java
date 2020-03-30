/*
Cube.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Implements and overrides ThreeDimensionalShape parent class methods to calculate and return volume/area of a Cube.
 */

import java.util.Scanner;
public class Cube extends ThreeDimensionalShape{

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
        System.out.println("Please enter the value of an edge of your cube:");
        r = scan.nextFloat();
        float v = (float) Math.pow(r, 3);
        shape2.setVolume(v);
        float a = (float) (6*Math.pow(r, 2));
        shape2.setArea(a);
    }

    public void displayData(){
        System.out.println("The volume of your cube is: " + shape2.getVolume() + " and the area is: " + shape2.getArea() + ".");

    }





}
