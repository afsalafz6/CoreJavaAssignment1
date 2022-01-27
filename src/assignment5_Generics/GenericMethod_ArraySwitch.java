package assignment5_Generics;

import java.util.List;

public class GenericMethod_ArraySwitch {

    public static < E > void switchArrayElement(E[] inputArray, int i , int j) {
        System.out.println("Array Before Swapping :");
        System.out.println(List.of(inputArray) + "\n");

        E t = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = t;

        System.out.println("Array After Swapping :");
        System.out.println(List.of(inputArray) + "\n");
    }

    public static void main(String[] args) {
        Integer[] intArray = { 2, 1};
        String[] StringArray = {"Welcome", "java", "to"};

        switchArrayElement(intArray,0,1);
        switchArrayElement(StringArray,1,2);

    }
}
