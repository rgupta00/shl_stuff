package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "magician")
 public class Magician {
	
    public void doMagic(){
        System.out.println("abra ka dabra...");
      
    }
    
    public String flyBird(){
        System.out.println("let fly the birds..."); 
        return "parrot";
    }
    
    
    public void doEat(){
        System.out.println("eating the food...");
       
    }
    
}