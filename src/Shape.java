/*
Shape.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Creates an abstract Shape class, specifying parameters for TwoDimensional and ThreeDimensional Shape objects.
 */


public abstract class Shape {

   private int numDimensions = 0;

    //sets area of the shape, parameters of base/height
   abstract void setArea();

    //getArea method here for all shapes, getVolume for ThreeDimensionalShapes
    abstract double getArea();

    public void setNumDimensions(int num){
        numDimensions = num;
    }

    public int getNumDimensions(){
        return numDimensions;
    }

}//ends Shape parent class
