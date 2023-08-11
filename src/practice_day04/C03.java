package practice_day04;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        //Kullanıcıdan doğduğu ayın numarasını girmesini isteyip.
        //Hangi ay doğduğunu yazdıran kod dizesiniz yazın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dogdugunuz ayin numarasini giriniz");
        int month= scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("Ocak ayında doğmuşsunuz");
                break;
            case 2:
                System.out.println("Subat ayında doğmuşsunuz");
                break;
            case 3:
                System.out.println("Mart ayında doğmuşsunuz");
                break;
            case 4:
                System.out.println("Nisan ayında doğmuşsunuz");
            case 5:
                System.out.println("Mayis ayında doğmuşsunuz");
                break;
            case 6:
                System.out.println("Haziran ayında doğmuşsunuz");
                break;
            case 7:
                System.out.println("Temmuz ayında doğmuşsunuz");
                break;
            case 8:
                System.out.println("Agustos ayında doğmuşsunuz");
                break;
            case 9:
                System.out.println("Eylul ayında doğmuşsunuz");
                break;
            case 10:
                System.out.println("Ekim ayında doğmuşsunuz");
                break;
            case 11:
                System.out.println("Kasim ayında doğmuşsunuz");
                break;
            case 12:
                System.out.println("Aralik ayında doğmuşsunuz");
                break;
            default:
                System.out.println(month+" olarak girdiginiz ayin numarasi hatali girilmistir");
        }



    }
}
