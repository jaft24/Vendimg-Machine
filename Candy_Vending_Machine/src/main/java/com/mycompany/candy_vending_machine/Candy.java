 // @author jaleta and I have also worked a lot with Segni,tutors.
   
   //---------------------------------------------------------------------------------------------------- 
   // PROPERTIES
   //---------------------------------------------------------------------------------------------------- 
 
package com.mycompany.candy_vending_machine;

/**
 *
 * @author jaleta
 */
 
public class Candy implements Cloneable {
 
    
   // Setters and Getters of the candy's name 
    private String candyName; 
        
        public String getcandyName(){
        
            return this.candyName;
        }
    
        public void setcandyName(String val){
            
             this.candyName = val;    
        }
        
     // Setters and Getters of the candy's price     
    private double candyPrice;            
        
        public double getcandyPrice(){
            
            return this.candyPrice;
        }
    
        public void setcandyPrice(double val){
        
            this.candyPrice = val;
        }
    
   
   //---------------------------------------------------------------------------------------------------- 
   //CONSTRUCTOR
   //---------------------------------------------------------------------------------------------------- 
     
   
       // the constructor that includes name and price 
    public Candy(String acandyName,double acandyPrice){
    
        candyName = acandyName;
        candyPrice = acandyPrice;        
      }
 
   @Override
        // throw a clone exception
    public Candy clone() throws CloneNotSupportedException {
       
       return (Candy) super.clone();
   
      }
        
}
