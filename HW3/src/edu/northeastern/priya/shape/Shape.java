package priya.northeastern.edu.shape;

public class Shape {

    String name;
    String color;
    int area;
    int perimeter;

    public Shape(String shapeName, String shapeColor) {
        this.setName(shapeName);
        this.setColor(shapeColor);
    }

    public Shape(String shapeName, String shapeColor, int shapeArea, int shapePerimeter) {
        this.setName(shapeName);
        this.setColor(shapeColor);
        this.setArea(shapeArea);
        this.setPerimeter(shapePerimeter);
    }

    public Shape() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public String printShape() {
        String s1 = "The ";
        String s2 = " has a ";
        String s3 = " color";
        String res = s1.concat(getName()).concat(s2).concat(getColor()).concat(s3);
        return res;
    }

}
