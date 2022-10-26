package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

 public static void main(){
  System.out.println("--Demo : fillter,map et collect");
  List<Product> products = new ArrayList<>(Arrays.asList(
          new Product("iphone",1000,12456),
          new Product("table",500,78982),
          new Product("pull",74,79472),
          new Product("tele",2000,987456),
          new Product("jeu",20,944716)
          ));

          List<Product>listModifie=products.stream().filter(product -> product.getReference()>70000)
                  .map(product -> {
                   product.setPrice(product.getPrice()*1.20);
                   return product;
                  })
                  .collect(Collectors.toList());

          listModifie.stream().forEach(System.out::println);

 }

 }
