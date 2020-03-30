/*
TwoDimensionalShape.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Creates a parent TwoDimensionalShape class as a template for modeling fields and methods to be used with 2D shape objects.
 */

public class TwoDimensionalShape extends Shape{

  private double base;
  private double height;
  private double area;

    @Override
    public void setNumDimensions(int num) {
        super.setNumDimensions(2);
    }

    public void setBase(double base){
      this.base = base;
  }
  public double getBase(){
      return base;
  }


    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    public void setArea(){

    }

    public void setArea(double area){


    }

    public double getArea(){
    return area;
    }


    public double takeInput(double b, double h){
System.out.println("Please enter the parameters of your shape: ");
area = b*h;
return area;
    }


}