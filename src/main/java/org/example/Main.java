package org.example;

import org.example.methode.MethodeParam;
import org.example.poo.Product;
import org.example.readFromConsole.ReadFromConsole;
import org.example.string.ChaineCaractere;
import org.example.variable.Variable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //commentaire
        //System.out.println("ceci est un test");
        // ChaineCaractere.getFormattting();

        //Variable.getVariable();
        //ReadFromConsole.getReadWriteConsole();
        //ChaineCaractere.getComparaisonString();

      /*  int i=10 ;

        MethodeParam.changeIntValue(i);
        System.out.println("valeur i"+i);

        i= MethodeParam.changeInt(i)
        System.out.println("valeur i"+1);
    }

};

        int[] array = {1, 2, 3};
        System.out.println("Array avant methode changeArray" + Arrays.toString(array));
        MethodeParam.changeArray(array);
        System.out.println("Array aores methode changeArray" + Arrays.toString(array));
        System.out.println("class :"+array.getClass());
    }/*/
        Product p = new Product();
        Product p2 =new Product(1,"Pantalon");
        p.setName("Jupe");
        System.out.println(p.getName());
        System.out.println(p2.getName());


    }
};
