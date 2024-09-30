package org.Myolitz.Game.RoomData;

//Libraries
import java.util.Arrays;
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

  private String dictChoice = "";

  public RoomDicts() {}
   
  public boolean checkCmdValidity(String userIn)
  {
    if (Arrays.asList(leftCmds).contains(userIn))
    {
      dictChoice = "Left";
      return true;
    }
    if (Arrays.asList(rightCmds).contains(userIn))
    {
      dictChoice = "Right";
      return true;
    }
    if (Arrays.asList(backCmds).contains(userIn))
    {
      dictChoice = "Back";
      return true;
    }
    if (Arrays.asList(nextCmds).contains(userIn))
    {
      dictChoice = "Next";
      return true;
    }
    if (Arrays.asList(useCmds).contains(userIn))
    {
      dictChoice = "Use";
      return true;
    }
    if (Arrays.asList(invCmds).contains(userIn))
    {
      dictChoice = "Inv";
      return true;
    }
    return false;
  }

  public String playerCmd()
  {
    return dictChoice;
  }
}
