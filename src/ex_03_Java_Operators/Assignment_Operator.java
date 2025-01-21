package ex_03_Java_Operators;

public class Assignment_Operator {
    public static void main(String[] args) {
        int a =10;
        int b =25;
        int c=0;

        c=a+b;
        System.out.println("c = a+b =" +c);

        c += a;
        System.out.println("c += a = " +c);

        c-= a;
        System.out.println("c -= a =" +c);

        c*=a;
        System.out.println("c *= a =" +c);
    }
}
