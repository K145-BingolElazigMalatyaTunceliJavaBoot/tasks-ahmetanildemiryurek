package Week3.Homework1;

import Week3.Homework1.ContentManager.AddFruit;
import Week3.Homework1.ContentManager.BuyFruit;
import Week3.Homework1.Content.Apple;
import Week3.Homework1.Content.Melon;
import Week3.Homework1.Content.Orange;
import Week3.Homework1.Content.Pear;


public class Main {
    public static void main(String[] args) throws Exception{
        BuyFruit buyFruit = new BuyFruit();
        AddFruit addFruit = new AddFruit();

        Apple apple = new Apple();
        Melon melon = new Melon();
        Pear pear = new Pear();
        Orange orange= new Orange();

        addFruit.add(apple , 20);
        addFruit.add(melon , 19);
        addFruit.add(pear , 18);
        addFruit.add(orange , 17);

        buyFruit.buyFruit(apple , 15);
        buyFruit.buyFruit(melon , 14);
        buyFruit.buyFruit(pear , 13);
        buyFruit.buyFruit(orange , 18);


    }



}
