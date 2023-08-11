package ogrenci_practice01;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {

        //soru-1 kullanicidan 3 basamakli sayi alin
        //       11 ile bolunebilen pozitif tam sayilari yazdirin

        Scanner scanner;
        int sayi=103;

        while (sayi>=100 && sayi<1000){

            scanner=new Scanner(System.in);
            System.out.println("Uc basamakli sayi girniz:");
            sayi= scanner.nextInt();

            if (sayi<100 || sayi>=1000 ){
                System.out.println("Sayi 3 basamakli olmak zorunda");
            }else{
                if (sayi%11==0){
                    System.out.println("11 ile tam bolunur");
                } else {
                    System.out.println("Sayi 11 ile tam bolunmez");

                }
            }
            sayi++;

        }



    }


}
