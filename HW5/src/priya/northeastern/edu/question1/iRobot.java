package priya.northeastern.edu.question1;

public interface iRobot {

   public boolean move();
   public void turnLeft();
   public void turnRight();
   public void clean();

   public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
   }
}
