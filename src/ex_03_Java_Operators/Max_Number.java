package ex_03_Java_Operators;

public class Max_Number {
    public static void main(String[] args) {
      //  int a, b, max;

        String a= args[0];
        int A = Integer.parseInt(a);

        String b= args[1];
        int B = Integer.parseInt(a);

        String Result = (A > B) ? "a" : "b" ;
        System.out.println(Result);

    }
}
