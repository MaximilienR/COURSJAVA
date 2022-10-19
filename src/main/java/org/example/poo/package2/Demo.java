package org.example.poo.package2;

import org.example.poo.package1.ClassC;

public class Demo {
    public static void main(){
        ClassB classB= new ClassB();
        ClassC classC = new ClassC();

        classC.doSomethingb2();
        classC.doSomethingB();

        classB.doSomethingB();
        classB.doSomethingb2();
        classB.doSomethingB3();
    }
}
