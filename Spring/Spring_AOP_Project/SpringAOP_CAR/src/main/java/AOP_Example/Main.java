package AOP_Example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringScan.class);

        Bike bikeobject = context.getBean(Bike.class);
        bikeobject.BikeStart();
        System.out.println("=============================================================================");
        Car carobject = context.getBean(Car.class);
        carobject.CarStart();
    }
}
