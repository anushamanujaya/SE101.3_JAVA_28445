/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;

/**
 *
 * @author chm
 */
public class Question1 {

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(11111,20000000);
       CheckingAccount c = new CheckingAccount(22222,1000000);
       System.out.println("Savings Account Interest : "+s.calculateInterest());
       System.out.println("Checking Account Interest : "+c.calculateInterest());
    }
}
