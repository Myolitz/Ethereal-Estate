package org.Myolitz.Game;

//Libraries
import java.util.Scanner;
//Packages
import org.Myolitz.PlayerData.Player;

public class Game
{
  //Objects
  Player player;

  //Class-specific vars
  public boolean isRunning;

  public Game(Scanner in) 
  {
    this.isRunning = true;

    System.out.println("Whats your name? (Importance NYI)");
    this.player = new Player(in.next());
  }

  public void gameStart(Scanner in)
  {
    System.out.println("See you in 0.3.0 :)");
  
    while (isRunning)
    {      
      // Most of the logic will be ran through here
      // Still need to think of the logic but oh well
    
      //Putting this here for now
      isRunning = false;

      /* TODO:
       * - Room Logic
       * - Puzzle Logic
       * - Player Movement
       */

    }
  }
}
