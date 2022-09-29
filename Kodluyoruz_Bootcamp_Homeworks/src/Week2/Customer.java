package Week2;

import Week2.TypeOfCars.Hatchback;
import Week2.TypeOfCars.Sedan;
import Week2.TypeOfCars.Suv;

public class Customer {
    private boolean customer;

    public Customer(boolean customer) {
        this.customer = customer;
    }

    public void rentCar(Hatchback hatchback, Suv suv, Sedan sedan) {
        if (customer) {
            System.out.println("Sirket Müsterisi oldugunuz icin bütün arabalari kiralayabilirsiniz !");
        } else {
            System.out.println("Sadece Hatchback araclari Kiralayabilirsiniz ! ");
        }
    }
}
