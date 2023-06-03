package practice01;

public class S03_Hipotenus {
    public static void main(String[] args) {
         /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */

        double a = 3;
        double b = 4;
        //pow(a,2); a yi iki kere cerp demek
        //sqrt() ise karekok demek
        double hipotenus = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(hipotenus);
    }
}
