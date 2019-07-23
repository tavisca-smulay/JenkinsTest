package com.tavisca.workshops.pratham;

import java.util.Scanner;


public class HelloWorld {
    /*String salutation;
    String name;
    int age;
    String country;*/

    public static void main(String args[]) {
        sayHello("female", "Rachel", 25, "India");
        sayHello("male", "Joey", 20, "Spain");
        sayHello("male", "Ross", 17, "Nepal");
    }

    static void sayHello(String gender, String name, int age, String country) {
        if (country == "India") {
            if (gender == "female")
                System.out.println("Namaste, Miss. " + name);
            else if (gender == "male") {
                if (age < 18)
                    System.out.println("Namaste, Master. " + name);
                else
                    System.out.println("Namaste, Mr. " + name);
            }
        } else if (country == "Spain") {
            if (gender == "female")
                System.out.println("Hola, Miss. " + name);
            else if (gender == "male") {
                if (age < 18)
                    System.out.println("Hola, Master. " + name);
                else
                    System.out.println("Hola, Mr. " + name);
            }
        } else {
            if (gender == "female")
                System.out.println("Hello, Miss. " + name);
            else if (gender == "male") {
                if (age < 18)
                    System.out.println("Hello, Master. " + name);
                else
                    System.out.println("Hello, Mr. " + name);
            }
        }
    }


}
