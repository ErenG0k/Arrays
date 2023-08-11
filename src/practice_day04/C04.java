package practice_day04;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        // Kulanıcıdan o günün hangi gün olduğunu girmesini isteyip
        //Haftanın kaçıncı günü oldupunu yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Bugün Günlerden Hangi Gün: ");
        String gun= scan.nextLine();
        gun=gun.toLowerCase();

        switch (gun){
            case "pazartesi":
                System.out.println(gun+" Haftanın 1. günüdür");
                break;
            case "sali":
                System.out.println(gun+" Haftanın 2. günüdür");
                break;
            case "carsamba":
                System.out.println(gun+" Haftanın 3. günüdür");
                break;
            case "persembe":
                System.out.println(gun+" Haftanın 4. günüdür");
                break;
            case "cuma":
                System.out.println(gun+" Haftanın 5. günüdür");
                break;
            case "cumartesi":
                System.out.println(gun+" Haftanın 6. günüdür");
                break;
            case "pazar":
                System.out.println(gun+" Haftanın 7. günüdür");
                break;
            default:
                System.out.println("Yanlis gun numarasi girdiniz");
        }

    }
}
