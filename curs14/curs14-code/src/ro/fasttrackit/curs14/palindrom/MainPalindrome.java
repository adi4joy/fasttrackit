package ro.fasttrackit.curs14.palindrom;

public class MainPalindrome {
    public static void main(String[] args) {
        PalindromeReverse palindromeReverse = new PalindromeReverse();
        PalindromeLetter palindromeLetter = new PalindromeLetter();
        System.out.println(palindromeReverse.isPalindrome("Potop"));
        System.out.println(palindromeLetter.isPalindrome("Potop"));
    }
}
