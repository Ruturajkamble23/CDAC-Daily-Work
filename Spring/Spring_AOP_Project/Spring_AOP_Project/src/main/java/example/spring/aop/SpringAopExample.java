package example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringAopConfig.class);
		Musician musicianObject = context.getBean(Musician.class);
		Singer singerObject = context.getBean(Singer.class);
		musicianObject.perform();
		System.out.println("-----------------------------------------");
		singerObject.perform();
		
		/*
		 Displaying the names of the classes of the objects to which 
		 references musicianObject and singerObject refer.
		 */
//		System.out.println("------------------------");
//		System.out.println(musicianObject.getClass().getName());
//		System.out.println(singerObject.getClass().getName());
	}
}






