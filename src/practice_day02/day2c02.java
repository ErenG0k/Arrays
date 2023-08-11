package practice_day02;

import java.util.Scanner;

public class day2c02 {
    public static void main(String[] args) {

        //2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
        //üçgenin alanını hesaplayıp yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen alanı hesaplanacak olan üçgenin ilgili ayrıt değerlerini giriniz");
        System.out.println();

        System.out.println("Alani hesaplanacak ucgenin kenarini girin:");
        double kenar = scanner.nextDouble();

        System.out.println("Alani hesaplanacak ucgenin yuksekligini girin:");
        double yukseklik = scanner.nextDouble();

        System.out.println("Ucgenin alani:"+((kenar*yukseklik)/2));










    }
}
