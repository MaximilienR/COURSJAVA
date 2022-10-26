package org.example.map;

import org.example.collections.entities.Product;
import org.example.collections.entities.User;

import java.util.*;

public class MapDemo {

    public static void main(){

        Map<Integer,String> map=new HashMap<>();

        map.put(2,"Maison");
        map.put(3,"Caravane");
        map.put(5,"Chalet");
        map.put(6,"Appartement");

        System.out.println("get un element de la map"+map.get(6));

        System.out.println("iteration dans le map pour recuperr les clefs :");

        for (Integer key:map.keySet()){
            System.out.println("Key"+ key);
        }

        System.out.println("iteration dans la map pour recuperer les valeurs et les clefs ");

        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("entry key "+entry.getValue()+"entry value "+entry.getValue());
        }
        Map<User, Product> userProductMap = new HashMap<>();

        User user = new User();
        user.setFirstName("Smith");
        user.setLastName("Neo");

        Product product=new Product();

        userProductMap.put(user,product);

        System.out.println("get product by user"+userProductMap.get(user));

        User user2= new User("Michel","Johnas","1234","michel@gmail.com");
        User user3= new User("Jean","Aubert","1234","jean@gmail.com");
        User user4= new User("Pierre","Bashung","1234","pierre@gmail.com");

        ArrayList<User>listeUser =new ArrayList<>();

        listeUser.addAll(Arrays.asList(user2,user3,user4));

        List<Product> products = new ArrayList<>();

        //Product.addProduct(10,products);

        Map<Integer,List<Product>> map2 = new HashMap<>();

        for (int i=0;i<listeUser.size();i++){
            Product.addProduct(10,products);
            map2.put(listeUser.get(i).getId(),products);
        }
        for (Map.Entry<Integer,List<Product>> entry:map2.entrySet()) {
            for (Product p:entry.getValue()){
                System.out.println("User id"+entry.getKey()+" : " +p);
            }
        }
              {

        }
     }
}
