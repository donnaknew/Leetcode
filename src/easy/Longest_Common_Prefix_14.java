package easy;

public class Longest_Common_Prefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 0) {
            return "";
        }
        String longestCommonPrefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            longestCommonPrefix = this.checkCommonPrefix(longestCommonPrefix, strs[i]);
        }
        Character character = null;

        return longestCommonPrefix;
    }

    private String checkCommonPrefix(String standard, String diff) {
        String commonPrefix = "";

        for(int i = 0; i < standard.length(); i++) {
            if(i > diff.length() - 1) {
                break;
            }
            if(standard.charAt(i) != diff.charAt(i)) {
                break;
            }
            commonPrefix += standard.charAt(i);
        }

        return commonPrefix;
    }
}
