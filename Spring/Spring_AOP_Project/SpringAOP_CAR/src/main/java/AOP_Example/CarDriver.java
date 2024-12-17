package AOP_Example;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CarDriver {
    @Pointcut("execution(* AOP_Example.Car.CarStart(..))")
    private void mypointcut(){}

    @Before("mypointcut()")
    public void Sefty(){
        System.out.println("Wear Your Seat Belt");

    }
    @Before("mypointcut()")
    public void Start(){
        System.out.println("Enter Your Key ");
    }

    @AfterReturning("mypointcut()")
    public void Gear(){
        System.out.println("Accelerate and shift Gears"  );
    }
    @AfterReturning("mypointcut()")
    public void Dhoom(){
        System.out.println("BHRHOOM BHROOMMM BRHOOOOOM ..... Spped Up");
    }

    @After("mypointcut()")
    public void Stop(){
        System.out.println("Use Break And Stop Engine....");
    }
}
