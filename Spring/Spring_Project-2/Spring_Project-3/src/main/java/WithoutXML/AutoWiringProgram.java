package WithoutXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiringProgram {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Autowiring.class);

        Object carObject =  context.getBean("c");
        System.out.println(carObject);
        System.out.println("If You Want To Buy Contact Me....");

    }
}
