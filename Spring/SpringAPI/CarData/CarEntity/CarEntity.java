package Example.SpringAPI.CarData.CarEntity;

public class CarEntity {
    private Integer carModel;
    private String Brand;
    private String CarName;
    private Integer ExpectedPrice;
    private Integer MF_Year;


    public CarEntity(){

    }

    public CarEntity(Integer carModel, String Brand ,String CarName,Integer ExpectedPrice,Integer MF_Year){
        this.carModel=carModel;
        this.Brand=Brand;
        this.CarName=CarName;
        this.ExpectedPrice=ExpectedPrice;
        this.MF_Year=MF_Year;

    }

    public Integer getCarModel() {
        return carModel;
    }

    public void setCarModel(Integer carModel) {
        this.carModel = carModel;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getCarId() {
        return CarName;
    }

    public void setCarId(String carName) {
        CarName = carName;
    }

    public Integer getExpectedPrice() {
        return ExpectedPrice;
    }

    public void setExpectedPrice(Integer expectedPrice) {
        ExpectedPrice = expectedPrice;
    }

    public Integer getMF_Year() {
        return MF_Year;
    }

    public void setMF_Year(Integer MF_Year) {
        this.MF_Year = MF_Year;
    }

    @Override
    public String toString() {
        return "CarEntity[" +
                "carModel=" + carModel +
                ", Brand='" + Brand + '\'' +
                ", CarName=" + CarName +
                ", ExpectedPrice=" + ExpectedPrice +
                ", MF_Year=" + MF_Year +
                ']';
    }
}
