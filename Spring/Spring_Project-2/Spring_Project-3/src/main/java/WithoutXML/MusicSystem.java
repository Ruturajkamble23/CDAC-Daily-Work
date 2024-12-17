package WithoutXML;

public class MusicSystem {
    private String Brand;
    private String type;

    public MusicSystem(){

    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MusicSystem[" +
                "Brand='" + Brand + '\'' +
                ", type='" + type + '\'' +
                ']';
    }
}
