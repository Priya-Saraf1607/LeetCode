package priya.northeastern.edu.shape;

public class Square extends Shape {
    int side;

    public Square(String shapeName, String shapeColor, int shapeSide) {
        this.setName(shapeName);
        this.setColor(shapeColor);
        this.setSide(shapeSide);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    public Square(int shapeSide) {
        this.setSide(shapeSide);
    }

    @Override
    public int getArea()
    {
        return getSide()*getSide();
    }

    @Override
    public int getPerimeter(){
        return 4*getSide();
    }
}
