package practice01;

import java.util.Scanner;

public class S04_Hipotenus_Metot {
    public static void main(String[] args) {
          /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */
        Scanner input = new Scanner(System.in);
        System.out.println("iki kenar giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double hipo = hipotenus(a,b);
        System.out.println(hipo);
    }

    private static double hipotenus(double a, double b) {
        double hipotenus = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return hipotenus;
    }


}
