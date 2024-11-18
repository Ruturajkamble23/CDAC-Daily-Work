package Geometry;

public class Square extends Shape {
    public double area;
    public Square( double a){
        area = a;
    }
    public double CalArea()
    {
        return area*area;
    }

    
}