package org.example.file.dataStream;

import java.io.*;
import java.time.LocalDate;

public class DataStreamWrite {



    private static final String filePath="C:\\Users\\Public\\Documents\\java\\demo\\src\\main\\java\\org\\example\\file\\dataStream\\fichier.txt";

    public static void  main() throws IOException {


        Order[] orders= new  Order[]{
                new Order(LocalDate.of(2022,1,6),true,"stylo",100,1.50f,150),
                new Order(LocalDate.of(2022,1,9),false,"papier",10,1.50f,15),
                new Order(LocalDate.of(2022,2,7),false,"frite",1,1.50f,150),
                new Order(LocalDate.of(2022,3,12),true,"chips",100,1.50f,190),
                new Order(LocalDate.of(2022,6,10),true,"porte",200,1.50f,300),

        };
        File file=new File(filePath);

        FileOutputStream outputStream=new FileOutputStream(file);

        DataOutputStream dataOutStream=new DataOutputStream(outputStream);

        for (Order order : orders){

            dataOutStream.writeUTF(order.getItem());
            dataOutStream.writeBoolean(order.isFinished());
            dataOutStream.writeFloat(order.getUnitCost());
            dataOutStream.writeFloat(order.getTotal());
            dataOutStream.writeInt(order.getUnited());
            dataOutStream.writeUTF(order.getOrderDate().toString());
        }
        dataOutStream.close();

    }
}
