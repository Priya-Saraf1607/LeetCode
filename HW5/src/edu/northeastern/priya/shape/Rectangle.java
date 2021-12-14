package priya.northeastern.edu.shape;

public class Rectangle extends Shape {

    int height;
    int width;

    public Rectangle(String shapeName, String shapeColor) {
        super("Rectangle", shapeColor);
    }

    public Rectangle(int side) {
        super();
        this.setHeight(side);
        this.setWidth(side);
    }

    public Rectangle(int shapeHeight, int shapeWidth) {
        this.setHeight(shapeHeight);
        this.setWidth(shapeWidth);
    }

    public Rectangle(String shapeName, String shapeColor, int shapeHeight, int shapeWidth) {
        this.setName(shapeName);
        this.setColor(shapeColor);
        this.setHeight(shapeHeight);
        this.setWidth(shapeWidth);
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getArea()
    {
        return getHeight()*getWidth();
    }

    @Override
    public int getPerimeter(){
        return 2*(getWidth()+getHeight());
    }

}
