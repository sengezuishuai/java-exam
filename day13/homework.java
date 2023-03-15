public class homework {
    public static void main(String[] args){
        Book a = new Book();
        int bookspace = 90;
        bookspace = a.updatePrice(bookspace);
        System.out.print(bookspace);
    }
}

class Book{
    public int updatePrice (int n){
        if (n > 150)
            return 150;
        else if (n <= 150 && n > 100)
            return 100;
        else
            return n;
    }
}