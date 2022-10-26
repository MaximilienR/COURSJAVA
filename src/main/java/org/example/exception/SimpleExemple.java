package org.example.exception;

import java.util.Scanner;

public class SimpleExemple {

    public static void main(){

        System.out.println("***** division *****");
        Scanner scanner=new Scanner(System.in);
        System.out.println("veuillez saisir un nombre");
        Integer valeur = scanner.nextInt();
        System.out.println("veuillez entrer un diviseur");
        Integer diviseur = scanner.nextInt();

        try {
            double resultat=valeur/diviseur;
            System.out.println("resultat :"+resultat);
        }catch (Exception e){

        System.out.println("on ne peut pas diviser par 0");

    }





}
}
