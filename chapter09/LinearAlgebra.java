public class LinearEquation {
    // Variables
    private double a, b, c, d, e, f;

    // No-args constructor
    public LinearEquation(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    // Overloaded Constructor
    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter methods
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }

    public boolean isSolvable(){
        double determinant = (getA() * getD()) - (getB() * getC());
        return determinant != 0;
    }

    public double getX(){
        double x = ((getE() * getD()) - (getB() * getF())) / ((getA() * getD()) - (getB() * getC()));
        return x;
    }

    public double getY(){
        double y = ((getA() * getF()) - (getE() * getC()))/ ((getA() * getD()) - (getB() * getC()));
        return y;
    }
}
