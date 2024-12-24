package Example.SpringAPI.CarData.Controller;

import Example.SpringAPI.CarData.CarEntity.CarEntity;
import Example.SpringAPI.CarData.Service.CarServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class CarController {
    @Autowired
    private CarServ carServObject;
    @GetMapping("/cars-api")
    public Collection<CarEntity>  getAllAvailableCars(){
        Collection<CarEntity> allAvailableCars = carServObject.getAllAvailableCars();
        return allAvailableCars;
    }

}
