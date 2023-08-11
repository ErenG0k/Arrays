package my_projects;

import java.util.Scanner;

public class x3 {
    public static void main(String[] args) {
        // kullanicidan toplanmak uzere pozitif sayilar isteyin
        // kullanici islemi bitirmek icin 0'a basmalidir
        // kullanici 0'a bastiginda kac pozitif sayi girdigini
        // ve toplamlarinin kac oldugunu yazdirin


        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int sayi;

        do {
            scanner = new Scanner(System.in);
            System.out.println("Pozitif tam sayi giriniz");
            sayi = scanner.nextInt();

            if (sayi!=0){
                toplam+=sayi;
                sayac++;
            }


        } while (sayi != 0);

        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);


    }
}
