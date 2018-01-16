/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_07_circle_class;

import java.util.Scanner;
/**
 *
 * @author aeiou
 */
public class JAVA_PRG_06_07_Circle_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String strTemp;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        System.out.println("Please enter a radius:");
        strTemp = scrKeyboard.nextLine();
        
        Circle circle = new Circle(Double.parseDouble(strTemp));
        
        System.out.println("With a radius of " + Double.parseDouble(strTemp));
        System.out.println("the circle's diameter is " + circle.getDiameter());
        System.out.println("the circumference is " + circle.getCircumference());
        System.out.println("the area is " + circle.getArea());
        
    }
    
}
