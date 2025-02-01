package ex_30th_Assignments;

public class Leap_Year {

        public static void main(String[] args) {

            int year = 2026;

            if (year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            }
            else if (year % 100 == 0) {
                System.out.println(year + " is not a leap year.");
            }
            else if (year % 4 == 0) {
                System.out.println(year + " is a leap year.");
            }
            else {
                System.out.println(year + " is not a leap year.");
            }
        }

    }

