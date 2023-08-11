package practice_day04;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        /*
    Kulanıcıdan sıfırdan farklı pozitif bir tam sayı alalım
    ve 1'den o sayıya kadar olan sayılardan 4 ile bölünebilenleri yazıdırın
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("sıfırdan farklı pozitif bir tam sayı giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <sayi ; i++) {
            if (i%4==0){
                System.out.println(i +"-");
            }

        }




    }
}
