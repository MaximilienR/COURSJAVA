package org.example.map;

import org.example.collections.entities.Product;
import org.example.collections.entities.User;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(){
        Map<Integer,String> map=new HashMap<>();
        map.put(2,"Maison");
        map.put(3,"Caravane");
        map.put(5,"Chalet");
        map.put(6,"Appartement");

        System.out.println("get un element de la map"+map.get(6));
        System.out.println("iteration dans le map pour recuperr les clefs");

        for (Integer key:map.keySet()){
            System.out.println("Key"+ key);
        }
        System.out.println("iteration dans la map pour recuperer les valeurs et les clefs ");
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("entry key "+entry.getValue()+"entry value "+entry.getValue());
        }
        Map<User, Product> userProductMap = new HashMap<>();

        User user = new User();
        user.getFirstName("Smith");
        user.getLastName("Neo");

        Product product=new Product();

        userProductMap.put(user,product);

        System.out.println("get product by user"+userProductMap.get(user));

    }
}
