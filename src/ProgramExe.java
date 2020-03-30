/*
ProgramExe.java
Created By: Devin Norwood
Date: 29 March 2020
Purpose: Implements run method which presents user with a menu to choose which shape to construct and prompts for parameters to calculate.
 */


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class ProgramExe {

    Scanner scan = new Scanner(System.in);
    Rectangle rect = new Rectangle();
    Triangle tr = new Triangle();
    Circle cr = new Circle();
    Square sq = new Square();
    Sphere sp = new Sphere();
    Cube cb = new Cube();
    Cone cn = new Cone();
    Cylinder cy = new Cylinder();
    Torus tor = new Torus();
    //String quit = "n";




        public void run() {
           char quit = 'n';
           String input;

            while ((quit != 'y') && (quit == 'n')){


                try {

                    System.out.println("Select the shape you want to construct:");
                    System.out.println("1: Rectangle");
                    System.out.println("2: Triangle");
                    System.out.println("3: Circle");
                    System.out.println("4: Square");
                    System.out.println("5: Sphere");
                    System.out.println("6: Cube");
                    System.out.println("7: Cone");
                    System.out.println("8: Cylinder");
                    System.out.println("9: Torus");
                    System.out.println("10: Exit the program");

                    int selection = scan.nextInt();


                    switch (selection) {
                        case 1:
                            rect.takeInput(1, 1);
                            rect.displayData();
                            break;

                        case 2:
                            tr.takeInput(1, 1);
                            tr.displayData();
                            break;

                        case 3:
                            cr.takeInput(1);
                            cr.displayData();
                            break;
                        case 4:
                            sq.takeInput(1);
                            sq.displayData();
                            break;
                        case 5:
                            sp.takeInput(1);
                            sp.displayData();
                            break;
                        case 6:
                            cb.takeInput(1);
                            cb.displayData();
                            break;
                        case 7:
                            cn.takeInput(1);
                            cn.displayData();
                            break;
                        case 8:
                            cy.takeInput(1);
                            cy.displayData();
                            break;
                        case 9:
                            tor.takeInput(1);
                            tor.displayData();
                            break;
                        case 10:
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM 'at' HH:mm a");
                            LocalDateTime now = LocalDateTime.now();
                            System.out.println("Thank you for using this program.");
                            System.out.println("Today is " + dtf.format(now));
                            break;
                        default:
                            System.out.println("Please enter a valid option.");
                            break;
                    }//end switch statement
                }//end try block
                catch (InputMismatchException e) {
                    //e.printStackTrace();
                    System.out.println("Not a valid choice. Please choose a valid option.");
                }//end catch
                catch (Exception e) {
                    e.printStackTrace();
                    throw e;
                }//end catch
            /*finally{
                scan.close();
            }*/


           System.out.println("Would you like to quit y/n?");
           input = scan.next().toLowerCase();
           quit = input.charAt(0);
           if(quit == 'y'){
               DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM 'at' HH:mm a");
               LocalDateTime now = LocalDateTime.now();
               System.out.println("Thank you for using this program.");
               System.out.println("Today is " + dtf.format(now));
               scan.close();
           }//end if statement

                /* if(quit != 'y' && quit != 'n'){
                    System.out.println("Please select either y or n");
                }*/

        }//end while statement

        }//end run method


}//end class
