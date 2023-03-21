
// @author jaleta and I have also worked a lot with Segni,tutors, and Stack Overflow.
package com.mycompany.candy_vending_machine;

// a few of the imports and that are used in the code
import static com.mycompany.candy_vending_machine.MainProgram.TryParseDouble;
import static com.mycompany.candy_vending_machine.MainProgram.TryParseInt;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author jaleta
 */



public class SodaVendMachine implements VendMachineInterface {
    
    //---------------------------------------------------------------------------------------------------- 
   //PROPERTIES
   //---------------------------------------------------------------------------------------------------- 
    
   // Below are the getters and setters for the Slots  
    
  // i. Slot A    
  protected Queue<Soda> SlotA = new LinkedList();


    public Queue<Soda> getSlotA(){

        return this.SlotA;
    }

    public void setSlotA(Queue<Soda> val){

         this.SlotA = val;    
    }
        
  // ii. Slot B  
  protected Queue<Soda> SlotB = new LinkedList();
   
    
    public Queue<Soda> getSlotB(){

        return this.SlotB;
    }

    public void setSlotB(Queue<Soda> val){

         this.SlotB = val;    
    }
    
    
  // iii. Slot C   
  protected Queue<Soda> SlotC = new LinkedList();
    
  
    public Queue<Soda> getSlotC(){

        return this.SlotC;
    }

    public void setSlotC(Queue<Soda> val){

        this.SlotC = val;    
    }
    
    
 // Here we set the getters and setters for Money
 Double Money;
    
 
    protected Double getMoney(){
           
        return Money;
    }
    
    public void setMoney(double val){
        
        this.Money = val;
    }
  
  // Here we set the getters and setters for Quantity
 protected int Quantity; 
  
    protected int getQuantity(){
    
        return Quantity; 
    }
    protected void setQuantity(int val){
    
        this.Quantity = val;
    }
    
    //Helps us to get a currency form infront of the amount of the item on the print page
    NumberFormat formatter = NumberFormat.getCurrencyInstance();  
    
    
   //---------------------------------------------------------------------------------------------------- 
   //CONSTRUCTORS
   //---------------------------------------------------------------------------------------------------- 
    
    
    public SodaVendMachine(double Money, Queue<Soda> mySlotA, Queue<Soda> mySlotB, Queue<Soda> mySlotC ) throws CloneNotSupportedException{
        SlotA = mySlotA;
        SlotB = mySlotB;
        SlotC = mySlotC;
        
        //below we set the Soda's variable and it's price and volume
        
        
        
        // i.Coca Cola
        Soda coke = new Soda("Coca Cola", 2.25, "250 ml");  
            for(int i=1; i<=10; i++){
                SlotA.add(coke.clone());
            }
         
        // ii. Sprite
         Soda sprt = new Soda("Sprite", 3.42, "500ml");
            for(int i=1; i<=10; i++){
                SlotB.add(sprt.clone());
            }
            
        // iii. Fanta 
        Soda fan = new Soda("Fanta", 5.50, "1000 ml");
            for(int i=1; i<=10; i++){
                SlotC.add(fan.clone());
            }
    
       
            setMoney(Money); //Money in the machine
    
    }
    
    
    
   //---------------------------------------------------------------------------------------------------- 
   //METHODS
   //---------------------------------------------------------------------------------------------------- 
    
    // below we declared the following methods: TakeMoney, ReturnMoney, ItemCounter, VendItem, DisplayContents, GetMachineInfo, GiveChange, AddMoney, and VendInstructions.
    
    // the method to TakeMoney
    @Override
    public void TakeMoney(double amount) {
        AddMoney(amount);
        

     }

  // the method to ReturnMoney   
  @Override
    public void ReturnMoney(double amount) {
        
        AddMoney(-amount);
        System.out.println("Here Is Your Money" + amount);
    }
    
    // the method to ItemCounter
    public String ItemCounter(Queue <Soda> item){
       
        // This if return counts the item and tells the user if the item is not there.
        if(item.size()<=0){
            System.out.println("We Are Out Of The Item.");
        }
        else{
            System.out.println(item.peek().getsodaName() + " " + item.size() + " - " + item.peek().getsodaName());
        }
      return null;
    }


    // the method to VendItem (gives a product out or tells the user the machinendoesnt have enough) 
  @Override
    public Object VendItem(String slotCode) {
        
        /* This if statement below determines the size and gives the customer an item in Slot A
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        
        if (slotCode.equals("A") && SlotA.size()>0){
        
            System.out.println("Here is your " + SlotA.peek().getsodaName());
          
           
        for(int i = 1; i <= Quantity; i++){
                
                SlotA.poll();
            }
        }
        
        else if(SlotA.equals("A") && Quantity > SlotA.size()){
        
            System.out.println("The Vending Machine has only " + SlotA.size() + " Coca Cola Bottle/s. Please Make another order " + SlotA.size()+ ".");
        }
        
       
        /* This if statement below determines the size and gives the customer an item in Slot B
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        
        if (slotCode.equals("B") && SlotB.size()>0){
        
            System.out.println("Here is your" + SlotB.peek().getsodaName());
          
           
        for(int i = 1; i <= Quantity; i++){
                
                SlotB.poll();
            }
        }
        else if(SlotB.equals("B") && Quantity > SlotB.size()){
        
            System.out.println("The Vending Machine has only " + SlotB.size() + " Sprite Bottle/s. Please Make another order " + SlotB.size()+ ".");
        }
        

        /* This if statement below determines the size and gives the customer an item in Slot C
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        
        if (slotCode.equals("C") && SlotC.size()>0){
        
            System.out.println("Here is your" + SlotC.peek().getsodaName());
          
           
        for(int i = 1; i <= Quantity; i++){
                
                SlotC.poll();
            }
        }
        else if(SlotC.equals("C") && Quantity > SlotC.size()){
        
            System.out.println("The Vending Machine has only " + SlotC.size() + " Fanta Bottle/s. Please Make another order " + SlotC.size()+ ".");
        }

      return null;
        
      
    }
    
    // the method to DisplayContents
    @Override
    public String DisplayContents() {
        
       // Slot A
        if(!SlotA.isEmpty()){
            System.out.println("A: " + SlotA.peek().getsodaName() + "  ("+  SlotA.size() + ") "  + SlotA.peek().getsodaPrice());
            
        }
        
       // Slot B 
        if(!SlotB.isEmpty()){
            System.out.println("B: " + SlotB.peek().getsodaName() + "  ("+  SlotB.size() + ") "  + SlotB.peek().getsodaPrice());
        }
        
        
        // Slot C
        if(!SlotC.isEmpty()){
            System.out.println("C: " + SlotC.peek().getsodaName() + "  ("+  SlotC.size() + ") "  + SlotC.peek().getsodaPrice());
        }
        

      return null;
    }
    
    // the method to GetMachineInfo
    @Override
    public String GetMachineInfo() {
        
        DisplayContents();
      return null;
    }

    // the method to GiveChange
    public void GiveChange(double amount){
        AddMoney(-amount);
        //Cash -= amount;
        System.out.println("\n"+"Here is your change: "+formatter.format(amount) +" ." );
        
        
    }
   
    // the method to AddMoney
    void AddMoney(double d) {
        this.Money += d;
        
         }
    
    // the method of VendInstructions (contains a set of instructions whether an item is present or Out of Stock)
    
   public static void VendInstructions(String slotCode, double Price, int Quantity, SodaVendMachine VendC, NumberFormat formatter) throws CloneNotSupportedException{ 
       
   // This switch statement below recieves a request from a user and returns if it is out of stock or sends the needed variables to continue to processing 
       

    switch (slotCode){
         // i. Coca Cola
        case "A":
            if (VendC.SlotA.isEmpty()){
                System.out.println("The Coca Cola bottle is out of stock.");
                System.out.println("Try-again!");}
                    else{   
                        Price = VendC.SlotA.peek().getsodaPrice();
                        Quantity = VendC.SlotA.size();
                        Processing(Price, Quantity, VendC,formatter,slotCode);
                    } 
                    break;
                    
    // ii. Sprite                
        case "B":
            if (VendC.SlotB.isEmpty()){
                System.out.println("The Sprite bottle is out of stock.");
                System.out.println("Try-again!");}
                    else{   
                        Price = VendC.SlotB.peek().getsodaPrice();
                        Quantity = VendC.SlotB.size(); 
                        Processing(Price, Quantity, VendC,formatter,slotCode);
                    }
                    break;
                    
    // ii. Fanta               
        case "C":
            if (VendC.SlotC.isEmpty()){
                     System.out.println("The Fanta bottle out of stock.");
                     System.out.println("Try-again!");}
                    else{   
                        Price = VendC.SlotC.peek().getsodaPrice();
                        Quantity = VendC.SlotC.size();
                        Processing(Price, Quantity, VendC, formatter, slotCode);
                    }
                    break;
                case "Q": 
                     System.out.println("");
                     break;
                // Unless and Otherwise, Go back to the Main Menu  
                default:
                    System.out.println(" THE CHOICE IS NOT VALID.");
                    break;
        }                  
    } 
    
    /*
    
    
    Since the methods, the constructor and the properties are alreadys set here below is the brain (Processes) of the Soda Vending Machine
    I  takes te user through the whole route from the quantity they need for a specific slot until the end.
    
    
    */
   
   
static void Processing(Double sodaPrice, int sodaQuantity, SodaVendMachine machine, NumberFormat formatter, String slotChar) {
    // The user is asked for how much the user wants
     Scanner input = new Scanner(System.in);
        
        System.out.println("Insert Quantity:");
        String num = input.nextLine().trim();
        
        int neededSodaQuantity = TryParseInt(num);
    
    while(neededSodaQuantity==0)
        {
            // This message will appear if the right value is not inserted  
            System.out.println("The value you inserted is not valid."+"\n"+" Make it a whole number."+"\n"+ " Please try again.");
            num = input.nextLine().trim();                  
            neededSodaQuantity = TryParseInt(num);
        }
    String phrase = "";
        
        while (neededSodaQuantity>sodaQuantity ||sodaQuantity < 0 || neededSodaQuantity<0 ) 
            {
                // If the user wants more than the present quantity this message will appear 
                System.out.println("We dont have that quantity of product."+ "\n"+" We only have "+ sodaQuantity);
                System.out.println("Try again."+"\n"+"Insert amount you want to purchase:");
                phrase = input.nextLine().toUpperCase().trim();
                if(phrase.equals("Q")){ break;}
                neededSodaQuantity = (int)TryParseInt(phrase);
                
                            
            }
    
         if (!phrase.equals("Q")){
        
        machine.setQuantity(neededSodaQuantity);
        
        // This part asks for the cost and asks for payment 
        
        
        Double Total_Cost = neededSodaQuantity*sodaPrice;
        System.out.println("\n"+"Your total Cost is:  "+ formatter.format(Total_Cost) +" .");
        System.out.println("--------------------");
        System.out.println("\n"+"Insert Payment:");
        String str = input.nextLine().trim();
        Double PaymentAmount = TryParseDouble(str);
        machine.TakeMoney(PaymentAmount);
        
                while(PaymentAmount < Total_Cost)
        {
            // This tells the user that they have insuffcient funds or the user typed the wrong character 
            System.out.println("Invalid or Insufficient balance. At least, you should insert an additional  "+ formatter.format(Total_Cost-PaymentAmount)+" or click 'Q' to quit.");
            String Payment=input.nextLine().trim();
            if(Payment.toUpperCase().equals("Q")){ machine.ReturnMoney(PaymentAmount);System.exit(0);}
            else{
                
                Double PayMore = TryParseDouble(Payment);
                PaymentAmount += PayMore;
                machine.AddMoney(PayMore);
            }
        }
         
        //Vending the item that the user wanted
        machine.VendItem(slotChar);
        
        // this part gives the rest of the money back(change) 
        double Change = PaymentAmount - Total_Cost;
        if (Change>0)
        {
            machine.GiveChange(Change);
                                                
        }
        //This is the Final return of the machine after the vend and the customer obtained the product
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("|  Thank you!  |");
        System.out.println("----------------");
        System.out.println("---------------- \n ");
        System.out.println("The machine has "+formatter.format(machine.getMoney())+" stored inside.");
       
    
         
         }
      } 
    
    
}


   //---------------------------------------------------------------------------------------------------- 
   //                                               END                                                //
   //---------------------------------------------------------------------------------------------------- 