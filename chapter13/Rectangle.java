class Rectangle extends GeometricObject{
    private double length;
    private double width;

    // No-arg constructor
    public Rectangle(){
        this(1,1);
    }

    // Overloaded Constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double getArea(){
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter(){
        return 2 * (getLength() + getWidth());
    }

    @Override
    public String toString(){
        return "Length: " + getLength() + " Width: " + getWidth() +
                "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
