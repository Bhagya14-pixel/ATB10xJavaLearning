package ex_03_Java_Operators;

public class Ternary_Operator {
    public static void main(String[] args) {
        int x,y;
        x=20;
        y=(x==1)?61:90;
        System.out.println("Value of y is:" + y);
        y=(x==20)?61:90;
        System.out.println("Value of y is:" + y);
    }
}
