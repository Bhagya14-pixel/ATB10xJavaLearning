package ex_9thFeb_Assignments;

import java.util.Scanner;

public class Left_Traingle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number");
        int n= scanner.nextInt();

        for(int i=0; i<=n;i++)
        {
            for(int j = 1; j<=n-i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
