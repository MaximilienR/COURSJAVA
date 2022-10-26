package org.example;

import org.example.collections.liste.LinkedListDemo;
import org.example.collections.liste.entity.ListDemo;
import org.example.collections.liste.entity.RandomPerson;
import org.example.collections.liste.enums.Order;
import org.example.collections.liste.set.SetDemo;
import org.example.exception.DemoThrows;
import org.example.exception.SimpleExemple;
import org.example.exception.exceptionPerso.CheckMyAge;
import org.example.exception.exceptionlmbrique.DemoExceptionImbrique;
import org.example.map.MapDemo;
import org.example.methode.MethodeParam;
import org.example.poo.Phone;
import org.example.poo.Product;
import org.example.poo.inner.OuterClass;
import org.example.readFromConsole.ReadFromConsole;
import org.example.stream.Demo1;
import org.example.string.ChaineCaractere;
import org.example.variable.Variable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.collections.liste.entity.ListDemo.listDemo;

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
    }/
        Product p = new Product();
        Product p2 =new Product(1,"Pantalon");
        p.setName("Jupe");
        System.out.println(p.getName());
        System.out.println(p2.getName());

        Phone phone =new Phone( 12);
        phone.setName("Iphone");
        phone.setId(3);
        System.out.println(phone.toString());
        Phone phone1=new Phone(1,"Nokia",45);
        System.out.println(phone1.toString());

        //Product.getBonjour

        phone.whatIam();
        p.whatIam();

        OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass Inner = outerClass.new InnerClass();

        Inner.afficheMessage2();
        OuterClass.AutreClassInne autreClassInne=new OuterClass.AutreClassInne();
        autreClassInne.afficheMessage();

        listDemo.main();

        List<RandomPerson>personList=new ArrayList<>();

        RandomPerson.addData(5,personList);

        ListDemo.trieOrderRandomPerson(Order.CITY, personList);

        RandomPerson.affichePerson(personList);*/
       // LinkedListDemo.main();
       // MapDemo.main();
       // SetDemo.main();
       // SimpleExemple.main();
       // CheckMyAge.main();

       /* try{
            DemoThrows.main();
        }catch (IOException e){
            System.out.println("c'est une exception ...");
        }*/
        //DemoExceptionImbrique.main2();
        Demo1.main();
    }
};
