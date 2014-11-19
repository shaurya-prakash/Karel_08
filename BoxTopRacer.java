/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * @author Shaurya Prakash
 * @version 17/11/2014
 *
 */
 
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

 public class BoxTopRacer extends Racer 
{
    public BoxTopRacer (int y)
     {
       super(1, y, Display.EAST, Display.INFINITY);
     }

	@Override
	public void jumpRight() {
	   int count = 0;
      turnLeft();
      while (!rightIsClear()) {
      move();
      count++;
     }
      turnRight();
      move();
      while (!rightIsClear()) {
      move();
     }
      turnRight();
      for (int k = 1; k <= count; k++) {
      move();
     }
      turnLeft();
	}

}