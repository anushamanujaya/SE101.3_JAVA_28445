
package com.mycompany.labsheet12q1;

public class RedLightThread extends Thread
{
   public void run(){
         try {
             System.out.println("Red Light");
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         } 
}
}
