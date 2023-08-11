package ogrenci_practice01;

import java.util.ArrayList;

public class C03 {
    public static void main(String[] args) {

        //soru-3   verilen iki arrayin elemanlarini karsilastirip
        //         ikisinde de ortak olan elementleri ayri bir liste olarak vermesini saglayin

        String[]str1={"Esra","Ali","Neriman","Selim","Inci","Yigit","Ayse"};
        String[]str2={"Emine","Kiraz","Inci","ali","Selim","Hilmi"};

        ArrayList<String > ortakisimler=new ArrayList<>();

        for (String each1:str1
             ) {
            for (String each2:str2
                 ) {if (each1.equalsIgnoreCase(each2) && !(ortakisimler.contains(each1))){
                     ortakisimler.add(each1);
            }

            }

        }
        System.out.println(ortakisimler);
    }
}
