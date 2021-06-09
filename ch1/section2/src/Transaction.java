import edu.princeton.cs.algs4.Date;

import java.util.Objects;

public class Transaction implements Comparable<Transaction> {
    private final String who;
    private final Date when;
    private final Double amount;

    public Transaction(String transaction) {
        String[] fields = transaction.split("//s+");
        if (fields.length != 3) throw new IllegalArgumentException("Wrong format");
        this.who = fields[0];
        this.when = new Date(fields[1]);
        this.amount = Double.parseDouble(fields[2]);
    }

    public Transaction(String who, Date when, Double amount) {
        this.who = who;
        this.when = new Date(when.month(), when.day(), when.year());
        this.amount = amount;
    }

    public String who() {
        return who;
    }

    public Date when() {
        return new Date(when.month(), when.day(), when.year());
    }

    public Double amount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return who.equals(that.who) && when.equals(that.when) && amount.equals(that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(who, when, amount);
    }

    @Override
    public int compareTo(Transaction o) {
        return 0;
    }
}
