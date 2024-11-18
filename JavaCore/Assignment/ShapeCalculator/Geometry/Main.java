package Geometry;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("SELECT OPTION");
        System.out.println("1--> Circle");
        System.out.println("2--> Square");
        System.out.println("3--> Reactangle");
        System.out.println("4--> Cylender");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        switch (choice) {
            
           case 1:
        System.out.println("  --> Enter radius:");
        double radius = sc.nextDouble();
        Shape s=new Circle(radius);
        System.out.println(" Calculated Area of Circle "+s.CalArea());
            break;
            case 2:
        System.out.println(" --> Enter Area for Square:");
        double area = sc.nextDouble();
        Shape a= new Square(area);
        System.out.println(" area is "+a.CalArea());
        break;
        case 3:
        System.out.println(" --> Enter Width and Height for Reactangle:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Shape b= new Rectangle(width,height);
        System.out.println("area is "+b.CalArea());

        case 4:
        System.out.println(" --> Enter Radius and Height for cylinder:");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        Shape cy= new Cyl(r,h);
        System.out.println("area is "+cy.CalArea()); 



        break;
        default:
        System.out.println("Enter Valid Option..");
        }
        sc.close();
    }
}