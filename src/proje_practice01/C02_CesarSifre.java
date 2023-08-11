package proje_practice01;

import java.util.Scanner;

public class C02_CesarSifre {
    public static void main(String[] args) {

        /*
       2. SORU
    Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
    Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
    Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
    Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.
    //hello ----> ıfmmp --->1 birim kaydırılmış hali

     */


        Scanner scanner =new Scanner(System.in);
        System.out.println("Şifrelenecek metni giriniz: ");
        String sifre= scanner.nextLine().toUpperCase();
        System.out.println("Kaydirma miktarini giriniz : ");
        int kaydirma = scanner.nextInt();
        sifreleme(sifre,kaydirma);


    }
    public static void sifreleme(String sifre,int kaydirmaMiktari){
        String sifrelenmisMetin="";
        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i <sifre.length() ; i++) {
            char karakter=sifre.charAt(i);
            int karakterindex=alfabe.indexOf(karakter);
            int yeniindex=(karakterindex+kaydirmaMiktari)%alfabe.length();
                                         //(26       +    3) % 26 =  3
            //karakterIndexin ve kaydırma miktarını ekledikten sonra alfabe uzunluğunu geçmemesi için alfabe
            //uzunluğuna modu alınarak alfabe değerleri içinde yeniIndex değeri elde edilmiş oldu

            sifrelenmisMetin+=alfabe.charAt(yeniindex);
            
        }
        System.out.println("Sifrelemis metin: " + sifrelenmisMetin);

    }
}
