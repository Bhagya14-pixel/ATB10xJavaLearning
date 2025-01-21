package ex_03_Java_Operators;

public class Increment_Decrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        int b =20;
        System.out.println( --b + b++ + b--);
        System.out.println(b);

    }
}
