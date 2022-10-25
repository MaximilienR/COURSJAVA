package org.example.collections.liste.entity;

import org.example.collections.liste.enums.Order;
import org.example.collections.liste.tools.FlexibleRandomComparator;

import java.util.*;
import  static  org.example.collections.liste.entity.RandomPerson.affichePerson;
import  static  org.example.collections.liste.entity.RandomPerson.addData;
public class ListDemo {
    public static List<RandomPerson>listDemo=new ArrayList<RandomPerson>();
    public static List<RandomPerson>listDemo2=new ArrayList<RandomPerson>();
    public static List<RandomPerson>listDemo3=new ArrayList<RandomPerson>();

    public static void main(){

    List<String> liste=new ArrayList<>();

    liste.add("Michel");
    liste.add("Toto");

    String nom = liste.get(1);
    Object obj =liste.get(1);
    System.out.println(liste);

    List<String>liste2=new LinkedList<>();
    liste2.add("Pierre");

    List<Integer>liste3=new ArrayList<>(Arrays.asList(2,9,0,67,45,32,1));

        Collections.sort(liste3);

        for (Integer i:liste3){
            System.out.println(i);
        }



        int[] tab=new  int[]{7,9,9,0,5,4,3,2};

        Arrays.sort(tab);

        liste3.clear();

        //demo avec arraylist avec objet :

        RandomPerson.addData(3,listDemo);
        RandomPerson.affichePerson(listDemo);

        RandomPerson person = new RandomPerson();
        person.firstName="leo";
        listDemo.add(person);
        affichePerson(listDemo);
        System.out.println("---ajout d'une personne---");

        listDemo.add(3,person);

        affichePerson(listDemo);

        System.out.println("===>ajout une personne à l'index d'un autre objet ");
        RandomPerson person1=new RandomPerson();
        listDemo.add(listDemo.indexOf(person),person1);

        System.out.println("===creation d'une seconde liste ");
        addData(7,listDemo2);
        System.out.println("affuche la nouvelle liste");
        affichePerson(listDemo2);
        System.out.println("==ajouter la liste demo 2 à la liste demo1");
        listDemo.addAll(listDemo2);
        System.out.println("affiche la liste demo1 qui contient la liste demo2");
        affichePerson(listDemo);
        System.out.println("supprimer un element de la liste");
        listDemo.remove(person);
        listDemo.remove(3);
        affichePerson(listDemo);
        System.out.println("===contains ***");

        System.out.println("est ce que la liste contient la liste demo2:"+listDemo.containsAll(listDemo));

        listDemo.remove(9);
        System.out.println("suppression de l'element 9:");

        System.out.println("est ce que la liste contient la liste demo2:"+listDemo.containsAll(listDemo));
        System.out.println("sous liste de la liste demo1 de l'index 3 à 9");
        listDemo3=listDemo.subList(3,9);
        affichePerson(listDemo3);





}
    public static void trieOrderRandomPerson(Order order,List<RandomPerson>liste){

        FlexibleRandomComparator comparator=new FlexibleRandomComparator();
        comparator.setOrder(order);
        Collections.sort(liste,comparator);

    }

}