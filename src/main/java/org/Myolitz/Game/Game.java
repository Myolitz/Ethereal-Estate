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
    /*  Purpose of Constructure is to:
     *  1. Ensure game is looped through `isRunning`
     *  2. Gather the dictionaries through the try_catch block | See `FileNotFoundException b` 
     */

    isRunning = true;
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
    /*  Will create the rooms through the builder object | See `RoomBuilder.java`
     *
     *  TODO: Change logic to remove roomList and move the `player.setLocation()` call to be within `builder.build()`
     */
    roomList = builder.build();
    player.setLocation(roomList.get(0));

    while (isRunning)
    { 
      //Methods like this will function as the main gameplay loop as they'll handle
      //all logic, see Room.java for javadoc
      player.getLocation().playerAction(in, player, roomDict);
      
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
