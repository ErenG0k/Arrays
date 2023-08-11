package my_projects;

import java.util.Scanner;

public class x2 {
    public static void main(String[] args) {


        // Kullanicidan toplanmak uzere sayilar alin
        // girilen sayilarin toplami 500'u gecerse
        // bu kadar sayi yeter, girilen sayilarin toplami .... oldu yazdirin
        // girilen sayi adedi 10 veya daha yuksek olursa
        // 10'dan fazla sayi giremezsin, girilen sayilarin toplami .... oldu yazdirin
        // ve islemi bitirin

        Scanner scanner;
        int sayi=0;
        int sayac=0;
        int toplam=0;

        while (sayac<=10 && toplam<=500){
            scanner=new Scanner(System.in);
            System.out.println("Toplanmasini istediginiz sayilari giriniz");
            sayi= scanner.nextInt();

            toplam+=sayi;
            sayac++;
        }

        if (sayac>=10) System.out.println("10'dan fazla sayi giremezsin,girilen sayilarin toplami "+ toplam +" oldu");
        if (toplam>500) System.out.println("bu kadar sayi yeter, girilen sayilarin toplami " +toplam +" oldu");


        // kullanicidan toplanmak uzere pozitif sayilar isteyin
        // kullanici islemi bitirmek icin 0'a basmalidir
        // kullanici 0'a bastiginda kac pozitif sayi girdigini
        // ve toplamlarinin kac oldugunu yazdirin






    }
}
