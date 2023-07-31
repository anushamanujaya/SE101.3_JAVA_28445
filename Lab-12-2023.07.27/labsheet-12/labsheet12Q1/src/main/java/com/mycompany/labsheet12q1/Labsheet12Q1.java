
package com.mycompany.labsheet12q1;

public class Labsheet12Q1 {

    public static void main(String[] args) {
        
    
        while(true){
              RedLightThread rt = new RedLightThread();
              rt.run();
              
              YellowLightThread yt = new YellowLightThread();
             yt.run();
              
              GreenLightThread gt = new GreenLightThread();
              gt.run();
            }
        }
    }

       
    

