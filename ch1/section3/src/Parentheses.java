import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Parentheses {
    private static final char LEFT_PAR = '(';
    private static final char RIGHT_PAR = ')';
    private static final char LEFT_BRACE = '{';
    private static final char RIGHT_BRACE = '}';
    private static final char LEFT_BRACKET = '[';
    private static final char RIGHT_BRACKET = ']';

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == LEFT_PAR) stack.push(LEFT_PAR);
            else if (s.charAt(i) == LEFT_BRACE) stack.push(LEFT_BRACE);
            else if (s.charAt(i) == LEFT_BRACKET) stack.push(LEFT_BRACKET);
            else if(s.charAt(i) == RIGHT_PAR) {
                if(stack.isEmpty()) return false;
                if(stack.pop() != LEFT_PAR) return false;
            }
            else if(s.charAt(i) == RIGHT_BRACE){
                if(stack.isEmpty()) return false;
                if(stack.pop() != LEFT_BRACE) return false;
            }
            else if(s.charAt(i) == RIGHT_BRACKET){
                if(stack.isEmpty()) return false;
                if(stack.pop() != LEFT_BRACKET) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            StdOut.println(isBalanced(item));
        }
    }
}
