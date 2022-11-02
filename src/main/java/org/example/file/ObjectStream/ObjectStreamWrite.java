package org.example.file.ObjectStream;

import java.io.*;
import java.util.Date;

public class ObjectStreamWrite {
    private static String path="C:\\Users\\Public\\Documents\\java\\demo\\src\\main\\java\\org\\example\\file\\ObjectStream\\employee.data";
    public static  void main() throws IOException {
        File file=new File(path);

        Employee e1= new Employee("Tom",1000);
        Employee e2= new Employee("Tim",1500);
        Employee e3= new Employee("Alex",900);

        Employee[] employees=new Employee[]{e1,e2,e3};

        OutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStream);

        System.out.println("fichier origine ;"+file.getAbsolutePath());

        objectOutputStream.writeObject(new Date());
        objectOutputStream.writeUTF("Liste des employees : ");

        objectOutputStream.writeInt(employees.length);

        for (Employee e: employees){
            objectOutputStream.writeObject(e);
        }
        objectOutputStream.close();

        System.out.println("c'est fini l'ecriture...");


    }
}
