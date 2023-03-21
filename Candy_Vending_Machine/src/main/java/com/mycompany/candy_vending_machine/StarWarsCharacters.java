// @author jaleta and I have also worked a lot with Segni,tutors.
package com.mycompany.candy_vending_machine;

/**
 *
 * @author jaleta
 */

public class StarWarsCharacters implements Cloneable{
       
/* We set the Properties (Getters and Settters) described in the instruction for the StarWarsCharacter Class*/
   
    // i. First Name
    private String FName; 

   
        public String getFName(){
            return this.FName;
        }
    
        public void setFName(String FName){
             this.FName = FName;    
        }
        
     // ii. Last Name
    private String LName; 
        public String getLName(){
            return this.LName;  
        }

        public void setLastName(String LName){
            this.LName = LName;
        }
        
  

        
    // iii. Force 
        /* We will set the data type for force in the next class. 
           We cant se tit now because it is a combination of string and intigers that we need to discern values. */
    public TheForce Force; 
        public TheForce getForce(){
            return this.Force;
        }
        
        public void setForce(TheForce Force){
            this.Force = Force;
        }
        
        
        // iii. Price
        private double SWCPrice; 
        public double getSWCPrice(){
            return this.SWCPrice;  
        }

        public void setSWCPrice(double SWCPrice){  
            this.SWCPrice = SWCPrice;
        }
 

        
   
        
        
    // These below you find the constructors as per the instruction for the StarWarsCharacter Class   
        
    
     public StarWarsCharacters(String aFName, String aLName, TheForce aForce, double aSWCPrice){
          FName = aFName;
          LName = aLName;
          Force = aForce;
          SWCPrice = aSWCPrice; 
          
         
      }
        
   // throw a clone exception
     @Override
    public StarWarsCharacters clone() throws CloneNotSupportedException {
        return (StarWarsCharacters) super.clone();
    }
    
       } 
