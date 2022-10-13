package org.example.readFromConsole;

import java.util.Scanner;

public class ReadFromConsole {
    public  static void  getReadWriteConsole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("stp donne moi un mot");
       String mot =sc.next();
        System.out.println("le mot donné est "+ mot);
        System.out.print("");
        System.out.print("");
        System.out.println("stp donne moi un nombre");
        int valeur = sc.nextInt();
        System.out.println("tu m'as donné le numéro " + valeur);
    }
}
