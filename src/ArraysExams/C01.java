package ArraysExams;

import java.util.ArrayList;
import java.util.List;

public class C01 {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip, -
        // Kelimenin uzunlugu cift sayi ise ilk yarisini -
        // Kelimenin uzunlugu tek sayi ise
        // ortadaki harf dahil ikinci yarisini yeni bir listeye ekleyip yazdirin.

        String [] str ={"Burhan", "Nergiz","Seref","Senol"};

        // bunun kontrolunu saglamak icin bir method olusturacaz

        isimkontrol(str);



    }
    public static void isimkontrol(String[]str){

        List<String>yenilist=new ArrayList<>();
        for (String each:str
             ) {
            if (each.length()%2==0){
                yenilist.add(each.substring(0,each.length()/2));
            }else {
                yenilist.add(each.substring((each.length()-1)/2));
            }

        }
        System.out.println(yenilist);


    }
}
