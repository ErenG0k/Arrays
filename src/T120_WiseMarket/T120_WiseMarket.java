package T120_WiseMarket;

import java.util.Scanner;

public class T120_WiseMarket {

        /*
     Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
     alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince giş yazdıran bir program
     hazırlayın
      ==================== WISE MARKET KASA PROGRAMI ===================================
    ilk programa girildiginde bizi bir menu karsilasin bu secenekler
      1 ŞARKÜTERİ ÜRÜNLERİ
      2 MANAV ÜRÜNLERİ
      3 MARKET ÜRÜNLERİ
      secime gore ,
      4-urunleri listele ve
      5-fiyatlari gelsin
      Variable'ları belirleyelim
      urunAdi, urunFiyatı, urunMiktari, urunKodu, sepet, toplam


    static Scanner scan=new Scanner(System.in);
    static String urunadi;
    static double urunfiyati;//double: ondalıklı sayı için kullanılır
    static double urunmiktari;
    static int urunkodu; //int : tam sayı değerleri için kullanılır.
    static String sepet;
    static double toplam;
    static boolean ekurun=false;





    public static void main(String[] args) {

    }
    public static void girisekrani(){

        System.out.println("================= T120 - WISE MARKET =================");
        System.out.println("=================    Hoşgeldiniz     =================");
        System.out.println("-----------------       Menü         -----------------");
        System.out.println("   Lütfen Alışveriş Yapmak İstediğiniz Reyonu Seçiniz  ");
        System.out.println("1 - Şarküteri \n2 - Manav\n3 - Market\n4 - Fiş Yazdır\n5 - Çıkış");

        int secim= scan.nextInt();

        if (secim<1 || secim>5){//if(!(secim>=1 && secim<=5))
            System.out.println(" Uyarı: Geçersiz bir tuşa bastınız. Tekrar Giriniz ");
            girisekrani();
        }else{
            switch (secim){
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisyazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:

            }
        }
    }


    public static void sarkuteri(){
        System.out.println("Şarkuteri Reyonuna Hoşgeldiniz");
        System.out.println("Lütfen almak istediğiniz ürün numarasını giriniz.\n61-Kaşar Peyniri 130₺\n62-Zeytin 120₺\n63-Sucuk 200₺\n64-Kıyma 350₺ ");
        while (!ekurun)
        urunkodu= scan.nextInt();
        if (urunkodu<61||urunkodu>64){
            System.out.println("Hatali urun kodu girdiniz");
        }else
            switch ()


    }
    public static void manav(){

    }
    public static void market(){

    }
    public static void fisyazdir(){

    }
    public static void cikis(){

         */

    }

