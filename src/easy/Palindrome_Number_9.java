package easy;

public class Palindrome_Number_9 {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        String xString = String.valueOf(x);
        int xLength = xString.length();

        for(int i = 0; i < xLength / 2; i++) {
            if(xString.charAt(i) != xString.charAt(xLength - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
