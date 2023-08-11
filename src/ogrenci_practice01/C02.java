package ogrenci_practice01;

import java.util.Arrays;

public class C02 {
    public static void main(String[] args) {

        //soru-2  verilen arrayin elemanlarini bir saga kaydirip
        //        sondaki elementide basa tasiyacak bir method olusturun,arrayi yeni haliyle kaydedin

        int[] arr={13,20,50,43};
        System.out.println(Arrays.toString(arr));

        arr=elemanlaribirKaydirma(arr);
        System.out.println(Arrays.toString(arr));



    }

    public static int[] elemanlaribirKaydirma(int [] arr){

        int gecici=arr[arr.length-1];


        for (int i = arr.length-2; i >0 ; i--) {
            arr[i+1]=arr[i];

        }

        arr[0]=gecici;

        return arr;
    }
}
