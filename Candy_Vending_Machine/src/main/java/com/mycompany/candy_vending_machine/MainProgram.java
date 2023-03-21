
// @author jaleta and I have also worked a lot with Segni,tutors, and Stack Overflow.
// This is the Main Class for the code 
package com.mycompany.candy_vending_machine;

// a few of the imports and that are used in the code
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Scanner;


public class MainProgram {

    public static void main(String[] args) throws CloneNotSupportedException, NumberFormatException, NullPointerException{
     

     NumberFormat formatter = NumberFormat.getCurrencyInstance();
     CandyVendMachine CandyVM = new CandyVendMachine(150.00, new LinkedList<Candy>(), new LinkedList<Candy>(), new LinkedList<Candy>());   
     SodaVendMachine SodaVM = new SodaVendMachine(250.00, new LinkedList<Soda>(), new LinkedList<Soda>(), new LinkedList<Soda>());   
     EverythingVendMachine EverythingVM = new EverythingVendMachine(1000.00, new LinkedList<Candy>(), new LinkedList<Candy>(), new LinkedList<Candy>(), new LinkedList<Soda>(), new LinkedList<Soda>(), new LinkedList<Soda>(), new LinkedList<StarWarsCharacters>(), new LinkedList<StarWarsCharacters>(), new LinkedList<StarWarsCharacters>(), new LinkedList<StarWarsCharacters>(), new LinkedList<StarWarsCharacters>(), new LinkedList<StarWarsCharacters>(), new LinkedList<StarWarsCharacters>(), new LinkedList<StarWarsCharacters>(), new LinkedList<StarWarsCharacters>(), new LinkedList<StarWarsCharacters>(), new LinkedList<StarWarsCharacters>());   
                   
     // we set the initial quantities to null
    Double Price = 0.0;
    int Quantity = 0; 
    String userInput = "";
    
       Scanner input = new Scanner(System.in); 
        while (!userInput.toUpperCase().equals("Q")){
       
            // this is the main menu for the vending machine
        
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("                             MAIN  MENU                                  ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("           Below are the options for the vending categories              ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("                Type A. for the  Candy Vending Machine.                  ");
            System.out.println("                Type B. for the Soda Vending Machine.                    ");
            System.out.println(" Type C. to vend all the items (some cool starwar toys are even included)");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("                                                         Press Q. to Quit");
        
        // the switch statements below takes the users input and takes them to the vending machine they are asking for
            
        userInput = input.nextLine().toUpperCase().trim();
        
        switch (userInput) {
            
                // Candy Vending Machine
                case "A":
                    
                    
                    String slotCode="";
                    
                    
                    while (!slotCode.equals("Q")){
                        
                        
                        CandyVM.DisplayContents();
                        System.out.println("                                    Press Q. to Go back to the main screen");       
                        slotCode=input.nextLine().trim().toUpperCase();
                       
                        CandyVendMachine.VendInstructions(slotCode, Price, Quantity, CandyVM, formatter);  
                    }
                    break;
                 
                // Soda Vending Machine    
                case "B":

                    slotCode="";
                    
                    
                    while (!slotCode.equals("Q")){
                        
                     
                        SodaVM.DisplayContents();
                        System.out.println("                                    Press Q. to Go back to the main screen");
                        slotCode=input.nextLine().trim().toUpperCase();
                        
                       
                        
                        SodaVendMachine.VendInstructions(slotCode, Price, Quantity, SodaVM, formatter); 
                    }                    
                    break;
                    
                  // Everything Vending Machine
                  case "C":
                    
                    slotCode="";
                    
                 
                    while (!slotCode.equals("Q")){
                        
                        // Displaying the contents of the machine
                        EverythingVM.DisplayContents();
                        System.out.println("                                    Press Q. to Go back to the main screen");
                        slotCode=input.nextLine().trim().toUpperCase();
                        
                      
                        
                        EverythingVendMachine.vendItemInMachine(Price, Quantity, EverythingVM, formatter, slotCode); 
                    }
                    
                    break;  
 
                case "Q":
                    System.out.println("Have a great day!");
                    System.exit(0);
                default:
                    System.out.println("THE CHOICE IS NOT VALID.");
                    break;
            } 
        }
    }
        
   //New Methods help from tutors 
   
    public static Double TryParseDouble(String A){
        
        try{
            return Double.parseDouble(A);
        }
        catch(NumberFormatException DN){return 0.00;}
        
    }
   
    //New Methods help from tutors 
    public static int TryParseInt(String A){
        
        try{
            return Integer.parseInt(A);
        }
        catch(NumberFormatException DN){return 0;}
        
    }
        



    
}
