package org.Myolitz.Game.RoomData;

//Libraries
import java.util.Scanner;

//Packages
import org.Myolitz.PlayerData.Player;

public class Entrance extends Room
{
  //Class-specific vars
  public String plantDesc;
  public boolean plantInteract = false;
  public int descUpdates = 0;

  
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
    if (descUpdates == 0)
    {
      fullDesc = desc + "\n" + desc2 + "\n" + desc3; 
      descUpdates += 1;
    }
  }


  /**
   *  This is where majority of player action will occurr
   *
   *
   *
   */
  @Override
  public void playerAction(Scanner in, Player player, RoomDicts dict)
  {
    formatDesc();

    boolean roomChange = false;
    String userCmd = "";
    boolean validCmd = false;

    while (!roomChange)
    {
      validCmd = false;
      this.printDesc();
      this.printMap();
      this.printCtrls();
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
        case "Use", "Interact" -> playerInteract(in, player, dict);
    
        case "Inv" -> player.getInventory();
        


        default -> System.out.println("How did you get here?");
      }
    } 
      roomChange = true;
  }

  @Override
  public void playerInteract(Scanner in, Player player, RoomDicts dict)
  {
    boolean interactComplete = false;
    boolean correctInteractCmd = false;
    String userInput = "";

    while (!interactComplete)
    {
      while (!correctInteractCmd)
      {
        System.out.println("What will you interact with?");
        userInput = in.next();
        correctInteractCmd = dict.entCmdValidity(userInput);
      }
        switch (userInput)
        {
          case "Plant", "plant" ->
          {
              System.out.println(plantDesc);
              interactComplete = true;
          }

        }
     


    } 
    
  }
  
}
