package ex_03_Java_Operators;

public class Grade_Calculator {

    public static String calculate_grade(int score)
    {
        return score >=90 ? "A" : score >=80 ? "B" : score >=70 ?
                "C" : score >=60 ? "D" : "F";
    }
    public static void main(String[] args) {
        //def calculate_grade(score);
         int score = 94;
         String grade = calculate_grade(score);
         System.out.println(("The grade is: " + grade));
    }
}
