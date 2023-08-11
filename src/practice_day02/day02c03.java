package practice_day02;

import java.util.Scanner;

public class day02c03 {
    public static void main(String[] args) {

        //SORU 1 -Kullanıcıdan iki sayı alıp üçüncü bir
        //değişken kullanmadan sayı değerlerini değiştirin (Swap)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Degistirilecek olan 2 sayiyi giriniz");

        System.out.println("Sayi 1:");
        double sayi1= scanner.nextDouble();
        System.out.println("Sayi 2:");
        double sayi2= scanner.nextDouble();

        System.out.println("sayi 1 in yeni degeri:" + ((sayi1+sayi2) - sayi1));
        System.out.println("sayi 2 in yeni degeri:"+ ((sayi1+sayi2) - sayi2));



           /*
      SORU 2 -Int olarak verilen 3 sayının toplamını double olarak yazdırın
      ipucu: double>float>long>int>short>byte
     */

        int a=8,b=6,c=9;
        int toplam=(a+b+c);
        System.out.println("Toplam= "+(double) toplam);
        System.out.println("Toplam= " + (long) toplam);




         /*
        SORU 3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
        sonucu tam sayı yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki double sayi giriniz");

        double sayi3= scanner.nextDouble();
        double sayi4= scanner.nextDouble();

        int sonuc = (int)(sayi1/sayi2);
        System.out.println("sonuc="+sonuc);











    }
}
