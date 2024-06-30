/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment6oopcointoss;

import java.util.Random; // imported random class to use random method
/**
 *
 * @author John Hernandez 06/30/24
 */
public class Coin 
{
    private String sideUp; // Variable used throughout the coin class
    
    
    public Coin() // defalut constructor 
    {
        
        Random coin = new Random(); // created random object
        int coinSide = coin.nextInt(2);// created coinSide varibale with only 2 ints 0,1
        
        if(coinSide == 0) // decision making if statement
        {
            sideUp = "heads";
        }
        else
        {
            sideUp = "tails";
        }
    }
    public void Toss() // mutated method but reestablish the roll with head or tails.
    {
        Random coin = new Random(); //create random object
        int coinSide = coin.nextInt(2); // created coinSide Variable with only 2 ints 0,1
        
        if(coinSide == 0) // if statement 
        {
            sideUp = "heads";
        }
        else 
        {
           sideUp = "tails"; 
        }  
        
        
    }
    public String getSideUp() // returns the sideUp variable to main project
    {
        return sideUp;
    }
}

