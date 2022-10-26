package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;

import static org.example.methode.MethodeParam.sum;

public class Demo1 {


    public static void main(){
        List<String> prenoms = Arrays.asList("abdallah","benoit","albert","thierry","alain","jean","alban","alain");
        prenoms.stream()
                .filter(p->p.startsWith("a"))
                .forEach(System.out::println);
        System.out.println("count :");
        System.out.println("le nombre de personne dont le prenom commence par un a est de :"+prenoms.stream()
                .filter(p->p.startsWith("a")).count());

        System.out.println();
        System.out.println("distinct :");
        prenoms.stream().distinct().forEach(System.out::println);

        System.out.println("Limit :");
        prenoms.stream().limit(4).forEach(System.out::println);

        System.out.println("sorted");

        prenoms.stream().sorted().forEach(System.out::println);
        prenoms.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Employe>liste=new ArrayList<>();

        liste.add(new Employe(1,Genre.HOMME,176,2900));
        liste.add(new Employe(2,Genre.HOMME,186,2000));
        liste.add(new Employe(3,Genre.HOMME,180,1900));
        liste.add(new Employe(4,Genre.FEMME,150,1000));
        liste.add(new Employe(5,Genre.FEMME,150,1300));

        double totalSalaire =liste.stream()
        .mapToDouble(e->e.getSalaire())
        .sum();

        System.out.println("titak sakaure ; "+totalSalaire);

        Optional<Employe> employe =liste.stream()
        .filter(p->p.getTaille()>=176)
                .findFirst();

        System.out.println("le premier employe qui fait au moins 176 est"+employe.get());

        int []nbr={1,2,3,5,4,7};
        int somme=Arrays.stream(nbr).reduce(0,(a,b)->a+b);

        System.out.println("la somme du tableau nrb est de "+ somme);


        List<Integer>nbrs = Arrays.asList(1,2,3,4,5);
        List<Integer> pairs=nbrs.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        pairs.stream().forEach(System.out::println);
    }
}
