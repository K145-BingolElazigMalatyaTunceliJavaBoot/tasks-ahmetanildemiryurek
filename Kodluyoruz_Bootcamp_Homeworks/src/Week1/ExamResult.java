package Week1;

import java.util.Scanner;
public class ExamResult {
    public static void main(String[] args) {
        System.out.println("1. Hafta Odevler");
        System.out.println("Okul puanlarinin harf karsiligini yazan program."+"\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Aldiginiz notu giriniz : ");
        int not = scan.nextInt();

        if (not<=35 && not>=0){
            System.out.println("Aldiginiz Not : FF ");
        } else if (not<=50 && not>=35) {
            System.out.println("Aldiginiz Not : DC ");
        } else if (not<=70 && not>=50) {
            System.out.println("Aldiginiz Not : BB");
        } else if (not<=100 && not>=70) {
            System.out.println("Aldiginiz Not : AA");
        }else {
            System.out.println("Gecersiz not girdiniz ! ! !");
        }

    }
}