package finance;

public class PersonalLoan {

    public float common(double amount, int period) {
        return 11 + 0.5f * (period / 3);
    }

    public float employee(double amount, int period) {
        return common(amount, period) - 5;
    }
}
