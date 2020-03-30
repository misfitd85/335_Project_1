/*
ThreeDimensionalShape.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Creates a parent ThreeDimensionalShape class as a template for modeling fields and methods to be used with 3D shape objects.
 */


public class ThreeDimensionalShape extends Shape {

    private double area;
    private double volume;


    @Override
    public void setNumDimensions(int num) {
        super.setNumDimensions(3);
    }

    @Override
    public void setArea(){

    }


    public void setArea(float area){
        this.area = area;
    }

    @Override
    public double getArea(){
        return area;
    }


    public void setVolume(float volume){
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }


    public void takeInput(float v){
        System.out.println("Please enter the values of your shape:");
        setVolume(v);
        setArea(v);
    }

    public void displayData(){
        System.out.println("The volume of your shape is: " + volume + " and the area is: " + area + ".");

    }










    //method getInput for taking requirements from users

    //method to perform calculation of input for volume

    //method displayVolume for outputting input from users


}
