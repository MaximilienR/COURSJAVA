package org.example.file.ObjectStream;

import java.io.*;
import java.util.Date;

public class ObjetStreamRead {
    private static String path="C:\\Users\\Public\\Documents\\java\\demo\\src\\main\\java\\org\\example\\file\\ObjectStream\\employee.data";

            public static void main() throws IOException, ClassNotFoundException {

                File file=new File(path);
                InputStream is = new FileInputStream(file);

                ObjectInputStream objectInputStream=new ObjectInputStream(is);

                System.out.println("le fichier que je vais lire :"+file.getAbsolutePath());
                System.out.println();

                Date date =(Date) objectInputStream.readObject();
                String info =objectInputStream.readUTF();

                System.out.println(date);
                System.out.println(info);
                System.out.println();

                int countEmployee = objectInputStream.readInt();

                System.out.println("le nombre d'employe :"+ countEmployee);

                for (int i = 0; i<countEmployee; i++){
                    Employee e = (Employee) objectInputStream.readObject();
                    System.out.println("Employe name"+e.getFullName()+"/ salaire "+e.getSalary());

                }
                objectInputStream.close();
            }
}
