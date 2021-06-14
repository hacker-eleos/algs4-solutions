
public class Exercise1 {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings stackOfStrings = new FixedCapacityStackOfStrings(3);
        stackOfStrings.push("to");
        stackOfStrings.push("be");
        stackOfStrings.push("or");
        System.out.println(stackOfStrings.isFull());
    }
}