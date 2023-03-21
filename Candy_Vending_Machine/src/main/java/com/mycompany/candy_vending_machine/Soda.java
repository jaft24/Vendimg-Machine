// @author jaleta and I have also worked a lot with Segni,tutors.

package com.mycompany.candy_vending_machine;

/**
 *
 * @author jaleta
 */
public class Soda implements Cloneable {
 
    // Setters and Getters of the soda's name 
    private String sodaName; 
        
        public String getsodaName(){
        
            return this.sodaName;
        }
    
        public void setsodaName(String val){
            
             this.sodaName = val;    
        }
        
    // Setters and Getters of the soda's price       
    private double sodaPrice;            
        
        public double getsodaPrice(){
            
            return this.sodaPrice;
        }
    
        public void setsodaPrice(double val){
        
            this.sodaPrice = val;
        }
        
    // Setters and Getters of the soda's volume   
    private String sodaVolume;            
        
        public String getsodaVolume(){
            
            return this.sodaVolume;
        }
    
        public void setsodaVolume(String val){
        
            this.sodaVolume = val;
        }    
    
   
   //---------------------------------------------------------------------------------------------------- 
   //CONSTRUCTOR
   //---------------------------------------------------------------------------------------------------- 
     
    
       // the constructor that includes name, price, and volume 
    public Soda(String asodaName,double asodaPrice,String asodaVolume){
    
        sodaName = asodaName;
        sodaPrice = asodaPrice; 
        sodaVolume = asodaVolume;
      }
 
   @Override
        // throw a clone exception
    public Soda clone() throws CloneNotSupportedException {
       
       return (Soda) super.clone();
   
      }
        
}
