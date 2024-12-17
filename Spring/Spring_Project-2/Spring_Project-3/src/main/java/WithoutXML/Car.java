package WithoutXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    private String Brand ;
    private String Model;
    private double price;
    @Autowired(required = false)
    private Engine engineDetails;
    @Autowired
    private MusicSystem SystemDetails;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car[" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", price=" + price +
                ", engineDetails=" + engineDetails +
                ", musicSystemDetails=" + SystemDetails +
                ']';
    }
}
