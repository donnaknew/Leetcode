package easy;

import java.util.ArrayList;
import java.util.List;

public class Valid_Parentheses_20 {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                Character openBracket = stack.pop();

                if(openBracket == null) {
                    return false;
                }
                if(!this.checkBracketPair(openBracket, s.charAt(i))) {
                    return false;
                }
            }
        }
        if(stack.size() > 0) {
            return false;
        }

        return true;
    }

    private boolean checkBracketPair(char openBracket, char closeBracket) {
        if(openBracket == '(' && closeBracket == ')') {
            return true;
        }
        if(openBracket == '[' && closeBracket == ']') {
            return true;
        }
        if(openBracket == '{' && closeBracket == '}') {
            return true;
        }
        return false;
    }

    class Stack<T> {
        private List<T> stackList = new ArrayList<T>();

        public void push(T value) {
            stackList.add(value);
        }

        public T pop() {
            if(this.size() <= 0) {
                return null;
            }
            T value = stackList.get(this.size() - 1);
            stackList.remove(this.size() - 1);
            return value;
        }

        public int size() {
            return stackList.size();
        }
    }
}
