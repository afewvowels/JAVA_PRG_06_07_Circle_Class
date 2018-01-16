/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_07_circle_class;

/**
 * 
 * @author aeiou
 * @param dblRadius Stores the radius of the circle.
 * @param DBL_PI Constant value for PI used in calculations.
 */
public class Circle {
    private double dblRadius;
    
    private final double DBL_PI = 3.14159;
    
    /**
     * Constructor that takes a double value and creates a circle object using
     * that value as the radius.
     * @param radius User input that gets stored as dblRadius (radius value).
     */
    public Circle(double radius) {
        dblRadius = radius;
    }
    
    /**
     * No-argument constructor that creates a circle object and sets the radius
     * to a default value of 0.0.
     */
    public Circle() {
        dblRadius = 0.0;
    }
    
    /**
     * Method used to set the stored radius value (dblRadius) to a new value.
     * @param radius New radius value to store in dblRadius
     */
    public void setRadius(double radius) {
        dblRadius = radius;
    }
    
    /**
     * Method that returns the stored radius value in the circle object.
     * @return 
     */
    public double getRadius() {
        return dblRadius;
    }
    
    /**
     * Uses the stored radius and constant value for pi to return the area of
     * the circle
     * @return 
     */
    public double getArea() {
        return DBL_PI * dblRadius * dblRadius;
    }
    
    /**
     * Uses the stored radius value to calculate and return the diameter of
     * the circle
     * @return 
     */
    public double getDiameter() {
        return dblRadius * 2.0;
    }
    
    /**
     * Returns the circumference of the circle by using the radius and final
     * PI value and calculating the value.
     * @return 
     */
    public double getCircumference() {
        return 2.0 * DBL_PI * dblRadius;
    }
}
