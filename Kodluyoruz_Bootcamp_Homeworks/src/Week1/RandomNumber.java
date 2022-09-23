package Week1;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("1. Hafta Odevler");
        Random random = new Random();
        int sayac=0,
        sayi=0;

        while (sayi < 50 || sayi > 100) {
            System.out.println(sayi);
            sayac++;
            sayi=random.nextInt(500);

        }
        System.out.println(sayac + ". denemede buldugumuz sayi :" + sayi);
    }
}

