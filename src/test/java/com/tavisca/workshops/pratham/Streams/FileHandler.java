package com.tavisca.workshops.pratham.Streams;

import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args) {
        writeFileContents();
        readFileContents();
    }

    private static void writeFileContents(){
        FileWriter myFileWriter = new FileWriter();
        String data = "Hello! How are you today?";
        try {
            myFileWriter.writeFile("Datafile.txt", data);
        } catch (FileNotFoundException e) {
            System.out.println("Please use a valid name!!");
            e.printStackTrace();
        }
    }

    private static  void readFileContents(){
        FileReader fileReader = new FileReader();
        try {
            System.out.println("------------------");
            String s = fileReader.readFile("Datafile.txt");
            System.out.println(s);
            System.out.println("------------------");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
