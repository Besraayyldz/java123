package practice01;

import java.util.Scanner;

public class S06_Regex_Ve_StringManipulations {
    public static void main(String[] args) {
          /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız.
       Ad ayrı, soyad ayrı sekilde ekrana yazdırınız.
       Örnek:
          Ad: Ali
          Soyad: Can
    */
        Scanner input = new Scanner(System.in);
        System.out.println("ad soyad giriniz");
        String adSoyad = input.nextLine();
        String isim = adSoyad.split(" ")[0];
        String soyIsim = adSoyad.split(" ")[1];
        System.out.println("isim = " + isim);
        System.out.println("soyIsim = " + soyIsim);

    }
}
