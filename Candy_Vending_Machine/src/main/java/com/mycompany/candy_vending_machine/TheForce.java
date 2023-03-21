// @author jaleta and I have also worked a lot with Segni,tutors.
package com.mycompany.candy_vending_machine;

/**
 *
 * @author jaleta
 */
public class TheForce implements Cloneable{
 
    
/* We set the Properties (Setters and gettters) described in the instruction for the Force Class. */
  
   // i. Strength
   private int Strength;
    public int getStrength() {  
        return Strength;   
    }
    
    public void setStrength(int Strength) {
        this.Strength = Strength;   
    }

    // ii. Side
    private String Side;
         public String getSide() {
             return Side;
    }
        
    public void setSide(String Side) {
        this.Side = Side;
    }
    
   // These below you find the constructors as per the instruction for the Force Class.
    
    public TheForce(int aStrength, String aSide){
           setStrength(aStrength); 
           setSide(aSide); 
    }
    
    // throw a clone exception
    @Override
    public StarWarsCharacters clone() throws CloneNotSupportedException {
        return (StarWarsCharacters) super.clone();
    }

    
        
}
