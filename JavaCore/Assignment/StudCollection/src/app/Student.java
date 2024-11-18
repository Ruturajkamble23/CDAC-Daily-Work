package app;

public class Student {
    int roll;
    private String name;
    private String div;
    private double fees;
    public int key;

    public Student(int roll, String name, String div, double fees,int key){
        this.roll = roll;
        this.name = name;
        this.div =div;
        this.fees =fees;
        this.key=key;
    }


    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getDiv() {
        return div;
    }

    public double getFees() {
        return fees;
    }


    @Override
    public String toString() {
        return "[Key="+key+",Roll="+roll+"," +
                "Name="+name+"," +
                "Division="+div+"," +
                "FeesPaid="+fees+"]";
    }
}
