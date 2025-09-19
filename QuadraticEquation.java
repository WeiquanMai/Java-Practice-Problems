public class QuadraticEquation {
    // Variables
    private double a;
    private double b;
    private double c;

    // Overloaded constructor
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Three getter methods for a, b, and c
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return Math.pow(b,2) - (4 * a * c);
    }

    public double getRoot1(){
        if(getDiscriminant() >= 0){
            double r1 = (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
            return r1;
        }
        else{
            return 0;
        }
    }

    public double getRoot2(){
        if(getDiscriminant() >= 0){
            double r2 = (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
            return r2;
        }
        else{
            return 0;
        }
    }
}
