public class Rectangle {
    private double width;
    private double height;

    // No-args constructor
    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // Getters and Setters
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }
}
