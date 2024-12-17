package ExapmleSpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context;
        String filePath = "./src/main/resources/spring-config.xml";
        context = new FileSystemXmlApplicationContext(filePath);
        Object loadedObject = context.getBean("myBean");
        Greetings gs = (Greetings)loadedObject;
        String reply = gs.SayGreetings();
        System.out.println(reply);


        Object loadedObject1 = context.getBean("myBean1");
        Greetings gs1 = (Greetings)loadedObject1;
        String reply1 = gs1.SayGreetings();
        System.out.println(reply1);
    }
}
