package Week1;

public class SumPrimeNumber {
    public static void main(String[] args) {
        System.out.println("1. Hafta Odevler");
        //3 ile 100 arasında asal sayıların toplamını bulan program.
        System.out.println("3 ile 100 arasindaki asal sayilarin toplami."+"\n");
        int sayac = 0;
        int sayi;
        int asalToplam = 0;
        int i = 2;
        for (sayi = 3; sayi <= 100; sayi++) {
            int kontrol = 0;
            for (i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 0) {
                asalToplam = asalToplam+sayi;
                sayac++;
            }


        }
        System.out.println("Araliktaki Asal Sayi Sayisi : " + sayac);
        System.out.println("Asal Sayilar Toplami : " + asalToplam);
    }
}
