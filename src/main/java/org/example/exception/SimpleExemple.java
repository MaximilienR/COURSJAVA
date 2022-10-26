package org.example.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExemple {

    public static void main(){

        System.out.println("***** division *****");
        Scanner scanner=new Scanner(System.in);


        try {
            System.out.println("veuillez saisir un nombre");
            Integer valeur = scanner.nextInt();
            System.out.println("veuillez entrer un diviseur");
            Integer diviseur = scanner.nextInt();
            double resultat=valeur/diviseur;
            System.out.println("resultat :"+resultat);
        }catch (ArithmeticException |InputMismatchException e) {
          e.printStackTrace();
          SimpleExemple.main();
            //  System.out.println("Exception"+e.getStackTrace());
          /*  System.out.println("on ne peut pas diviser par 0");
            System.out.println("tu recommence...");
            SimpleExemple.main();
        }catch(InputMismatchException e) {
            System.out.println("tu dois saisir des entiers");*/
        }catch (Exception e){
            System.out.println("c'est une exception");
        }

    }
}
