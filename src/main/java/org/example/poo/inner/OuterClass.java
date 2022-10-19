package org.example.poo.inner;

public class OuterClass {
    private static String message="Dans une class externe";


    public static class AutreClassInne{


        public void afficheMessage(){
            System.out.println("je suis une classe interne"+message);
        }


    }
    public class InnerClass{
        public void afficheMessage2(){
            System.out.println("je suis un class intern non static "+ message);
        }
    }
}
