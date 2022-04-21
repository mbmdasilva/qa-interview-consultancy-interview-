package palindrome;

public class Palindrome {

    public  boolean isNumberPalindrome(int number) {
        boolean isPalindrome = false;
        if (number == reverse(number)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public  int reverse(int number) {
        int reverse = 0;
        int remainder = 0;
        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        } while (number > 0);
        return reverse;
    }
}


