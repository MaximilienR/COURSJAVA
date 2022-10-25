package org.example.collections.liste.set;

import org.example.collections.entities.User;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(){
    Set<Integer> set =new HashSet<>();
    set.add(1);
    set.add(3);
    set.add(1);
    set.add(4);
        System.out.println(set);

        System.out.println("set de user");

        Set<User>users =new HashSet<>();

        User user1= new User("John","Jim","1234","john@gmail.com");

        User user2= new User("John","Jim","1234","john@gmail.com");
        user2.setId(1);

        users.add(user1);
        users.add(user2);

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());


        User user3= new User("Lili","Tom","1234","lili@gmail.com");
        User user4= new User("Mike","Jim","1234","john@gmail.com");



       // user3=user4;

        System.out.println(user3.hashCode());
        System.out.println(user4.hashCode());

        users.add(user3);
        users.add(user4);

        for (User u:users) {
            System.out.println("user :"+u);
        }

    }
}
