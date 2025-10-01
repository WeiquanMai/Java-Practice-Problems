class Circle extends GeometricObject{
    private double radius;

    // No-arg constructor
    public Circle(){
        this.radius = 1;
    }

    // Overloaded Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea(){
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter(){
        return Math.PI * 2 * getRadius();
    }

    @Override
    public String toString(){
        return "Radius: " + getRadius() + "\nArea: " + getArea() + "\nPerimeter" + getPerimeter();
    }
}
