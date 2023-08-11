package my_projects;

import java.util.Scanner;

public class x {
    public static void main(String[] args) {


        //Soru 4 : Main method'da kullanicidan sifre isteyip,
        //         olusturacagimiz bir method'da asagidaki sartlari kontrol edin
        //         ve method'dan true veya false dondurun
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglanincaya kadar tekrar deger isteyin
        //         ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        Scanner scan;
        String sifre;
        boolean sonuc = false;

        while (!sonuc) {
            scan = new Scanner(System.in);
            System.out.println("SIfrenizi giriniz");
            sifre = scan.nextLine();
            sonuc = SifreKontrol(sifre);
        }

    }

    public static boolean SifreKontrol(String sifre) {
        int sayac = 1;

        char ilkharf = sifre.charAt(0);
        if (!(ilkharf >= 'a' && ilkharf <= 'z')) {
            System.out.println("Ilk harf kucuk olmali");
            sayac++;
        }

        char sonkarakter = sifre.charAt(sifre.length() - 1);
        if (!(sonkarakter >= '1' && sonkarakter <= '9')) {
            System.out.println("Son karakter rakam olmalidir");
            sayac++;
        }

        if (sifre.equals(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }
        if (!(sifre.length() >= 10)) {
            System.out.println("SIfre 10 en az 10 karakter olmali");
            sayac++;
        }

        if (sayac==0){
            return true;
        }else{
            return false;
        }

    }






}


