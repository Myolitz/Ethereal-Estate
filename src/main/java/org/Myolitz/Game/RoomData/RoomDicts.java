package org.Myolitz.Game.RoomData;

//Libraries
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//Packages

public class RoomDicts
{
  //Objs
  
  //Class-specific vars
  protected HashSet<String> leftCmds;
  protected HashSet<String> rightCmds;
  protected HashSet<String> backCmds;
  protected HashSet<String> nextCmds;
  protected HashSet<String> useCmds;
  protected HashSet<String> invCmds;
  protected HashSet<String> entPlant;
  protected HashSet<String> entCoatRack;
  
  private String dictChoice = "";
  private String interactChoice = ""; 

  // Maps
  private HashMap<HashSet<String>, String> actionDictMap;
  private HashMap<HashSet<String>, String> entInteractMap;
  
  //Prevents NullPointerException as DictMap is not otherwise populateDictHashMap
  //hence `populateDictHashMap` exists as a method 
  public int x = 0;

  public RoomDicts () {} 

  public boolean checkActionCmdValidity(String userString)
  {
    if (x == 0)
    {
      populateDictHashMap();
      x += 1;
    }
    //I found the better way of doing this :) 
    for (HashSet<String> s : actionDictMap.keySet())
    {
      if (s.contains(userString))
      {
          dictChoice = actionDictMap.get(s);
          return true;
      } 
    }

    return false;
  }
  
  //Returners of dict values
  public String getDictChoice()
  { 
    return dictChoice;
  }

  public String getInteractable()
  {
    return interactChoice;
  }
  // Entrance validity checks
  public boolean entCmdValidity(String userString)
  {
    for (HashSet<String> s : entInteractMap.keySet())
      {
        if (s.contains(userString))
        {
          interactChoice = entInteractMap.get(s);
          return true;
        }
      }
    return false;
  } 

  public void populateDictHashMap()
  {
    actionDictMap = new HashMap<>();
    actionDictMap.put(leftCmds, "Left");
    actionDictMap.put(rightCmds, "Right");    
    actionDictMap.put(backCmds, "Back");
    actionDictMap.put(nextCmds, "Next");
    actionDictMap.put(useCmds, "Use");
    actionDictMap.put(invCmds, "Inv");
    
    entInteractMap = new HashMap<>();
    entInteractMap.put(entPlant, "Plant");
    entInteractMap.put(entCoatRack, "Coat");
  }
}
