package practice_day04;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        /*

        Soru: kenar değerleri girilen bir üçgenin dik üçgen olup olmadığını kontrol edip dönüt veren kod dizisini yazınız

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Diklik kontrolunu istediginiz ucgenin kenarlarini giriniz:");

        System.out.println("Birinci kenari giriniz:");
        int a = scanner.nextInt();

        System.out.println("Ikinci kenari giriniz:");
        int b = scanner.nextInt();

        System.out.println("Ucuncu kenari giriniz:");
        int c = scanner.nextInt();                  //dik ucgen islemi a kare + b kare = c kare mantigi ile

        if ((a * a) + (b * b) == (c * c)) {
            System.out.println("Girdiginiz ucgen dik ucgendir");

        } else if ((a * a) + (c * c) == (b * b)) {
            System.out.println("Girdiginiz ucgen dik ucgendir");

        } else if ((b * b) + (c * c) == (a * a)) {
            System.out.println("Girdiginiz ucgen dik ucgendir");


            System.out.println("========== 2. cozum ==========");
            if ((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a)) {

                 /*
             ||:OR (VEYA) işareti ile yazılanlardan sadece birinin doğrulanması yeterlidir.
             &&: AND (VE) işareti ile yazılanların tamamı doğru olması gerekir
                 */

                System.out.println("Girdiginiz ucgen dik ucgendir");

            }else System.out.println("Girdiğiniz değerlere sahip bir üçgen dik üçgen değildir");


        }
    }
}
