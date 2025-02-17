package ex_16thFeb;

public class Abstact_Test {
    public static void main(String[] args) {
        book mybook = new printmyBook("Chaava","ShivajiSamant",1050);

    }
}

 class printmyBook extends book
 {
     printmyBook(String name, String author, int price)
        {
            this.getDetails(name,author,price);
        }

        @Override
        void getDetails(String name_c, String Author_c, int price_c)
        {
            System.out.println(name_c + ","+ Author_c+"," + price_c);
        }

        }

        abstract class book
        {
            abstract void getDetails(String name_c, String Author_c, int price_c);
        }


