package org.Myolitz.Game.RoomData;

//Libraries
import java.util.Scanner;

//Packages
import org.Myolitz.PlayerData.Player;

public class Entrance extends Room
{
  public boolean plantInteract = false;

  public Entrance () 
  {
    super();
  }

  public void printMap()
  { 
    /*  Might look janky "in-game"
     *
     *  @see Entrance.json in resources/jsons/ for a "clearer view"
     */
    for (int i = 0; i < map.length; i++)
    {
      for (int j = 0; j < map.length; j++)
      {
        System.out.print(map[i][j]);
      }
      System.out.println();
    }
  }
  /*
   *  Overrides from RoomMethods.java
   */
  @Override
  public void formatDesc() 
  {
    //  NYI, this will serve to change descriptions based on events
    //  Example: plantInteract
  }

  @Override
  public void playerAction(Scanner in, Player player, RoomDicts dict)
  {
    boolean roomChange = false;
    String userCmd = "";
    boolean validCmd = false;

    while (!roomChange)
    {
      validCmd = false;
      this.printDesc();
      if (!validCmd)
      {
        userCmd = in.next();
        validCmd = dict.checkCmdValidity(userCmd);
      }
      switch (dict.playerCmd())
      {
        case "Left" -> 
        {
          System.out.println(dict.playerCmd());
          roomChange = true;
        }
        case "Right" ->
        {
          System.out.println(dict.playerCmd());
          roomChange = true;
        }
        case "Back" ->
        {
          System.out.println(dict.playerCmd());
          roomChange = true;
        }
        case "Next" ->
        {
          System.out.println(dict.playerCmd());
          roomChange = true;
        }
        case "Use" -> playerInteract(in, player);
    
        case "Inv" -> player.getInventory();
        


        default -> System.out.println("How did you get here?");
      }
    } 
      roomChange = true;
  }

  @Override
  public void playerInteract(Scanner in, Player player)
  {
    //TODO: Implement
  }

}
