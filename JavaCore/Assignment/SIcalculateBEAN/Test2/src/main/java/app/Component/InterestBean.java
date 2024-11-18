package app.Component;

public class InterestBean {
    private double Amount;
    private double period;
    private double rate;
    public double getAmount() {
        return Amount;
    }
    public void setAmount(double amount) {
        Amount = amount;
    }
    public double getPeriod() {
        return period;
    }
    public void setPeriod(double period) {
        this.period = period;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public double  getInterest(){
        return (Amount * period * rate)/100;
    }
}

