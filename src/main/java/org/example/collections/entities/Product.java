package org.example.collections.entities;

import net.datafaker.Faker;

import java.util.Collection;
import java.util.Collections;

public class Product {

    private  String id;
    private  String  productName;
    private String categerieName;
    private  Integer price;

    public Product(){
        Faker faker=new Faker();
        this.id=faker.code().ean8();
        this.productName=faker.commerce().productName();
        this.categerieName=faker.commerce().department();
        this.price=Integer.getInteger(faker.commerce().price());
    }

    public Product(String id, String productName, String categerieName, Integer price) {
        this.id = id;
        this.productName = productName;
        this.categerieName = categerieName;
        this.price = price;
    }



    public static void addProduct(int taille, Collection<Product>liste){
        for (int i=0; i<taille;i++){
            Faker faker=new Faker();
            Product product=new Product(faker.code().ean8(), faker.commerce().productName(),
                    faker.commerce().department(),Integer.getInteger(faker.commerce().price()));
            liste.add(product);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
