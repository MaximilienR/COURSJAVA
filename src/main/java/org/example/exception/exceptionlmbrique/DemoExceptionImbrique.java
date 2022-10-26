package org.example.exception.exceptionlmbrique;

public class DemoExceptionImbrique {
    public static void main(){
        try {
            try {
                int num = Integer.parseInt("9");
                System.out.println(num);
            }catch (NumberFormatException e){
                System.out.println("INVALID FORMAT NUMBER");
            }
            try {
                int[] a = new int[5];
                a[0] = 9;
                System.out.println(a[17]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of limits");
            }

            int a = 2; int b =2; int c = b/a;
            System.out.println("res "+c);



            }catch (Exception e){
            System.out.println("Exception general : ");
        }
    }
    public static void main2(){
        try {

            int num = Integer.parseInt("5");
            System.out.println(num);
            int[] a = new  int[5];
            a[0]=9;
            System.out.println(a[12]);

        }catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("je suis l'operartion final");
        }
    }
}
