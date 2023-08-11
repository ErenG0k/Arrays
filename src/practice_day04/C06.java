package practice_day04;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin 1 den baslayip sayiya kadar olan sayilarin icinden 4 e bolunebilenleri yazdirin


        Scanner scan =new Scanner(System.in);
        System.out.println("0 dan buyuk bir tam sayi giriniz: ");
        int sayi= scan.nextInt();

            if (sayi<0){
                System.out.println("Yanlis sayi girdiniz");
            }else
                for (int i = 1; i <= sayi; i++) {

                    if (i%4==0){
                        System.out.print(i+"-");
                    }

                }


                }
            }


