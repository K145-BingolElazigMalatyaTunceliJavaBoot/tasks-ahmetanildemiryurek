package Week2.TypeOfCars;

import Week2.Cars;

public class Sedan extends Cars {
    private int monthlyRent;

    public Sedan(){
        super();
        this.monthlyRent=monthlyRent;
    }
    public int getMonthlyRent() {
        return monthlyRent+ (100 /getAge() * 30);
    }

    public void setMonthlyRent(int monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
}
