package WithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Autowiring {
    @Bean @Primary
    public Engine getEngine(){
    Engine e = new Engine();
    e.setPower("6500 CC");
    e.setMadeby("Rolls-Royce");
    return e;
    }
    @Bean
    public MusicSystem getMusic(){
        MusicSystem ms = new MusicSystem();
        ms.setBrand("BOSE");
        ms.setType("BASS BOOSTED");
        return ms;
    }

    @Bean ("c")
    public Car getCar(){
       Car c = new Car();
       c.setBrand("RR");
       c.setModel(" Rolls-Royce Ghost ");
       c.setPrice(9900799);
       return  c;
    }
}
