package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

    }
}
