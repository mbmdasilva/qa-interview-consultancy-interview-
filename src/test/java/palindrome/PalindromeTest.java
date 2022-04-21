package palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    public void numberIsPalindrome(){
        for (int i = 1; i <= 1000; i++) {
           if ( i == palindrome.reverse(i)) {
               assertTrue(palindrome.isNumberPalindrome(i));
           }
        }
    }

    @Test
    public void numberIsNotPalindrome(){
        for (int i = 1; i <= 1000; i++) {
            int number;
            number = i;
            if (number != palindrome.reverse(i)) {
                assertFalse(palindrome.isNumberPalindrome(i));
            }
        }
    }
}
