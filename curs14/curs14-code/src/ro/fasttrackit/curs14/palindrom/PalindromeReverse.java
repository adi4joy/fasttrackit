package ro.fasttrackit.curs14.palindrom;

public class PalindromeReverse implements Palindrome {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(inverse(word));
    }

    public String inverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }


}
