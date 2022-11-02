package org.example.file.dataStream;

import java.io.*;

public class DataStramRead {
    private static final String filePath="C:\\Users\\Public\\Documents\\java\\demo\\src\\main\\java\\org\\example\\file\\dataStream\\fichier.txt";

    public static void main() throws IOException {

        File file=new File(filePath);

        InputStream inputStream= new FileInputStream(file);

        DataInputStream dataInputStream=new DataInputStream(inputStream);

        System.out.printf("|%3s | %10s | %10s | %8s | %8s| %10s | %10s |%n\", //\n" +
                "                \"No\", \"Order Date\", \"Finished?\", \"Item\", \"Units\", \"Unit Cost\", \"Total\");\n" + "\n" +

                    System.out.printf("|%3s | %10s | %10s | %8s | %8s| %10s | %10s |%n\", //\n" +
                "                \"--\", \"---------\", \"----------\", \"----------\", \"------\", \"---------\", \"---------\");"));

        int row=0;

        while (dataInputStream.available()>0){
            ++row;
            String item = dataInputStream.readUTF();
            boolean finished = dataInputStream.readBoolean();
            float uniCost = dataInputStream.readFloat();
            float total = dataInputStream.readFloat();
            int units = dataInputStream.readInt();
            String orderDate=dataInputStream.readUTF();

             System.out.printf("|%3d |%10s |%8s|8%d|%,10.2f |%n",
                     row,orderDate,finished,item,units,uniCost,total);
        }
        dataInputStream.close();
    }
}
