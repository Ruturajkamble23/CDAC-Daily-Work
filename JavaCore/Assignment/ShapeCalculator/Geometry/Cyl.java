package Geometry;

public class Cyl extends Shape{
    public double radius;
    public double height;
    public Cyl(double r,double h){
        radius =r;
        height =h;
    }
    public double CalArea(){
        return (2*3.14)* radius*height;
    }
}
