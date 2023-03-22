package org.example;

public class HelloWorld {
    public static void main(String[] args) {
        // create a variable to store special character
        char n = '\u00F1';
        String lastName = "Pe" + n + "a";
        System.out.println("Hello " + lastName + "!");

        // or use inline code within string
        System.out.println("Hello Pe\u00F1a!");
        // here's a change
    }
}