package org.example.collections.liste;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void demo(){
        ArrayList<String>liste=new ArrayList<>();
        liste.add("toto");
        liste.add("titi");
        liste.add("tata");
        liste.add("tutu");

        Iterator it = liste.iterator();

        while (it.hasNext()){
            System.out.println("nom"+it.next());
        }

        Vector<String>vector=new Vector<>();

        vector.addElement("Marco");
        vector.addElement("Paulo");
        vector.addElement("Michel");

        Enumeration e = vector.elements();

        while (e.hasMoreElements()){
            System.out.println("element"+e.nextElement());
        }
    }


}
