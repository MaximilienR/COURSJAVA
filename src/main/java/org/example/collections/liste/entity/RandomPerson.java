package org.example.collections.liste.entity;

import net.datafaker.Faker;

import java.util.List;

public class RandomPerson {
    public String firstName;
    public String lastName;
    public String favoriteMusiqueGenre;
    public String favoriteFood;
    public String streetAdress;
    public String city;
    public String country;

    public RandomPerson(){

    }

    @Override
    public String toString() {
        return "RandomPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", favoriteMusiqueGenre='" + favoriteMusiqueGenre + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", streetAdress='" + streetAdress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    public static void addData(int taille, List<RandomPerson> listePerson){
        for (int i = 0; i<taille; i++){
            Faker randomData=new Faker();
            RandomPerson randomPerso=new RandomPerson();

            randomPerso.firstName=randomData.name().firstName();
            randomPerso.lastName=randomData.name().lastName();
            randomPerso.favoriteMusiqueGenre=randomData.music().genre();
            randomPerso.favoriteFood=randomData.food().dish();
            randomPerso.streetAdress=randomData.address().streetAddress();
            randomPerso.country=randomData.address().city();
            listePerson.add(randomPerso);
                            }
    }
    public static void  affichePerson(List<RandomPerson>list) {
        for (RandomPerson r : list) {
            System.out.println();
            System.out.println(r);
            System.out.println();
            System.out.println("  ------ ----- ***** ----- -------");
        }
    }
}
