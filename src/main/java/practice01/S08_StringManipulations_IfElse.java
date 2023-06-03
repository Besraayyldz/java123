package practice01;

import java.util.Scanner;

public class S08_StringManipulations_IfElse {
    public static void main(String[] args) {
          /*
        Kullanıcının girdiği bir String ifadenin son üç karakterini alarak bu üç karakteri
        String ifadenin başına ve sonuna ekleyen bir Java programı yazınız.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime= input.nextLine();
        if(kelime.length()>3){
            String ucHarf = kelime.substring(kelime.length()-3);
            System.out.println(ucHarf+kelime+ucHarf);
        }else {
            System.out.println("kelime kisa");
        }




    }
}
