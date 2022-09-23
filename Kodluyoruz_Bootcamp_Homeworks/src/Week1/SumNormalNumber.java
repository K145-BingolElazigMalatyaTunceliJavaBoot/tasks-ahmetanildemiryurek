package Week1;

public class SumNormalNumber {
    public static void main(String[] args) {
        System.out.println("1. Hafta Odevler");
        System.out.println("200 ile 500 arasındaki 3 ile tam bölünen sayılar " +
                "dışındaki sayıların toplamını bulan program"+"\n");
        int toplam=0;
        for (int i = 200; i <=500 ; i++) {
            if (i % 3 != 0){
                toplam+=i;
            }
        }
        System.out.println("Toplamlar : "+toplam);
    }
}
