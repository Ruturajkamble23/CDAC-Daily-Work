package AOP_Example;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Rider {
    @Pointcut("execution(* AOP_Example.Bike.BikeStart(..))")
    private void mypoint(){}

    @Before("mypoint()")
   public void SafetyRider(){
       System.out.println("Wear your Helmet..");
   }

    @Before("mypoint()")
    public void  Start(){
        System.out.println("Enter Your Key ");

    }
   @AfterReturning("mypoint()")
   public void Gear(){
       System.out.println("BHRUMMMMM BHRUUMM BHRUUUUUMMMMM BHRUMMM.....");
   }
   @AfterReturning("mypoint()")
   public void Speed(){
       System.out.println("SPEED UP....");
   }
   @After("mypoint()")
   public void Stops(){
       System.out.println("Press Break And Stop");
   }
}
