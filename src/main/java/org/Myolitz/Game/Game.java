package org.Myolitz.Game;

//Libraries
import java.util.Scanner;
import java.util.ArrayList;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Packages
import org.Myolitz.PlayerData.Player;
import org.Myolitz.Game.RoomData.RoomBuilder;
import org.Myolitz.Game.RoomData.Room;
import org.Myolitz.Game.RoomData.RoomDicts;

public class Game
{
  //Objects
  Player player;
  RoomBuilder builder;
  RoomDicts roomDict;
  Gson gson;

  //Class-specific vars
  public boolean isRunning;
  ArrayList<Room> roomList;

  public Game(Scanner in) 
  {
    this.isRunning = true;
    builder = new RoomBuilder();
    gson = new Gson();
    
    try {
    roomDict = gson.fromJson
    (new FileReader("src/main/resources/jsons/Dicts.json"), RoomDicts.class);
    }
    catch (FileNotFoundException b)
    {
      System.out.println("Dictionary File not Found!");
    }
    

    System.out.println("Whats your name? (Importance NYI)");
    this.player = new Player(in.next());
  }

  public void gameStart(Scanner in)
  {  
    roomList = builder.build();
    player.setLocation(roomList.get(0));

    while (isRunning)
    { 
      player.getLocation().playerAction(in, player, roomDict);

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
