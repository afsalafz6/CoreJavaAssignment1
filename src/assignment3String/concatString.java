package assignment3String;

public class concatString {
    public static void main(String[] args) {
        String s1 =new String("Hello");
        String s2 ="How Are You ?";

        System.out.println("Method 1 to join");
        System.out.println(s1 + " & " + s2);

        System.out.println("\n Method 2 to join");
        System.out.println(s1.concat(s2));
    }
}
