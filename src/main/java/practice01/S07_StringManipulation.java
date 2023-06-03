package practice01;

import java.util.Scanner;

public class S07_StringManipulation {
    public static void main(String[] args) {
          /*
        Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
        Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
        Örnek: Mark Hansel Twain ==> HT
    */

        Scanner input = new Scanner(System.in);
        System.out.println("ad1 ad2 ve soyad giriniz");
        String ad1Ad2Soyad= input.nextLine().toUpperCase();
        String ad = ad1Ad2Soyad.split(" ")[1];
        System.out.println(ad.charAt(0));

        String soyAd = ad1Ad2Soyad.split(" ")[2];
        System.out.println(soyAd.charAt(0));





    }
}
