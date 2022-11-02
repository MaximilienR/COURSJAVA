package org.example.file;

import java.io.File;
import java.util.Scanner;

public class DemoFile2 {

    private static String path1=("C:\\Users\\Public\\Documents\\java\\demo\\src\\main\\java\\org\\example\\file\\file.txt");

    public static void main(){
        File file= new File(path1);

        if(file.exists()){
            System.out.println("File name"+file.isDirectory());
            System.out.println("File name"+file.getName());
            System.out.println("Absolute path"+file.getAbsolutePath());
            System.out.println("Writable"+file.canWrite());
            System.out.println("Readable"+file.canRead());
            System.out.println("Size of file "+file.length());
        }else{
            System.out.println("file n'existe pas");
        }


        for (File f:file.listFiles()){
            System.out.println(f.getName());
        }



       // checkFile(file);
        System.out.println("quel est le nom du fichier");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        System.out.println("Quel est le texte que vous souhaitez insérer ?");
        String texte =sc.nextLine();
    }
}
