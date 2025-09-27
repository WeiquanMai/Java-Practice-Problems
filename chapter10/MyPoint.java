class MyPoint {
    // Variables
    private double x;
    private double y;

    // No-arg constructor
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    // Overloaded Constructor
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public double distance(double x, double y){
        double xDistance = getX() - x;
        double yDistance = getY() - y;
        return Math.sqrt(Math.pow(xDistance,2) + Math.pow(yDistance,2));
    }

    public double distance(MyPoint point){
        return this.distance(point.getX(), point.getY());
    }

    public static double distance (MyPoint a, MyPoint b){
        return a.distance(b);
    }
}
