package ex_9thFeb_Assignments;

public class Second_Smallest_No_Array {
    public static void main(String[] args) {
        int[] number = {12, 34, 10,1, 100,3,4,32};

        int min_output = give_min(number);
        System.out.println(min_output);


    }

    static int give_min(int[] array)
    {
        int min = array[0];
        for (int i=0; i< array.length; i++)
        {
            if(array[i]< min)
            {
                min = array[i++];
            }
        }
        return min;
    }
}

