/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author chm
 */
public class Triangle implements Shape{
    private int baseLength;
    private int sideOneLength;
    private int sideTwoLength;
    private int height;
    public Triangle(int sideOneLength,int sideTwoLength,int baseLength,int height){
        this.sideOneLength = sideOneLength;
        this.sideTwoLength = sideTwoLength;
        this.baseLength = baseLength;
        this.height = height;
    }
    //getters and setters
    public int getBaseLength() {
        return baseLength;
    }
    public void setBaseLength(int baseLength) {
        this.baseLength = baseLength;
    }
    public int getSideOneLength() {
        return sideOneLength;
    }
    public void setSideOneLength(int sideOneLength) {
        this.sideOneLength = sideOneLength;
    }
    public int getSideTwoLength() {
        return sideTwoLength;
    }
    public void setSideTwoLength(int sideTwoLength) {
        this.sideTwoLength = sideTwoLength;
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
        double area = getBaseLength()*getHeight()*0.5;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = getBaseLength()+getSideOneLength()+getSideTwoLength();
        return perimeter;       
    }
    
}
