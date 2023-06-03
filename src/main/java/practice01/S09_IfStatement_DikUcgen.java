package practice01;

import java.util.Scanner;

public class S09_IfStatement_DikUcgen {
    public static void main(String[] args) {
         /*
        Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları
         olup olmadığını hesaplayan bir kod yazınız.
        (Not: Bir üçgenin dik olduğunu anlamak için a^2 + b^2 = c^2
         pisagor bağlantısından yararlanabilirsiniz)
         birde hethod olusturarak coz
    */
        Scanner input = new Scanner(System.in);
        System.out.println("uc adet sayi giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();

        if((sayi1*sayi1)+(sayi2*sayi2)==sayi3*sayi3){
            System.out.println("dik ucgendir");
        }else {
            System.out.println("dik ucgen degildir");
        }



    }
}
