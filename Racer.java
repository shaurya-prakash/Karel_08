/**
*  Racer, Defining jumpRight, jumpLeft, sprint, put, pick and shuttle (Lab05 in Unit1, fcps.karel)
*
*  @author Shaurya Prakash
*  @version 5/11/2014
*/

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Racer extends Athlete 
   {
    public Racer (int y)
     {
       super(1, y, Display.EAST, Display.INFINITY);
     }
    public Racer(int x, int y, int dir, int beep)
   {
       super(x, y, dir, beep);
   }
     
    public void jumpRight()
      {
       turnLeft();
       move();
       turnRight();
       move();
       turnRight();
       move();
       turnLeft();
      }
      
    public void jumpLeft()
      {
       turnRight();
       move();
       turnLeft();
       move();
       turnLeft();
       move();
       turnRight();
      }
      
    public void sprint(int n)
      {
         for(int k = 1; k <= n; k++)
            move();
      }
      
    public void put(int n)
      {
       for(int k = 1; k <= n; k++)
            putBeeper();
      }
      
    public void pick(int n)
      {
       for(int k = 1; k <= n; k++)
            pickBeeper();
      }
      
    public void shuttle(int spaces, int beepers)
      {
       move();
       jumpRight();
       sprint(spaces - 2);
       pick(beepers);
       turnAround();
       sprint(spaces - 2);
       jumpLeft();
       move();
       put(beepers);
       turnAround();
      }
}