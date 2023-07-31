/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author chm
 */
public class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    //getters and setters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //methods
    @Override
    public double calculateArea() {
        double area = (getRadius()*getRadius())*3.14;
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double perimeter = 2*3.14*getRadius();
        return perimeter;
    }
    
}
