package com.tavisca.workshops.pratham.Streams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void writeFile(String fileName, String data) throws FileNotFoundException {
        FileOutputStream writer = new FileOutputStream(fileName, true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(writer);
        try(bufferedOutputStream) {
            bufferedOutputStream.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Exception occured: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
