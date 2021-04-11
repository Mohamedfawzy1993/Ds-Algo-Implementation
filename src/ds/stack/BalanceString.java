package ds.stack;

import java.util.Arrays;
import java.util.List;
import ds.stack.Stack;

/**
 * The Class BalanceString
 *
 * @author mohamed.fawzy
 */
public class BalanceString {

    List<Character> left = Arrays.asList('(', '<', '{', '[');
    List<Character> right = Arrays.asList(')', '>', '}', ']');

    public Boolean isBalanced(String str) {
        Stack stack = new Stack();
        for (Character c : str.toCharArray()) {
            if (left.contains(c))
                stack.push(c);
            else if (right.contains(c)) {
                if (stack.isEmpty()) return false;
                if (left.indexOf(c) != right.indexOf(stack.pop()))
                    return false;
            }
        }
        return stack.isEmpty();
    }


}

    
