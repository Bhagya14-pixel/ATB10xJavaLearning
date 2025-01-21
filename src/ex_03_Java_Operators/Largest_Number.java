package ex_03_Java_Operators;

public class Largest_Number {
    public static void main(String[] args) {
        int a=30, b=45, c=89, max;
        max = (a> b)? (a > c ? a:c):
        ( b > c ? b : c);

        System.out.println("Largest number among " + a + ","+ b + " and " + c + " is " + max + ".");
    }
}
