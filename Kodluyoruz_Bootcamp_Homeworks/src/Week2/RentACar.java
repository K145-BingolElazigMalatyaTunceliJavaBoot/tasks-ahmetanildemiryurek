package Week2;

import Week2.Customer;
import Week2.TypeOfCars.Hatchback;
import Week2.TypeOfCars.Suv;
import Week2.TypeOfCars.Sedan;

public class RentACar {
    public static void main(String[] args) {

        Hatchback hatchback = new Hatchback();
        Suv suv = new Suv();
        Sedan sedan = new Sedan();


        // Hatchback tipi arac
        hatchback.setCarColor("blue");
        hatchback.setDailyRent(300);
        hatchback.setBaggageCapacity("Small");

        //Sedan tipi arac
        sedan.setCarColor("Black");
        sedan.setDailyRent(400);
        sedan.setMonthlyRent(12000);
        sedan.setBaggageCapacity("Medium");

        //Suv tipi arac
        suv.setCarColor("White");
        suv.setDailyRent(500);
        suv.setMonthlyRent(15000);
        suv.setBaggageCapacity("Large");


        Customer customer = new Customer(false);
        customer.rentCar(hatchback,suv,sedan);

        Customer companyCustomer = new Customer(true);
        companyCustomer.rentCar(hatchback,suv,sedan);
    }

}
