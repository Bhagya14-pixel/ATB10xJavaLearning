package ex_30th_Assignments;

public class Traingle {
    public static int checkValidity(int a, int b, int c)
    {
        if (a + b <= c || a + c <= b || b + c <= a)
            return 0;
        else
            return 1;
    }

    public static void main(String args[])
    {
        int a = -7, b = 10, c = 5;
        if ((checkValidity(a, b, c)) == 1)
            System.out.print("Valid");
        else
            System.out.print("Invalid");
    }
}

