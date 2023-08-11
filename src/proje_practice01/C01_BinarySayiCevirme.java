package proje_practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C01_BinarySayiCevirme {

     /*
    Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
    Örnek: 12 = 1 1 0 0
     */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Desimal değer giriniz: ");
        int sayi= scanner.nextInt();
        System.out.println(sayi+" desimal sayısının binary karşılığı: "+ binaryConvert(sayi));
    }

    public static List<Integer>binaryConvert(int sayi) {
        List<Integer> binary = new ArrayList<>();
        while (sayi > 0) {
            binary.add(sayi % 2);
            sayi /= 2;
        }
/*
        List<Integer>tersbinary=new ArrayList<>();
        for (int i = binary.size()-1; i >=0 ; i--) {
            tersbinary.add(binary.get(i));

        }
        return tersbinary;

        Bu sekilde klasik yolla yapilabilir ama daha pratik bir cozumu var

 */

        Collections.reverse(binary);//return methodu ile ters yazdirabiliriz
        return binary;
    }
}

