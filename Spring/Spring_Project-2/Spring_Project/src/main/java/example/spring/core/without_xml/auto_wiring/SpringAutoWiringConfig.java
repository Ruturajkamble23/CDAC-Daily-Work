package example.spring.core.without_xml.auto_wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringAutoWiringConfig {
	@Bean
	@Primary
	public Engine getEngine() {
		Engine engine = new Engine("Petrol", "1600 CC");
		return engine;
	}
	
	@Bean	
	public Engine getAnotherEngine() {
		Engine engine = new Engine("Diesel", "1800 CC");
		return engine;
	}
	
	@Bean
	public MusicSystem getMusicSystem() {
		MusicSystem ms = new MusicSystem("Sony", "Dolby");
		return ms;
	}
	
	@Bean("myCar")
	public Car getCar() {
		Car myCar = new Car();
		myCar.setMake("Honda");
		myCar.setModel("City");
		myCar.setPrice(1500000);
		//Not setting the values for engine and music system because they
		//are to be auto-wired
		return myCar;
	}
}




