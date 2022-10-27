package org.example.file;

import java.io.*;

public class DemoFile {


        public static void main() throws IOException {
            File file =new File("C:\\Users\\Public\\Documents\\java\\demo\\src\\main\\java\\org\\example\\file\\file.txt");

            FileReader fr = new FileReader(file);

            File file2 = new File("C:\\Users\\Public\\Documents\\java\\demo\\src\\main\\java\\org\\example\\file\\file2.txt");

            FileWriter fileWriter=new FileWriter(file2);

            int c = 0;

            while ((c= fr.read())!=-1){
                fileWriter.write(c);
            }
            fr.close();
            fileWriter.close();

        }
        public static void main2(){
            BufferedReader reader;

            try {
                reader = new BufferedReader(new FileReader("C:\\Users\\Public\\Documents\\java\\demo\\src\\main\\java\\org\\example\\file\\file3.txt"));
                String line = reader.readLine();

            while (line!=null){
                System.out.println(line);
                line= reader.readLine();
            }
            reader.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

};
