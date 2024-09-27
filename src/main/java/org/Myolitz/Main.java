/*
 *  @author: Myolitz
 *  
 *  Considered final as of 9/27/24
 */
package org.Myolitz;

//Libs
import java.util.Scanner;
 
//Classes
import org.Myolitz.Menus.MenuUtils;
import org.Myolitz.Game.Game;

public class Main 
{
  public static void main(String[] args) 
  {
    //Objects
    Scanner in = new Scanner(System.in);
    MenuUtils menUtils = new MenuUtils();
    
    //Class-specific vars
    boolean userQuit = false;
    int userChoice;

    System.out.println("Ethereal Estate\n"); 
    
    //Loops player into an infinite menu loop until they either:
    //A) Start the Game
    //B) Quit the Game
    while (!userQuit)
    {
      menUtils.printMenu();
      userChoice = in.nextInt();
      switch (userChoice)
      {
        case 1 -> 
        {
          //System.out.println("See you in 0.2.0 :)");
          Game game = new Game(in);
          game.gameStart(in);
          
          // This is here to end the loop regardless as
          // the actual game logic will be in a loop within Game.java
          userQuit = true;
        }
        case 2 -> menUtils.printCtrls();
        case 3 -> menUtils.printCreds();
        case 4 -> 
        {
          System.out.println("See you later~");
          userQuit = true;
        }
      }
    }
    in.close(); 
  }
}
