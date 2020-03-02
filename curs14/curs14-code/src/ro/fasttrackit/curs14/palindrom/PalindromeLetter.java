package ro.fasttrackit.curs14.palindrom;

public class PalindromeLetter implements Palindrome {
    @Override
    public boolean isPalindrome(String word) {
        String myWord = word.toLowerCase();
        for (int i = 0; i < word.length() / 2; i++) {
            if (myWord.charAt(i) != myWord.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
