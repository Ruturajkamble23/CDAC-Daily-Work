package Example.SpringAPI.Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication(scanBasePackages = {"Example.SpringAPI"})
public class ExampleApplication {
//@Bean("NameList")
//public List<String> getName(){
//	List<String> names = List.of("Ruturaj","Sushant","Krutarth","Rushikesh");
//	return names;
//}
	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(ExampleApplication.class, args);
//		Object obj =context.getBean("NameList");
//		List<String> allNames = (List<String>) obj;
//		allNames.stream().forEach(name -> System.out.println(name));

		System.out.println("Application Started....");
	}

}
