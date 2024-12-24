package Example.SpringAPI.CarData.Repo;

import Example.SpringAPI.CarData.CarEntity.CarEntity;
import Example.SpringAPI.CarData.Cars.CarLists;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class CarREPO {
    public static Collection<CarEntity> getAllAvailableCars(){
        Collection<CarEntity> allAvailableCars = CarLists.getAllAvailableCars();
        return allAvailableCars;
    }
}