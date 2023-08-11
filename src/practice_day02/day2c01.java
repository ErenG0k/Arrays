package practice_day02;

import java.util.Scanner;

public class day2c01 {
    public static void main(String[] args) {

        //1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        //sisteme kaydedildiğini aşağıdaki formatta yazdırın.
        //        *****       KAYIT BAŞARILI      *****
        //Adınız: Tarık
        //Soyadınız: Yiğit
        //Yaşınız:42
        //Mail Adresiniz:tarik@yigit.com
        //Şifreniz: A2e365
        //şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen asagidaki bilgileri giriniz!");
        System.out.println();

        System.out.println("Adiniz:");
        String isim = scanner.nextLine();

        System.out.println("Soyadiniz:");
        String soyad= scanner.nextLine();

        System.out.println("Yasiniz:");
        int yas = scanner.nextInt();

        System.out.println("Mail adresiniz:");
        String mail= scanner.next();

        System.out.println("Sifreniz:");
        String sifre= scanner.next();

        System.out.println("*****       KAYIT BAŞARILI      *****");

        System.out.println("Adiniz: " + isim);
        System.out.println();
        System.out.println("Soyadiniz: " + soyad);
        System.out.println();
        System.out.println("Yasiniz: " + yas);
        System.out.println();
        System.out.println("Mail adresiniz: " + mail);
        System.out.println();
        System.out.println("Sifreniz: " + sifre);
        System.out.println();
        System.out.println("Seklinde sistemimize kaydınız başarıyla tamamlanmıştır.");



        /*
        bu derste next line atlama problemi ile karsilastim
        sebebi herhangi bir next line verisinden sonra int tam sayi verisi istenirse
        o satiri atliyor
        cozum int veriseinden sonra bos satira    System.out.println(); yazilarak
        atlama problemi duzeltilebilir
         */












    }
}
