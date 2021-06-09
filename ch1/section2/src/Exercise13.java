import edu.princeton.cs.algs4.Date;

public class Exercise13 {
    public static void main(String[] args) {
        Transaction transaction = new Transaction("Alan Turing", new Date(1,1,1972), 12.3);
        System.out.println(transaction.amount());
        System.out.println(transaction.when());
        System.out.println(transaction.who());
    }
}
