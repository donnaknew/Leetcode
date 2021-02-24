package easy;

public class RomanToInteger_13 {
    public int romanToInt(String s) {
        int resultInt = 0;
        int preConvertedInt = 0;

        for(int i = 0; i < s.length(); i++) {
            int convertedInt = this.convertRomanToInt(s.charAt(i));
            resultInt += convertedInt;

            if( i != 0 && convertedInt > preConvertedInt) {
                resultInt = resultInt - preConvertedInt * 2;
            }
            preConvertedInt = convertedInt;
        }

        return resultInt;
    }

    private int convertRomanToInt(char romanChar) {
        if(romanChar == 'I') {
            return 1;
        }
        else if(romanChar == 'V') {
            return 5;
        }
        else if(romanChar == 'X') {
            return 10;
        }
        else if(romanChar == 'L') {
            return 50;
        }
        else if(romanChar == 'C') {
            return 100;
        }
        else if(romanChar == 'D') {
            return 500;
        }
        else if(romanChar == 'M') {
            return 1000;
        }
        return 0;
    }
}
