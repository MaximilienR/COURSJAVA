package org.example.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChaineCaractere1 {

    public  static  void  getRegex(){
        String text = "l'adresse de votre site est "+"http://";
        String patternString = ".*http://.*";

        Pattern pattern =Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
