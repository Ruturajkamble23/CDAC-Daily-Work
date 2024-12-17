package AOP_Example;

import org.springframework.stereotype.Component;

@Component
public class Bike {
    public void BikeStart(){
        System.out.println("Your Powerfull Machine is Started....");
    }
}
