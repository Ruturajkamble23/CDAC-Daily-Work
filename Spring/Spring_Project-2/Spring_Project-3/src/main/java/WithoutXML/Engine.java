package WithoutXML;

public class Engine {
    private String power;
    private String madeby;

    public Engine(){

    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getMadeby() {
        return madeby;
    }

    public void setMadeby(String madeby) {
        this.madeby = madeby;
    }

    @Override
    public String toString() {
        return "Engine[" +
                "power=" + power +
                ", madeby='" + madeby + '\'' +
                ']';
    }
}
