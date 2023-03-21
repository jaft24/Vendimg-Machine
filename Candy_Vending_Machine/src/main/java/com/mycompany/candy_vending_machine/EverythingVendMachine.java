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
public class EverythingVendMachine implements VendMachineInterface {

    

   //---------------------------------------------------------------------------------------------------- 
   //PROPERTIES
   //---------------------------------------------------------------------------------------------------- 
    
    
 // Below are the getters and setters for the Slots  
   
 // i. Candy 
    
  // Slot A        
protected Queue<Candy> SlotA = new LinkedList();

      public Queue<Candy> getSlotA(){

        return this.SlotA;
    }

    public void setSlotA(Queue<Candy> val){

         this.SlotA = val;    
    }
  
   // Slot B  
protected Queue<Candy> SlotB = new LinkedList();
   
    
    public Queue<Candy> getSlotB(){

        return this.SlotB;
    }

    public void setSlotB(Queue<Candy> val){

         this.SlotB = val;    
    }
     
     // Slot C   
protected Queue<Candy> SlotC = new LinkedList();
    
  
    public Queue<Candy> getSlotC(){

        return this.SlotC;
    }

    public void setSlotC(Queue<Candy> val){

        this.SlotC = val;    
    }

  // ii. Soda
    
    // Slot D
protected Queue<Soda> SlotD = new LinkedList();

      public Queue<Soda> getSlotD(){

        return this.SlotD;
    }

    public void SlotD (Queue<Soda> val){

         this.SlotD = val;    
    }
     
    // Slot E
protected Queue<Soda> SlotE = new LinkedList();
   
    
    public Queue<Soda> getSlotE(){

        return this.SlotE;
    }

    public void setSlotE(Queue<Soda> val){

         this.SlotE = val;    
    }
      
    // Slot F
protected Queue<Soda> SlotF = new LinkedList();
    
  
    public Queue<Soda> getSlotF(){

        return this.SlotF;
    }

    public void setSlotF(Queue<Soda> val){

        this.SlotF = val;    
    }
    
     // iii. Starwars Characters 
    
    // Slot G
  protected Queue<StarWarsCharacters> SlotG = new LinkedList();

    public Queue<StarWarsCharacters> getSlotG(){

        return this.SlotG;
    }

    public void setSlotG (Queue<StarWarsCharacters> val){

         this.SlotG = val;    
    }
        
     // Slot H
protected Queue<StarWarsCharacters> SlotH = new LinkedList();

    public Queue<StarWarsCharacters> getSlotH(){

        return this.SlotH;
    }

    public void setSlotH (Queue<StarWarsCharacters> val){

         this.SlotH = val;    
    }
  
     // Slot I
protected Queue<StarWarsCharacters> SlotI = new LinkedList();

    public Queue<StarWarsCharacters> getSlotI(){

        return this.SlotI;
    }

    public void setSlotI(Queue<StarWarsCharacters> val){

         this.SlotI = val;    
    }
    
     // Slot J
protected Queue<StarWarsCharacters> SlotJ = new LinkedList();

    public Queue<StarWarsCharacters> getSlotJ(){

        return this.SlotJ;
    }

    public void setSlotJ(Queue<StarWarsCharacters> val){

         this.SlotJ = val;    
    }

     // Slot K
protected Queue<StarWarsCharacters> SlotK = new LinkedList();

    public Queue<StarWarsCharacters> getSlotK(){

        return this.SlotK;
    }

    public void setSlotK(Queue<StarWarsCharacters> val){

         this.SlotK = val;    
    }   
    
     // Slot L
protected Queue<StarWarsCharacters> SlotL = new LinkedList();

    public Queue<StarWarsCharacters> getSlotL(){

        return this.SlotL;
    }

    public void setSlotL(Queue<StarWarsCharacters> val){

         this.SlotL = val;    
    }     
    
     // Slot M
protected Queue<StarWarsCharacters> SlotM = new LinkedList();

    public Queue<StarWarsCharacters> getSlotM(){

        return this.SlotM;
    }

    public void setSlotM(Queue<StarWarsCharacters> val){

         this.SlotM = val;    
    }  
    
     // Slot N
protected Queue<StarWarsCharacters> SlotN = new LinkedList();

    public Queue<StarWarsCharacters> getSlotN(){

        return this.SlotN;
    }

    public void setSlotN(Queue<StarWarsCharacters> val){

         this.SlotN = val;    
    }  
    
     // Slot O
protected Queue<StarWarsCharacters> SlotO = new LinkedList();

    public Queue<StarWarsCharacters> getSlotO(){

        return this.SlotO;
    }

    public void setSlotO(Queue<StarWarsCharacters> val){

         this.SlotO = val;    
    }  
    
     // Slot P
protected Queue<StarWarsCharacters> SlotP = new LinkedList();

    public Queue<StarWarsCharacters> getSlotP(){

        return this.SlotP;
    }

    public void setSlotP(Queue<StarWarsCharacters> val){

         this.SlotP = val;    
    }      
    
       // Slot R
protected Queue<StarWarsCharacters> SlotR = new LinkedList();

    public Queue<StarWarsCharacters> getSlotR(){

        return this.SlotR;
    }

    public void setSlotR(Queue<StarWarsCharacters> val){

         this.SlotR = val;    
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
    //CONSTRUCTOR
    //---------------------------------------------------------------------------------------------------- 
    
       // Full Constructor of the Vending Machine with alot of properities inside it 

    public EverythingVendMachine(double Money, Queue<Candy> aSlotA, Queue<Candy> aSlotB, Queue<Candy> aSlotC, Queue<Soda> aSlotD, Queue<Soda> aSlotE, Queue<Soda> aSlotF, Queue<StarWarsCharacters> aSlotG, Queue<StarWarsCharacters> aSlotH, Queue<StarWarsCharacters> aSlotI, Queue<StarWarsCharacters> aSlotJ, Queue<StarWarsCharacters> aSlotK, Queue<StarWarsCharacters> aSlotL, Queue<StarWarsCharacters> aSlotM, Queue<StarWarsCharacters> aSlotN, Queue<StarWarsCharacters> aSlotO, Queue<StarWarsCharacters> aSlotP, Queue<StarWarsCharacters> aSlotR ) throws CloneNotSupportedException{
       
            SlotA = aSlotA;
            SlotB = aSlotB;
            SlotC = aSlotC;
            
            SlotD = aSlotD;
            SlotE = aSlotE;
            SlotF = aSlotF;
            
            SlotG = aSlotG;
            SlotH = aSlotH;
            SlotI = aSlotI;
            SlotJ = aSlotJ;
            SlotK = aSlotK;
            SlotL = aSlotL;
            SlotM = aSlotM;
            SlotN = aSlotN;
            SlotO = aSlotO;
            SlotP = aSlotP;
            SlotR = aSlotR;
            
     
            
       //below we set the Candy's, Soda's, and Starwar Characters's variable and it's price and volume
        
        
        // Candy
        
        // MandMs
        Candy mnms = new Candy("MandMs",42.42);
            for(int i=1; i<=10; i++){
                SlotC.add(mnms.clone());
            }
            
         // Snickers   
         Candy snic = new Candy("Snickers", 1.42);
            for(int i=1; i<=10; i++){
                SlotB.add(snic.clone());
            }
            
        // Skittles
        Candy skit = new Candy("Skittles", 4.20);
            for(int i=1; i<=10; i++){
                SlotA.add(skit.clone());
                
            }
            
         // Soda  
         
         // Coca Cola
         Soda coke = new Soda("Coca Cola", 2.25, "250 ml");  
            for(int j=1; j<=10; j++){
                SlotD.add(coke.clone());
            }
         
            // Sprite
         Soda sprt = new Soda("Sprite", 3.42, "500ml");
            for(int j=1; j<=10; j++){
                SlotE.add(sprt.clone());
            }
            
          // Fanta
        Soda fan = new Soda("Fanta", 5.50, "1000 ml");
            for(int j=1; j<=10; j++){
                SlotF.add(fan.clone());
            }
            
        // Starwars Characters
        
        /* Below the full characters for the Starwars is set in a way where Theforce is a separate variable and its inserted into the Starwars 
           I did this beacuse it is the same way I did the first assignment (Tutor reccomendations beacuse it was a character for a variable I made) */
           
        // Asajj
        TheForce AVf = new TheForce(88,"Dark");
        StarWarsCharacters AVentess = new StarWarsCharacters("Asajj","Ventess",AVf,11.22);
           for(int z=1; z<=10; z++){ 
                SlotG.add(AVentess.clone());    
            }
            
        // Bariss
        TheForce BOf = new TheForce(85,"Light");
        StarWarsCharacters BOffee = new StarWarsCharacters("Bariss","Offee",BOf,10.50);
           for(int z=1; z<=10; z++){ 
                SlotH.add(BOffee.clone());    
            }
        
           // Darth
        TheForce DVf = new TheForce(100,"Dark");
        StarWarsCharacters DVader = new StarWarsCharacters("Darth","Vader",DVf,54.70);
            for(int z=1; z<=10; z++){ 
                SlotI.add(DVader.clone());    
            }
        
          // Emperor Palpatine
        TheForce EPf = new TheForce(97,"Dark");
        StarWarsCharacters EPalpatine = new StarWarsCharacters("Emperor","Palpatine",EPf,43.22);
            for(int z=1; z<=10; z++){ 
                SlotJ.add(EPalpatine.clone());    
            }
        
            // Kylo
        TheForce KRf = new TheForce(95,"Dark");
        StarWarsCharacters KRen = new StarWarsCharacters("Kylo","Ren",KRf,35.00);
            for(int z=1; z<=10; z++){ 
                SlotK.add(KRen.clone());    
            }
        
            // Luke
        TheForce LSf = new TheForce(97,"Light");
        StarWarsCharacters LSkywalker = new StarWarsCharacters("Luke","Skywalker",LSf,40.00); 
            for(int z=1; z<=10; z++){ 
                SlotL.add(LSkywalker.clone());    
            }
        
            // Obi Wan
        TheForce OWKf = new TheForce(85,"Light");
        StarWarsCharacters OKenobi = new StarWarsCharacters("Obi Wan","Kenobi",OWKf,20.15);
             for(int z=1; z<=10; z++){ 
                SlotM.add(OKenobi.clone());    
            }
        
             // Princess Leia
        TheForce PLf = new TheForce(75,"Light");
        StarWarsCharacters PLeia = new StarWarsCharacters("Princess","Leia",PLf,25.00); 
             for(int z=1; z<=10; z++){ 
                SlotN.add(PLeia.clone());    
            }       
        
             // Rey
        TheForce Rf = new TheForce(96,"Light");
        StarWarsCharacters Rey = new StarWarsCharacters("Rey","",Rf,24.00);
             for(int z=1; z<=10; z++){ 
                SlotO.add(Rey.clone());    
            }  
        
             // Storm Trooper
        TheForce STf = new TheForce(1,"Dark");
        StarWarsCharacters STrooper = new StarWarsCharacters("Storm","Trooper",STf,5.00);
             for(int z=1; z<=10; z++){ 
                SlotP.add(STrooper.clone());    
            } 
        
             // Yoda
        TheForce Yf= new TheForce(99,"Light");
        StarWarsCharacters Yoda = new StarWarsCharacters("Yoda","",Yf, 50.00);
             for(int z=1; z<=10; z++){ 
                SlotR.add(Yoda.clone());    
            }
            
            
            
            setMoney(Money); //Money in the machine
    
            }

    //---------------------------------------------------------------------------------------------------- 
   //METHODS
   //---------------------------------------------------------------------------------------------------- 
    
    // below we declared the following methods: TakeMoney, ReturnMoney, ItemCounter, VendItem, DisplayContents, GetMachineInfo, GiveChange, AddMoney, and vendItemInMachine.
    
    // the method to GetMachineInfo   
@Override
    public String GetMachineInfo() {     
        
        DisplayContents();
     
      return null;
    }

    
    // the method to DisplayContents
@Override
    public String DisplayContents() {
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("+-------------------------------------------------------------------------+");
        System.out.println("|                        All Vending Machine.                             |");
        System.out.println("+--------------------  Your Options are below:  --------------------------+");
        System.out.println("---------------------------------------------------------------------------");
        
        // Candy
        
        // Slot A
        if(!SlotA.isEmpty()){
            System.out.println("A: " + SlotA.peek().getcandyName() + " ("+  SlotA.size() + ") " + "= " + SlotA.peek().getcandyPrice());
            
        }
 
        // Slot B
        if(!SlotB.isEmpty()){
            System.out.println("B: " + SlotB.peek().getcandyName() + " ("+  SlotB.size() + ") " + "= " + SlotB.peek().getcandyPrice());
        }
        
        // Slot C
        if(!SlotC.isEmpty()){
            System.out.println("C: " + SlotC.peek().getcandyName() + " ("+  SlotC.size() + ") " + "= " + SlotC.peek().getcandyPrice());
        }
 
        // Soda
        
        // Slot D
        if(!SlotD.isEmpty()){
           System.out.println("D: " + SlotD.peek().getsodaName() + " " + SlotD.peek().getsodaVolume() + " ("+  SlotD.size() + ") " + "= " + SlotD.peek().getsodaPrice());
        }
 
        // Slot E
        if(!SlotE.isEmpty()){
           System.out.println("E: " + SlotE.peek().getsodaName() + " " + SlotE.peek().getsodaVolume() + " ("+  SlotE.size() + ") " + "= " + SlotE.peek().getsodaPrice());        
        }
        
        // Slot F
        if(!SlotF.isEmpty()){ 
           System.out.println("F: " + SlotF.peek().getsodaName() + " " + SlotF.peek().getsodaVolume() + " ("+  SlotF.size() + ") " + "= " + SlotF.peek().getsodaPrice());        
        }
         
        // Starwars Characters
        
        // Slot G
        if(!SlotG.isEmpty()){
            System.out.println("G: " + SlotG.peek().getFName() + " " + SlotG.peek().getLName() + " ("+  SlotG.size() + ") " + "= " + SlotG.peek().getSWCPrice());    
        }
 
        // Slot H
        if(!SlotH.isEmpty()){
            System.out.println("H: " + SlotH.peek().getFName() + " " + SlotH.peek().getLName() + " ("+  SlotH.size() + ") " + "= " + SlotH.peek().getSWCPrice());    
        }
        
        // Slot I
        if(!SlotI.isEmpty()){
            System.out.println("I: " + SlotI.peek().getFName() + " " + SlotI.peek().getLName() + " ("+  SlotI.size() + ") " + "= " + SlotI.peek().getSWCPrice());    
        }
        
        // Slot J
        if(!SlotJ.isEmpty()){
            System.out.println("J: " + SlotJ.peek().getFName() + " " + SlotJ.peek().getLName() + " ("+  SlotJ.size() + ") " + "= " + SlotJ.peek().getSWCPrice());    
        }
 
        // Slot K
        if(!SlotK.isEmpty()){
            System.out.println("K: " + SlotK.peek().getFName() + " " + SlotK.peek().getLName() + " ("+  SlotK.size() + ") " + "= " + SlotK.peek().getSWCPrice());    
        }
        
        // Slot L
        if(!SlotL.isEmpty()){
            System.out.println("L: " + SlotL.peek().getFName() + " " + SlotL.peek().getLName() + " ("+  SlotL.size() + ") " + "= " + SlotL.peek().getSWCPrice());    
        }
        
        // Slot M
        if(!SlotM.isEmpty()){
            System.out.println("M: " + SlotM.peek().getFName() + " " + SlotM.peek().getLName() + " ("+  SlotM.size() + ") " + "= " + SlotM.peek().getSWCPrice());    
        }
        
        // Slot N
        if(!SlotN.isEmpty()){
            System.out.println("N: " + SlotN.peek().getFName() + " " + SlotN.peek().getLName() + " ("+  SlotN.size() + ") " + "= " + SlotN.peek().getSWCPrice());    
        }
        
        // Slot O
        if(!SlotO.isEmpty()){
            System.out.println("O: " + SlotO.peek().getFName() + " " + SlotO.peek().getLName() + " ("+  SlotO.size() + ") " + "= " + SlotO.peek().getSWCPrice());    
        }
        
        // Slot P
        if(!SlotP.isEmpty()){
            System.out.println("P: " + SlotP.peek().getFName() + " " + SlotP.peek().getLName() + " ("+  SlotP.size() + ") " + "= " + SlotP.peek().getSWCPrice());    
        }
        
        // Slot R
        if(!SlotR.isEmpty()){
            System.out.println("R: " + SlotR.peek().getFName() + " " + SlotR.peek().getLName() + " ("+  SlotR.size() + ") " + "= " + SlotR.peek().getSWCPrice());    
        }
        
        System.out.println("---------------------------------------------------------------------------");

      return null;
      
    }
    
    // the method to VendItem (gives a product out or tells the user the machinendoesnt have enough) 
@Override
    public Object VendItem(String slotCode){
        
        /* This if statement below determines the size and gives the customer an item in Slot A
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("A")&& SlotA.size()>0){
            System.out.println("Here is your "+SlotA.peek().getcandyName());
            for(int i = 1; i<=Quantity;i++){
                SlotA.poll(); 
            }
        }
        else if(slotCode.equals("A")&&Quantity>SlotA.size()){
            System.out.println("There are only "+SlotA.size()+ " Left. Please enter a quantity below "+ SlotA.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot B
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("B")&& SlotB.size()>0){
            System.out.println("Here is your "+SlotB.peek().getcandyName());
            for(int i = 1; i<=Quantity;i++){
                SlotB.poll();
            }
        }
        else if(slotCode.equals("B")&&Quantity>SlotB.size()){
            System.out.println("There are only "+SlotB.size()+ " Left. Please enter a quantity below "+ SlotB.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot C
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("C")&& SlotC.size()>0){
            System.out.println("Here is your "+SlotC.peek().getcandyName());
            for(int i = 1; i<=Quantity;i++){
                SlotC.poll();
            }
        }
        else if(slotCode.equals("C")&&Quantity>SlotC.size()){
            System.out.println("There are only "+SlotC.size()+ " Left. Please enter a quantity below "+ SlotC.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot D
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("D")&& SlotD.size()>0){
            System.out.println("Here is your "+SlotD.peek().getsodaName());
            for(int i = 1; i<=Quantity;i++){
                SlotD.poll();
            }
        }
        else if(slotCode.equals("D")&&Quantity>SlotD.size()){
            System.out.println("There are only "+SlotD.size()+ " Left. Please enter a quantity below "+ SlotD.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot E
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("E")&& SlotE.size()>0){
            System.out.println("Here is your "+SlotE.peek().getsodaName());
            for(int i = 1; i<=Quantity;i++){
                SlotE.poll();
            }
        }
        else if(slotCode.equals("E")&&Quantity>SlotE.size()){
            System.out.println("There are only "+SlotE.size()+ " Left. Please enter a quantity below "+ SlotE.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot F
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("F")&& SlotF.size()>0){
            System.out.println("Here is your "+SlotF.peek().getsodaName());
            for(int i = 1; i<=Quantity;i++){
                SlotF.poll();
            }
        }
        else if(slotCode.equals("F")&&Quantity>SlotF.size()){
            System.out.println("There are only "+SlotF.size()+ " Left. Please enter a quantity below "+ SlotF.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot G
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("G")&& SlotG.size()>0){
            System.out.println("Here is your " + SlotG.peek().getFName() + " " + SlotG.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotG.poll();
            }
        }
        else if(slotCode.equals("G")&&Quantity>SlotG.size()){
            System.out.println("There are only "+SlotG.size()+ " Left. Please enter a quantity below "+ SlotG.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot H
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("H")&& SlotG.size()>0){
            System.out.println("Here is your " + SlotH.peek().getFName() + " " + SlotH.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotH.poll();
            }
        }
        else if(slotCode.equals("H")&&Quantity>SlotH.size()){
            System.out.println("There are only "+SlotH.size()+ " Left. Please enter a quantity below "+ SlotH.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot I
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("I")&& SlotI.size()>0){
            System.out.println("Here is your " + SlotI.peek().getFName() + " " + SlotI.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotI.poll();
            }
        }
        else if(slotCode.equals("I")&&Quantity>SlotI.size()){
            System.out.println("There are only "+SlotI.size()+ " Left. Please enter a quantity below "+ SlotI.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot J
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("J")&& SlotJ.size()>0){
            System.out.println("Here is your " + SlotJ.peek().getFName() + " " + SlotJ.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotJ.poll();
            }
        }
        else if(slotCode.equals("J")&&Quantity>SlotJ.size()){
            System.out.println("There are only "+SlotJ.size()+ " Left. Please enter a quantity below "+ SlotJ.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot K
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("K")&& SlotK.size()>0){
            System.out.println("Here is your " + SlotK.peek().getFName() + " " + SlotK.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotK.poll();
            }
        }
        else if(slotCode.equals("K")&&Quantity>SlotK.size()){
            System.out.println("There are only "+SlotK.size()+ " Left. Please enter a quantity below "+ SlotK.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot L
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("L")&& SlotL.size()>0){
            System.out.println("Here is your " + SlotL.peek().getFName() + " " + SlotL.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotL.poll();
            }
        }
        else if(slotCode.equals("L")&&Quantity>SlotL.size()){
            System.out.println("There are only "+SlotL.size()+ " Left. Please enter a quantity below "+ SlotL.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot M
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("M")&& SlotM.size()>0){
            System.out.println("Here is your " + SlotM.peek().getFName() + " " + SlotM.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotM.poll();
            }
        }
        else if(slotCode.equals("M")&&Quantity>SlotM.size()){
            System.out.println("There are only "+SlotM.size()+ " Left. Please enter a quantity below "+ SlotM.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot N
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("N")&& SlotN.size()>0){
            System.out.println("Here is your " + SlotN.peek().getFName() + " " + SlotN.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotN.poll();
            }
        }
        else if(slotCode.equals("N")&&Quantity>SlotN.size()){
            System.out.println("There are only "+SlotN.size()+ " Left. Please enter a quantity below "+ SlotN.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot O
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("O")&& SlotO.size()>0){
            System.out.println("Here is your " + SlotO.peek().getFName() + " " + SlotO.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotO.poll();
            }
        }
        else if(slotCode.equals("O")&&Quantity>SlotO.size()){
            System.out.println("There are only "+SlotO.size()+ " Left. Please enter a quantity below "+ SlotO.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot P
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("P")&& SlotP.size()>0){
            System.out.println("Here is your " + SlotP.peek().getFName() + " " + SlotP.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotP.poll();
            }
        }
        else if(slotCode.equals("P")&&Quantity>SlotP.size()){
            System.out.println("There are only "+SlotP.size()+ " Left. Please enter a quantity below "+ SlotP.size()+".");
        }
        
        /* This if statement below determines the size and gives the customer an item in Slot R
           or if the customer order more than the quantity present it instructs them to orde someth8ng else */
        if(slotCode.equals("R")&& SlotR.size()>0){
            System.out.println("Here is your " + SlotR.peek().getFName() + " " + SlotR.peek().getLName());
            for(int i = 1; i<=Quantity;i++){
                SlotR.poll();
            }
        }
        else if(slotCode.equals("R")&&Quantity>SlotR.size()){
            System.out.println("There are only "+SlotR.size()+ " Left. Please enter a quantity below "+ SlotR.size()+".");
        }
        
        return null;
    }
    
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
       
    // the method to GiveChange
    public void GiveChange(double amount){      
        AddMoney(-amount);     
        System.out.println("\n"+"Here is your change: "+formatter.format(amount) +" ." );       
    }    
        
    // the method to AddMoney
    public void AddMoney(double d) {
        this.Money += d;
        
         }
    
    // the method of VendInstructions (contains a set of instructions whether an item is present or Out of Stock)
    public static void vendItemInMachine(Double price, int quantity, EverythingVendMachine EVendMachine,NumberFormat formatter, String slotCode){
        
        // This switch statement below recieves a request from a user and returns if it is out of stock or sends the needed variables to continue to processing
        switch(slotCode){
            
                        // Skittles
                        case "A": 
                            if(EVendMachine.SlotA.isEmpty()){
                                System.out.println("The vending machine has no Skittles. Please choose another Item.");
                            }
                            else{
                                price = EVendMachine.SlotA.peek().getcandyPrice();
                                quantity = EVendMachine.SlotA.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                            
                        // Snickers
                        case "B": 
                            if(EVendMachine.SlotB.isEmpty()){
                                System.out.println("The vending machine has no Snickers. Please choose another Item.");
                            }
                            else{
                                price = EVendMachine.SlotB.peek().getcandyPrice();
                                quantity = EVendMachine.SlotB.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                            
                         // MandM's
                        case "C": 
                            if(EVendMachine.SlotC.isEmpty()){
                                System.out.println("The vending machine has no MandM's. Please choose another Item.");
                            }
                            else{
                                price = EVendMachine.SlotC.peek().getcandyPrice();
                                quantity = EVendMachine.SlotC.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                            
                            // Coca Cola
                        case "D": 
                            if(EVendMachine.SlotD.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotD.peek().getsodaPrice();
                                quantity = EVendMachine.SlotD.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                            
                            // Sprite
                        case "E": 
                            if(EVendMachine.SlotE.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotE.peek().getsodaPrice();
                                quantity = EVendMachine.SlotE.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                            
                            // Fanta
                        case "F": 
                            if(EVendMachine.SlotF.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotF.peek().getsodaPrice();
                                quantity = EVendMachine.SlotF.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                            
                        // These cases below are for the Starwars Characters and their respective slots    
                          
                        case "G": 
                            if(EVendMachine.SlotG.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotG.peek().getSWCPrice();
                                quantity = EVendMachine.SlotG.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                        case "H": 
                            if(EVendMachine.SlotH.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotH.peek().getSWCPrice();
                                quantity = EVendMachine.SlotH.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                        case "I": 
                            if(EVendMachine.SlotI.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotI.peek().getSWCPrice();
                                quantity = EVendMachine.SlotI.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                        case "J": 
                            if(EVendMachine.SlotJ.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotJ.peek().getSWCPrice();
                                quantity = EVendMachine.SlotJ.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                        case "K": 
                            if(EVendMachine.SlotK.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotK.peek().getSWCPrice();
                                quantity = EVendMachine.SlotK.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                        case "L": 
                            if(EVendMachine.SlotL.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotL.peek().getSWCPrice();
                                quantity = EVendMachine.SlotL.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                           case "M": 
                            if(EVendMachine.SlotM.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotM.peek().getSWCPrice();
                                quantity = EVendMachine.SlotM.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                        case "N": 
                            if(EVendMachine.SlotN.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotN.peek().getSWCPrice();
                                quantity = EVendMachine.SlotN.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                        case "O": 
                            if(EVendMachine.SlotO.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotO.peek().getSWCPrice();
                                quantity = EVendMachine.SlotO.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                        case "P": 
                            if(EVendMachine.SlotP.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotP.peek().getSWCPrice();
                                quantity = EVendMachine.SlotP.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }
                            break;
                        case "R": 
                            if(EVendMachine.SlotR.isEmpty()){
                                System.out.println("Please choose another Item. Your item selected is not available.");
                            }
                            else{
                                price = EVendMachine.SlotR.peek().getSWCPrice();
                                quantity = EVendMachine.SlotR.size();
                                processingVendingMachine(price,quantity,EVendMachine,formatter,slotCode);
                            }    
                            
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
    
    
    Since the methods, the constructor and the properties are alreadys set here below is the brain (Processes) of the Everything Vending Machine
    I  takes te user through the whole route from the quantity they need for a specific slot until the end.
    
    
    */
      
     static void processingVendingMachine(Double price, int quantity, EverythingVendMachine EVendMachine, NumberFormat formatter, String slotCode){
         // The user is asked for how much the user wants
        Scanner in = new Scanner(System.in);
        System.out.println("How many do you want to purchase: ");
        String val = in.nextLine().trim();
        int quantityNeeded = TryParseInt(val);
        while(quantityNeeded==0){
            // This message will appear if the right value is not inserted 
           System.out.println("Not a valid number.");
            System.out.println("The value of the number has to be a number greater than 0.");
            System.out.println("Try again!");
            val = in.nextLine().trim();
            quantityNeeded= TryParseInt(val);
        }
        String reChoice = "";
        while(quantity<0||quantityNeeded<0||quantityNeeded>quantity){
            // If the user wants more than the present quantity this message will appear 
            System.out.println("The quantity asked is not there");
            System.out.println("The vending Machine only has "+quantity+" of the item.");
            System.out.println("Try again!");
            System.out.println("PHow many do you want to purchase: ");
            reChoice = in.nextLine().toUpperCase().trim();
            if(reChoice.equals("Q")){
                break;
            }
            quantityNeeded = (int)TryParseInt(reChoice);
        }
        if(!reChoice.equals("Q")){
            EVendMachine.setQuantity(quantityNeeded);
            
            // This part asks for the cost and asks for payment 
            Double totalCost = quantityNeeded*price;
            System.out.println("Your total cost is "+ formatter.format(totalCost) + " .");
            System.out.println("Insert payment: ");
            String reChoice2 = in.nextLine().trim();
            Double payment = TryParseDouble(reChoice2);
            EVendMachine.TakeMoney(payment);
            
            while(payment<totalCost){
                
                // This tells the user that they have insuffcient funds or the user typed the wrong character 
                System.out.println("Invalid or Insufficient balance. At least, you should insert an additional  "+ formatter.format(totalCost-payment)+ " or click 'Q' to quit.");
                String purchase = in.nextLine().trim();
                if(purchase.toUpperCase().equals("Q")){
                    EVendMachine.ReturnMoney(payment);
                    System.exit(0);
                }
                else{
                    Double extraPurchase = TryParseDouble(purchase);
                    payment=payment+extraPurchase;
                    EVendMachine.AddMoney(extraPurchase);
                }
            }
            
         
        System.out.println("Thank you for payment!");
       
        
            //Vending the item that the user wanted
            EVendMachine.VendItem(slotCode);
            
             // this part gives the rest of the money back(change)
            double change = payment - totalCost;
            if(change>0){
                EVendMachine.GiveChange(change);
            }
            //This is the Final return of the machine after the vend and the customer obtained the product
            System.out.println("----------------");
            System.out.println("----------------");
            System.out.println("|  Thank you!  |");
            System.out.println("----------------");
            System.out.println("---------------- \n ");
            System.out.println("The machine has stored " + formatter.format(EVendMachine.getMoney())+".");
            
        }
    }
    
    
    
}
    

   //---------------------------------------------------------------------------------------------------- 
   //                                               END                                                //
   //---------------------------------------------------------------------------------------------------- 
    



    
    

