/*
Torus.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Implements and overrides ThreeDimensionalShape parent class methods to calculate and return volume/area of a Torus.
 */

import java.util.Scanner;
public class Torus extends ThreeDimensionalShape{


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
        System.out.println("Please enter the major radius of your torus:");
        float r2 = scan.nextFloat();
        System.out.println("Please enter the minor radius of your torus:");
        float r1 = scan.nextFloat();

        if(r1>= r2){
            System.out.println("Invalid input: Make Sure Major Radius > Minor Radius");
            System.exit(0);}

            else{
                float v = (float) ((Math.PI*Math.pow(r1, 2)))*(float) (2*Math.PI*r2);
                shape2.setVolume(v);
                float a = (float) (2*Math.PI*r2) * (float) (2*Math.PI*r1);
                shape2.setArea(a);


        }//end else condition
    }//end takeInput method





    public void displayData(){
        System.out.println("The volume of your torus is: " + shape2.getVolume() + " and the area is: " + shape2.getArea() + ".");

    }





}
