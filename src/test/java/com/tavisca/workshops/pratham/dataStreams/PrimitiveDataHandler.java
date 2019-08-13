package com.tavisca.workshops.pratham.dataStreams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveDataHandler {
    public static void main(String[] args) {

    }

    private static void writeFile(String fileName, String data) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        try (dataOutputStream) {
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(34);
            dataOutputStream.writeFloat(45.89f);
            dataOutputStream.writeChars("Hello");
            dataOutputStream.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Exception occured: " + e.getMessage());
            e.printStackTrace();
        }
    }
}