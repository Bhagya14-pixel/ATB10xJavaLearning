package ex_03_Java_Operators;

import java.util.function.BinaryOperator;

public class Binary_Operator {
    public static void main(String[] args) {
        BinaryOperator<Integer>
                op = BinaryOperator.maxBy((a,b)->(a>b)? 1:((a==b)? 0:-1));
        System.out.println(op.apply(98, 11));
    }
}
