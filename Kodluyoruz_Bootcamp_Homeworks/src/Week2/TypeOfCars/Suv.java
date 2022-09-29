package Week2.TypeOfCars;

import Week2.Cars;

public class Suv extends Cars {
    private int monthlyRent;
    public Suv(){
        super();
        this.monthlyRent=monthlyRent;

    }
    public int getMonthlyRent() {

        return monthlyRent + (100 /getAge() * 30);
    }

    public void setMonthlyRent(int monthlRent) {
        this.monthlyRent = monthlyRent;
    }

}
