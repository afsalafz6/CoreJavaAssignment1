package assignment4_Exception;

public class NumberByZero {
    public static void main(String[] args) {
        int a = 50;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("########Exception Found#############");
        } finally {
            System.out.println("Rest of the Program");
        }
    }
}
