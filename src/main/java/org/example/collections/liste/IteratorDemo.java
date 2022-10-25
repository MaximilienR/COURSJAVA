package org.example.collections.liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {


    public static void main(){

        ArrayList<Integer>liste=new ArrayList<>();

        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(6);

        System.out.println("iterator");
        Iterator iter =liste.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next() +" ");
        }
        //Listerator :
        System.out.println("listIterator");
        ListIterator listIterator=liste.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next()+" ");
        }
        //sans inverse;
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous()+" ");
}
        }
    }

