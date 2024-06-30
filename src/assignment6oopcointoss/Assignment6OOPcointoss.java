/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment6oopcointoss;

/**
 *
 * @author John Hernandez 06/30/24
 */
public class Assignment6OOPcointoss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int headsCount = 0; //varables to display count when loop is completed
        int tailsCount = 0;
        
        Coin flip = new Coin(); // Create Coin object with variable flip
        
        for(int i = 1; i <= 20; i++) // for loop to iterate 20 times
        {
            flip.Toss(); // called method toss in Coin class
            System.out.println(flip.getSideUp());
            
            if("heads".equals(flip.getSideUp())) // if statement to calculated total head and tail flips
            {
                headsCount++;
            }
            else if("tails".equals(flip.getSideUp()))
            {
               tailsCount++; 
            }
        }
        System.out.println("The Coin faced heads " + headsCount + "x times");
        System.out.println("The Coin faced tails " + tailsCount + "x times");

    }
    
}
