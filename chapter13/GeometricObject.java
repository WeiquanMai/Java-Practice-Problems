import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    // No-args constructor
    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }

    // Overloaded constructor
    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on " + getDateCreated() + "\ncolor: " + color + " and filled " + filled;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2){
        if(o1.compareTo(o2) > 0){
            return o1;
        }
        else{
            return o2;
        }
    }

    @Override
    public int compareTo(GeometricObject o){
        if(getArea() > o.getArea()){
            return 1;
        }
        else if (getArea() < o.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
