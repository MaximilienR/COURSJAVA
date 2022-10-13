package org.example.operator;

import org.example.model.Maison;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Operator {
    public static void getOperators(){
        System.out.println("---les operateurs ---");

        int i =10;
        int i2=-10;
        int i3=++i;
        int i4 =i++;
        int i5 = --i;
        int i6 = i--;

        System.out.println("i:"+i);//10
        System.out.println("i:"+i2);//-10
        System.out.println("i:"+i3);//11
        System.out.println("i:"+i4);//
        System.out.println("i:"+i5);
        System.out.println("i:"+i6);

    }
    public  static  void getExpressionType(){
        byte b =1;
        short s=1;
        int i=1;
        long l =1;
        float f =1.0F;
        char c ='1';
        double d =11;
        int express1=b+b;
        int express2 = s +b;
        int express3 = b +i +c;

        long express4 = i+l;
        float express5 = l+f;

        double express6 = f+d;
    }
    public  static  void getOpérationAndComparaisonType(){
        int int1=128;
        int int2=128;

        System.out.println("int1 ==int2"+(int1==int2));
        System.out.println("65 == A" + (65 =='A'));

        Integer i = 128;
        Integer i2=128;
        System.out.println("i==i2"+(i==i2));

        Integer i3=127;
        Integer i4=128;

        System.out.println("i3==i4"+(i3==i4));
        Integer i5 =new Integer(127);
        Integer i6 =new Integer(127);
        System.out.println("i5 ==i6"+(i3==i4));

        Integer i7=Integer.valueOf(127);
        Integer i8=Integer.valueOf(127);

        System.out.println("i7 ==18"+(i7==i8));
        System.out.println("i==i2"+(i.equals(12)));

        int[] arr1={1,2,3};
        int[]arr2={1,2,3};

        System.out.println("arr1 ==arr2"+(arr1==arr2));//false
        System.out.println("arr1.eqals(arr2)"+(arr1.equals(arr2)));
        System.out.println("Arrays.eqals(arr1,arr2"+ Arrays.equals(arr1,arr2));

        arr1=arr2;
        System.out.println("arr1 ==arr2"+(arr1==arr2));//true;

        Maison maison1=new Maison(12,"maison1");
        Maison maison2=new Maison(12,"maison1");

        System.out.println("maison1 ==maison2"+(maison1==maison2));

        System.out.println("maison1.nom ==maison2.nom"+(maison1.nom==maison2.nom));//true
    }


}
