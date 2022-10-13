package Week3.Homework1.ContentManager;

import Week3.Homework1.Content.Fruit;

public class BuyFruit {
    public void buyFruit(Fruit fruit, int kg) throws Exception {
        if (fruit.getKg() < kg) {
            throw new Exception("Depoda " + kg + " kilogram " + fruit.getFruitName() + " bulunmamaktadir !");
        } else {
            System.out.println(kg + " kg " + fruit.getFruitName() + " Satin alindi !");
        }
    }

}