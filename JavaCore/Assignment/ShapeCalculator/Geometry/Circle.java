package Geometry;

public class Circle extends Shape{
    double r;
    public  Circle(double radius){
    r = radius;
    }
   public double CalArea(){
    return 3.14*(r*r);
   }
    
    
}
