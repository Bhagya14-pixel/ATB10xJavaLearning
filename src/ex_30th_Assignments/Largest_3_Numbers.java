package ex_30th_Assignments;

public class Largest_3_Numbers {
    public static void main(String[] args) {
        double n1 = 82, n2 = 42.6, n3 = -2.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}

