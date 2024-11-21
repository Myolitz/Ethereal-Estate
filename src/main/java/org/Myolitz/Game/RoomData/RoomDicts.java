package org.Myolitz.Game.RoomData;

//Libraries
import java.util.Arrays;
import java.util.HashMap;

//Packages

public class RoomDicts
{
  //Objs
  
  //Class-specific vars
  protected String[] leftCmds;
  protected String[] rightCmds;
  protected String[] backCmds;
  protected String[] nextCmds;
  protected String[] useCmds;
  protected String[] invCmds;
  protected String[] entInteractCmds;
  
  private String dictChoice = "";
  private HashMap<String[], String> DictMap;

  //Prevents NullPointerException 
  public int x = 0;

  public RoomDicts () {}
  
  /*  TODO:
   *  Try doing a HashMap<String[], String> with the dictionaries being the keys
   *
   *  Psuedocode:
   *
   *  for (String[] dicts : `Every HashMap String[] key`)
   *  {
   *    if Array `dicts` contains userInput
   *    {
   *      return `Value associated with Key`;
   *    }
   *  }
   *  
   *  Why am I only this big brained when its late at night? :(
   */

  public boolean checkCmdValidity(String userString)
  {
    if (x == 0)
    {
      populateDictHashMap();
      x += 1;
    }
    //I found the better way of doing this :) 
    for (String[] s : DictMap.keySet())
    {
      if (Arrays.asList(s).contains(userString))
      {
          dictChoice = DictMap.get(s);
          return true;
      }
    }

    return false;
  }

  public String playerCmd()
  { 
    return dictChoice;
  }

  // Entrance validity checks
  public boolean entCmdValidity(String userIn)
  {
    if (Arrays.asList(entInteractCmds).contains(userIn))
    {
      return true;
    }
    else {
      System.out.println("Not an interactable item");
      return false;
    }
  } 

  public void populateDictHashMap()
  {
    DictMap = new HashMap<>();
    DictMap.put(leftCmds, "Left");
    DictMap.put(rightCmds, "Right");    
    DictMap.put(backCmds, "Back");
    DictMap.put(nextCmds, "Next");
    DictMap.put(useCmds, "Use");
    DictMap.put(invCmds, "Inv");
    DictMap.put(entInteractCmds, "Interact");
  }
}
