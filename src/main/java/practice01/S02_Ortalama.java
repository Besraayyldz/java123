package practice01;

import java.text.DecimalFormat;

public class S02_Ortalama {
    public static void main(String[] args) {
            /*
        double sayi1 = 23.4;
        double sayi2 = 24.0;
        double sayi3 = 12;
        double sayi4 = 450.3;
        double sayi5 = 23000;

        Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */

        double sayi1 = 23.4;
        double sayi2 = 24.0;
        double sayi3 = 12;
        double sayi4 = 450.3;
        double sayi5 = 23000;
        double toplam = sayi1+sayi2+sayi3+sayi4+sayi5;
        double ortalama = toplam/5;
        System.out.println(ortalama);

        DecimalFormat df = new DecimalFormat("0.00");
        df.format(ortalama);





    }
}
