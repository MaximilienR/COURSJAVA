package org.example.math;

public class MathClass {
    public  static void getMath(){
        System.out.println(Math.PI);
        System.out.println(Math.max(4,7));
        System.out.println(Math.min(3,8));
        System.out.println(Math.sqrt(4));
        int abso = Math.abs(-78);

        System.out.println(abso);

        System.out.println(Math.sqrt(-1));//Nan
        System.out.println(0/0.0);//Nan

        System.out.println(5/0.0);//infinity
        System.out.println((int)(Math.random()*100));
        System.out.println((int)(Math.random()*100)+100);
     }
}
