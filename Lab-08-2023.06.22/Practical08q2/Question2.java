/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

/**
 *
 * @author chm
 */
public class Question2 {

    public static void main(String[] args) {
       Rectangle r = new Rectangle(5,10);
       Circle ci = new Circle(6);
       Triangle t = new Triangle(5,6,4,5);
       System.out.println("Area of Rectangle : "+ r.calculateArea());
       System.out.println("Perimeter of Rectangle : "+ r.calculatePerimeter());
       
       System.out.println("Area of Circle : "+ ci.calculateArea());
       System.out.println("Perimeter of Circle : "+ ci.calculatePerimeter());
       
       System.out.println("Area of Triangle : "+ t.calculateArea());
       System.out.println("Perimeter of Triangle : "+ t.calculatePerimeter());
    }
}
