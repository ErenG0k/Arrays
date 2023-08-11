package proje_practice01;

import java.util.Arrays;
import java.util.Scanner;

public class C03_MountainArray {

    /*
   MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadığını kontrol ediniz.
   Mountain array ==> [0,2,5,3,1]
   Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.
   Mountain array değildir ==>[5,2,7,1,4]
    */
    public static void main(String[] args) {
        System.out.print("Mountain array kontrolu yapılacak değerlerin arasına virgül koyarak giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String degerler = scanner.next();
        String[] degerlerArr = degerler.split(",");

        mountainArrControl(degerlerArr);
    }

    private static void mountainArrControl(String[] degerlerArr) {
        int enBuyukDegerIndex = 0, enBuyukDeger = 0;
        boolean control = false;
        for (int i = 0; i < degerlerArr.length; i++) {
            if (enBuyukDeger < Integer.parseInt(degerlerArr[i])) {
                enBuyukDeger = Integer.parseInt(degerlerArr[i]);
                enBuyukDegerIndex = i;
            }
        }
        //başlangıçtan en büyük değere kadar artan kısım kontrolu
        for (int i = 0; i < enBuyukDegerIndex; i++) {
            if (i != enBuyukDegerIndex) {
                if (Integer.parseInt(degerlerArr[i]) < Integer.parseInt(degerlerArr[i + 1])) {
                    control = true;
                } else {
                    control = false;
                    break;
                }
            }
        }
        //en büyük değerden son indexe kadar azalan kontrolu
        for (int i = enBuyukDegerIndex; i < degerlerArr.length; i++) {
            if (i != degerlerArr.length - 1) {
                if (Integer.parseInt(degerlerArr[i]) > Integer.parseInt(degerlerArr[i + 1])) {
                    control = true;
                } else {
                    control = false;
                    break;
                }
            }
        }
        if (control) {
            System.out.println(Arrays.toString(degerlerArr) + " arrayi mountain arraydir...");
        } else {
            System.out.println(Arrays.toString(degerlerArr) + " arrayi mountain array değildir...");
        }
    }

}
