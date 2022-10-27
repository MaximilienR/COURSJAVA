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
          new Product("table",500,789821),
          new Product("pull",74,794722),
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

         System.out.println("demo : toMap");

         Cart cart1=new Cart();
         Cart cart2=new Cart();
         Cart cart3=new Cart();

         cart1.setProductLIST(Arrays.asList(products.get(0)));
         cart2.setProductLIST(Arrays.asList(products.get(1), products.get(2)));
         cart3.setProductLIST(Arrays.asList(products.get(3),products.get(4)));

        List<Cart>carts=new ArrayList<>(Arrays.asList(cart1,cart2,cart3));

        Product[] products1=carts.stream()
                .flatMap(cart -> cart.getProductLIST().stream())
                .filter(product -> product.getReference()>101100)
                .map(product -> {
                    product.setPrice(product.getPrice() * 1.50);
                    return product;
                }).toArray(Product[]::new);

        Arrays.stream(products1).forEach(System.out::println);


 }

 }
