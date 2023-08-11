package practice_day04;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

         /*
        Soru: Kenar değerleri verilen üçgenin ikizkenar üçgen olup olmadığını kontrol edip
        dönüt veren kod dizisini yazınız.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikizkenar ucgen olup olmadığının kontrol edilecek olan ucgenin kenarlarini giriniz");

        System.out.println("Birinci kenari giriniz: ");
        double a= scanner.nextDouble();

        System.out.println("Ikinci kenari giriniz: ");
        double b= scanner.nextDouble();

        System.out.println("Ucuncu kenari giriniz: ");
        double c= scanner.nextDouble();

        if (a>0 && b>0 && c>0) {
            if (a == b || a == c || b == c) {
                System.out.println("Girdiginiz ucgen ikizkenar ucgendir");
            }
            else System.out.println("Giridiğiniz değerlere sahip üçgen bir ikizkenar üçgen değildir.");

        }else System.out.println("Yanlis giris yaptiniz");


        System.out.println("===============Ternary ile cozum===============");

         /*
        Soru: Kenar değerleri verilen üçgenin ikizkenar üçgen olup olmadığını kontrol edip
        dönüt veren kod dizisini yazınız.
         */

        System.out.println(a > 0 && b > 0 && c > 0 ? //bir
                a == b || a == c || b == c ? //iki
                        "Girdiğiniz değerler bir ikizkenar üçgene aittir" ://iki
                        "Girdiğiniz üçgen ikizkenar değildir":
                "Yanlış Değer girdiğiniz ");




    }
}
