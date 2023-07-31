package com.mycompany.practical01q5;

public class Practical01q5 {

    public static void main(String[] args) {
        char grade = 'A';
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
 




    //without break
       System.out.println("\n");
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
        
        
        
        
     //using if-else-if statement
      System.out.println("\n");
        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'D') {
            System.out.println("You passed");
        } else if (grade == 'F') {
            System.out.println("Better try again");
        } else {
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
