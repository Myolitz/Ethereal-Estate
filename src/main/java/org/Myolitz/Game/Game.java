package org.Myolitz.Game;

//Libraries
import java.util.Scanner;
import java.util.ArrayList;

//Packages
import org.Myolitz.PlayerData.Player;
import org.Myolitz.Game.RoomData.RoomBuilder;
import org.Myolitz.Game.RoomData.Room;

public class Game
{
  //Objects
  Player player;
  RoomBuilder builder;

  //Class-specific vars
  public boolean isRunning;
  ArrayList<Room> roomList;

  public Game(Scanner in) 
  {
    this.isRunning = true;
    
    builder = new RoomBuilder();
    
    System.out.println("Whats your name? (Importance NYI)");
    this.player = new Player(in.next());
  }

  public void gameStart(Scanner in)
  {  
    roomList = builder.build();
    player.setLocation(roomList.get(0));

    while (isRunning)
    { 
      player.getLocation().playerAction(in);

      System.out.println("See you in 0.4.0 :)");
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
