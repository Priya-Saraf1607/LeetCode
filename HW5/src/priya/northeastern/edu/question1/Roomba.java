package priya.northeastern.edu.question1;

public class Roomba implements iRobot{
    int[][] room;
    iRobot.Direction direction;
    int[] pos;

    public Roomba(int[][] Room){
        direction=Direction.DOWN;
        room=Room;
        pos= new int[]{0, 0};

    }
    @Override
    public boolean move() {

        if(direction==Direction.UP){
            if(pos[0]-1>=0)
            {
                pos[0]=pos[0]-1;
                return true;
            }
        }
        else if(direction==Direction.LEFT)
        {
            if(pos[1]-1>=0)
            {
                pos[1]=pos[1]-1;
                return true;
            }
        }
        else if(direction==Direction.RIGHT)
        {
            if(pos[1]+1<=room[pos[0]].length-1)
            {
                pos[1]=pos[1]+1;
                return true;
            }
        }
        else if(direction==Direction.DOWN)
        {
            if(pos[0]+1<=room.length-1)
            {
                pos[0]=pos[0]+1;
                return true;
            }

        }
        return false;
    }

    @Override
    public void turnLeft() {

        if(direction==Direction.DOWN){
            direction=Direction.RIGHT;
        }
        else if(direction==Direction.RIGHT){
            direction=Direction.UP;
        }
        else if (direction==Direction.UP){
            direction=Direction.LEFT;
        }

        else if (direction==Direction.LEFT)
        {
            direction=Direction.DOWN;
        }

    }

    @Override
    public void turnRight() {
        if(direction==Direction.DOWN){
            direction=Direction.LEFT;
        }
        else if (direction==Direction.LEFT)
        {
            direction=Direction.UP;
        }
        else if (direction==Direction.UP){
            direction=Direction.RIGHT;
        }
        else if(direction==Direction.RIGHT){
            direction=Direction.DOWN;
        }

    }

    @Override
    public void clean() {
        //check if there is no obstacle, and if not already cleaned
        if((room[pos[0]][pos[1]]!=1) && (room[pos[0]][pos[1]]!=-1))
        {
            room[pos[0]][pos[1]]= 1 ;
        }

    }
}
