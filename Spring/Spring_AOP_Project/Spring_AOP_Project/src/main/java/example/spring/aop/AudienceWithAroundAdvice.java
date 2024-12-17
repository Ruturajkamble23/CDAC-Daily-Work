package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect //Marks this class as an Aspect
public class AudienceWithAroundAdvice {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {}
	
	private void takeSeats() {
		System.out.println("Please take your seats : around");
	}	
	private void turnOffMobile() {
		System.out.println("Please turn off your mobile : around");
	}	
	private void clap() {
		System.out.println("Clap Clap Clap : around");
	}	
	private void demandForRefund() {
		System.out.println("Please give my money back : around");
	}	
	private void leave() {
		System.out.println("Bye, leaving now : around");
	}
	@Around("myPointCut()")
	public void monitorPerformance(ProceedingJoinPoint joinPoint) {
		try {
			takeSeats();
			turnOffMobile();
			joinPoint.proceed();//Invokes Target Method: perform()
			clap();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			demandForRefund();
		}		
		leave();
	}
}











