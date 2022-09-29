package Week2;

public class Cars {
    private String baggageCapacity;
    private String carColor;
    private int dailyRent;
    private int age;


    public Cars(String baggageCapacity, String carColor , int dailyRent) {
        super();
        this.baggageCapacity = baggageCapacity;
        this.carColor = carColor;
        this.dailyRent=dailyRent;
    }

    public Cars() {

    }

    public String getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(String baggageCapacity) {
        this.baggageCapacity = baggageCapacity;

    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;

    }
    public int getDailyRent(){
        return dailyRent;
    }

    public void setDailyRent(int dailyRent) {
        this.dailyRent = dailyRent;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
