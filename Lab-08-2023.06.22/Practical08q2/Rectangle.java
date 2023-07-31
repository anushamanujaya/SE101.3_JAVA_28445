/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author chm
 */
public class Rectangle implements Shape{
    private int length;
    private int height;
    public Rectangle(int length,int height){
        this.length = length;
        this.height = height;
    }
    //getters and setters
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    //methods
    @Override
    public double calculateArea() {
        double area = getLength()*getHeight();
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double perimeter = (getLength()*2)+(getHeight()*2);
        return perimeter;
    }
    
}
