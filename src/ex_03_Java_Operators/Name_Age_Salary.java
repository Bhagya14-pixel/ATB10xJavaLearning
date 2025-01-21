package ex_03_Java_Operators;

public class Name_Age_Salary {
    public static void main(String[] args) {

        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);

        String salary_string = args[1];
        int salary = Integer.parseInt(salary_string);
        System.out.println(salary);

        String Name = args[2];
        System.out.println(Name);
    }
}
