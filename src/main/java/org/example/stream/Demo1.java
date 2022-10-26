package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Demo1 {


    public static void main(){
        List<String> prenoms = Arrays.asList("abdallah","benoit","albert","thierry","alain","jean","alban","alain");
        prenoms.stream().filter(p->p.startsWith("a"))
                .forEach(System.out::println);
    }
}
