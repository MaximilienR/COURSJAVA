package org.example.file.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamd {
    public static void main() throws IOException {
        String path="C:\\Users\\Public\\Documents\\java\\demo\\src\\main\\java\\org\\example\\file\\fileInputStream\\utf8-file.txt";

        File file=new File(path);
        FileInputStream fileInputStream=new FileInputStream(file);

        int code ;
        while ((code=fileInputStream.read())!=-1){
            char ch = (char) code;
            System.out.println(code + " "+ch);
        }
        fileInputStream.close();
    }
}
