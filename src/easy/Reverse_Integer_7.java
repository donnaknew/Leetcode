package easy;

class Reverse_Integer_7 {
    public int reverse(int x) {
        long reversedDigits = 0;

        while(x / 10 != 0 || x % 10 != 0) {
            int partOfX = x % 10;
            reversedDigits *= 10;
            reversedDigits += partOfX;
            if(reversedDigits > Integer.MAX_VALUE || reversedDigits < -Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }

        return (int)reversedDigits;
    }
}
