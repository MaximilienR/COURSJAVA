package org.example.string;

import java.util.Arrays;

public class ChaineCaractere {
    public static void getMethodString(){
        System.out.println("-----les chaines de caractère -----");
        System.out.println();

        String s = "hello";

        System.out.println("s.length()"+s.length()); //7
        System.out.println("s.contains(\"he\")" + s.contains("he")); //true
        System.out.println("s.isEmpty : "+s.isEmpty());
        System.out.println("s.toUppercase" + s.toUpperCase());//Hello
        System.out.println("s.startWith(\"h\")" +s.startsWith("h"));
        System.out.println("s.endsWith(\"\")"+s.endsWith(" "));
        System.out.println("s.replace(\"ll\",\"ll\")" + s.replace("ll","LL"));//hello
        System.out.println("s.trim()"+s.trim());//hello
        System.out.println("s.substring(0,3):"+s.substring(0,3));

        System.out.println("Arrays.toString(s.getBytes()):" +Arrays.toString(s.getBytes()));
        System.out.println("Arrays.toString(s.toString(s.toCharArray())"+ Arrays.toString(s.toCharArray()));
        System.out.println("s.charAt(1) :" + s.charAt(1));
        System.out.println("Arrats.toString(s.split(\"e\"):" + Arrays.toString(s.split("e")));
        System.out.println(s);//hello
    }
    public  static  void getComparaisonString(){
        System.out.println("-----Comparaison string -------");
        System.out.println();

        String s = " hello ";
        String s2 = " hello ";

        System.out.println("s ==s2 "+s ==s2); //true

        String s3 = new String("hello");

        System.out.println("s ==s3" + s ==s3);//false

        System.out.println("s.equals(s3)"+s.equals(s3)); //true

        String firstName ="Abdallah";
        String firstName1 = "abdallah";

        System.out.println("firstName.equals(firstName1)"+firstName.equals(firstName1));//false
        System.out.println("firstName.equalsIgnoreCase(firstName1)"+firstName.equalsIgnoreCase(firstName1));//true
    }
    public  static void getFormattting(){
        System.out.println("---Formatage String---");
        System.out.println();

        String firstName="Abdallah";

        String phrase = "Salut, cher %s!, ça va,Good %s! ";

        String morning = "Morning";
        String evening="Morning";
        String afternoon = "Afternoon";

        String nouvellePhrase = String.format(phrase, firstName, morning);
        System.out.println(nouvellePhrase);

        System.out.printf("Vous allez  gagner  %d à l'euro-millions dans %d jours ",1000,10);
    }
}
