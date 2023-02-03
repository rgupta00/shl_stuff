package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "magician")
 public class Magician {
	
    public String doMagic(){
        System.out.println("abra ka dabra...");
        
        return "rat from the hat";
      
    }
    
    public void doEat(){
        System.out.println("eating the food...");
       
    }
    
}