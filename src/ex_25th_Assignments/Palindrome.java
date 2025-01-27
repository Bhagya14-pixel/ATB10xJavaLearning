package ex_25th_Assignments;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


          Scanner scanner = new Scanner(System.in);


                System.out.print("Enter a string: ");
                String input = scanner.nextLine();


                String normalizedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


                int left = 0;
                int right = normalizedInput.length() - 1;

                // Check for palindrome
                boolean isPalindrome = true;
                while (left < right) {
                    if (normalizedInput.charAt(left) != normalizedInput.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                // Output the result
                if (isPalindrome) {
                    System.out.println("The string is a palindrome.");
                } else {
                    System.out.println("The string is not a palindrome.");
                }

                scanner.close();
            }
        }



