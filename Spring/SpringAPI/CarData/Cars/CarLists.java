package Example.SpringAPI.CarData.Cars;

import Example.SpringAPI.CarData.CarEntity.CarEntity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarLists {
private  static Map<Integer, CarEntity> allCars;
static {
    allCars = new HashMap<Integer,CarEntity>();
    CarEntity c = new CarEntity(805,"BMW","M8",780000,2024);
    CarEntity c1 = new CarEntity(1,"FORD","Ford Endeavour ",480000,2025);
    CarEntity c3 = new CarEntity(102,"KIA","KIA Syros",100000,2024);
    CarEntity c4 = new CarEntity(200,"Tata","Tata Blackbird",250000,2025);
    CarEntity c5 = new CarEntity(4,"Rolls-Royce","Rolls-Royce Phantom",10000000,2024);
    CarEntity c6 = new CarEntity(70,"TATA","Tata Curvv",780000,2024);
    CarEntity c7 = new CarEntity(10,"Toyota","T4",140000,2024);
    allCars.put(c.getCarModel(),c);
    allCars.put(c1.getCarModel(),c1);
    allCars.put(c3.getCarModel(),c3);
    allCars.put(c4.getCarModel(),c4);
    allCars.put(c5.getCarModel(),c5);
    allCars.put(c6.getCarModel(),c6);
    allCars.put(c7.getCarModel(),c7);


}
    public static Collection<CarEntity> getAllAvailableCars(){
        Collection<CarEntity> allAvailableCars = allCars.values();
        return allAvailableCars;
    }
}
