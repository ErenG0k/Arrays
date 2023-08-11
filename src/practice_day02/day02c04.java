package practice_day02;

import java.util.Scanner;

public class day02c04 {
    public static void main(String[] args) {

             /*
       1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       Ornek:  gun=Pazar output = “Hafta sonu”  gun=Sali output = “Hafta ici”
       *** String icin equals method’unusalı kullanin
        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Girmek istediginiz gunu yazin:");

        String gunadi = scanner.next().toLowerCase();

        if (gunadi.equals("cumartesi") || gunadi.equals("pazar")) {
            System.out.println("Hafta sonu");
        } else if (gunadi.equals("pazartesi") || gunadi.equals("sali") || gunadi.equals("carsamba") || gunadi.equals("persembe") || gunadi.equals("cuma")) {
            System.out.println("Hafta ici");
        }
        if (!(gunadi.equals("pazartesi") || gunadi.equals("sali") || gunadi.equals("carsamba") || gunadi.equals("persembe") || gunadi.equals("cuma") || gunadi.equals("cumartesi") || gunadi.equals("pazar"))) {
           System.out.println("Gecersiz gun girdiniz");
        }


            /*
       2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
    Yıl sonu notunu vizeler %40 final % 60 olacak şekilde hesaplayıp
    Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
    50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
    Ad:
    Soyad:
    1.Vize:
    2. Vize:
    Final :
    Yıl Sonu Notu:
    Ders Durumu :
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Adinizi giriniz:");
        String isim = scan.nextLine();

        System.out.println("Soyadinizi giriniz:");
        String soyad = scan.nextLine();

        System.out.println("1. vize notunu giriniz:");
        double vize1 = scan.nextDouble();

        System.out.println("2.vize notunu giriniz:");
        double vize2 = scan.nextDouble();

        System.out.println("Final notunu giriniz");
        double final1 = scan.nextDouble();

        double yilsonunotu = ((((vize1 + vize2) / 2) * 40 / 100) + (final1 * 60 / 100));

        System.out.println("Adiniz: " + isim);
        System.out.println("Soyadiniz: " + soyad);
        System.out.println("1.vize notu: " + vize1);
        System.out.println("2.vize notu: " + vize2);
        System.out.println("Final notu: " + final1);
        System.out.println("Yilsonu notunuz " + yilsonunotu);
        if (yilsonunotu >= 50) System.out.println("Ders Durumu : Gectiniz Tebrikler!");
        else if (yilsonunotu<50) System.out.println("Ders Durumu : Maalesef Kaldiniz");

    }


    }













