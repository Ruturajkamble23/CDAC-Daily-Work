package Example.SpringAPI.CarData.Service;

import Example.SpringAPI.CarData.CarEntity.CarEntity;
import Example.SpringAPI.CarData.Repo.CarREPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CarServ {
    @Autowired
    private CarREPO CPObject;
    public Collection<CarEntity> getAllAvailableCars(){
        Collection<CarEntity> allAvailableCars = CarREPO.getAllAvailableCars();
        return allAvailableCars;
    }
}
