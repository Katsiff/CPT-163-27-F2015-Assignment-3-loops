package assignment3.loops.siffrinn;

import java.util.Scanner;   //needed for the Scanner class

//This program will show the reverse of a word

public class Assignment3LoopsSiffrinn {
  
    public static void main(String[] args) {
 
        String origWord;    //original word
        
       Scanner keyboard = new Scanner(System.in); //initialize the scanner
        
        //Let's user choose a word and stores it in the variable origWord
        System.out.println("Pick a word with at least 5 letters.\n");
        origWord = keyboard.nextLine();
        
        //line space used for better output
         System.out.print("\nThe reverse of your word is ");
         
        //to reverse the word
        for(int i = 1; i <origWord.length()+1; i++){
         
        //to print the reversed word
        System.out.print(origWord.charAt(origWord.length()-i));
          
        }
        
        
        
        
                
        
        
    }
    
}
