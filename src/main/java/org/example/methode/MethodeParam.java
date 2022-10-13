package org.example.methode;

public class MethodeParam {

    public static void changeIntValue(int i){
        i+=100;
    }
    public static int changeInt(int i ){
        i+=100;
        return i;
    }

    public static void changeArray(int[] array){
        array[1]=200;
    }
    public  static int sum(int i,int i2){
        return i+i2;
    }
    public static int sum(int i,int i2,int i3){
        return i+i2+i3;
    }
    public  static  int sum(int... ints){
        int sum=0;
        for (int i:ints){
            sum +=i;
        }
        return sum;
    }

}
