package assignment3String;

import java.util.Locale;

public class StringOperation {
    public static void main(String[] args) {
        String string1 = "Java String pool refers to collection of Strings which are stored in heap memory";

        System.out.println("to lowercase");
        System.out.println(string1.toLowerCase() +"\n");

        System.out.println("to uppercase");
        System.out.println(string1.toUpperCase() +"\n");

        System.out.println("replace a with $");
        System.out.println(string1.replace("a","$") +"\n");

        System.out.println("to check string contains a word 'collection'");
        System.out.println(string1.contains("collection") +"\n");

        System.out.println("check string matches");
        System.out.println(string1.matches("java string pool refers to collection of strings which are stored in heap memory") +"\n");

        System.out.println("check string matches using equalsIgnoreCase");
        System.out.println(string1.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory") +"\n");
    }
}
