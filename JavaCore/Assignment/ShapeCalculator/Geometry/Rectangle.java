package Geometry;

public class Rectangle extends Shape {
    public double widhth;
    public double height;
    public Rectangle(double w ,double h){
          widhth = w;
          height =h;
    }
    public double CalArea(){
        return widhth * height;
    }
    
}
