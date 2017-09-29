package lesson5;

/**
 * @author a.shestovsky
 *
 * Определить, является ли строка палиндромом
 */

public class Palindrome {
    public static void main(String[] args) {
        String text = "abcdcba abcdcba";
        boolean isPalindrome = true;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome ? text +  " - is palindrome" : text + " - is not palindrome");
    }
}