package practice01;

public class S05_Sayiyi_Basamaklarina_Ayirma {
    public static void main(String[] args) {
         /* 
        Bir tamsayıyı basamaklarına ayıran bir kod yazınız. 
        İpucu: / ve % kullanınız 
        Sayı: 12345 
        Çıktı: 1 
               2 
               3 
               4 
               5 
    */
        int sayi = 12345;
        int birlerBasamagi = sayi%10;
        System.out.println("birlerBasamagi = " + birlerBasamagi);
        int onlarBasamagi = (sayi/10)%10;
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        int yuzlerBasamagi = (sayi/100)%10;
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);
        int binlerBasamagi = (sayi/1000)%10;
        System.out.println("binlerBasamagi = " +binlerBasamagi);
        int onBinlerBasamagi = sayi/10000;
        System.out.println("onBinlerBasamagi = " + onBinlerBasamagi);




    }
}
