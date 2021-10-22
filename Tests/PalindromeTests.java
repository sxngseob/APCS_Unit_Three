import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTests {

    @Test
    public void arePalindromes() {
        assertTrue(Palindrome.isPalindrome(12321));
        assertTrue(Palindrome.isPalindrome(94349));
        assertTrue(Palindrome.isPalindrome(88888));
    }

    @Test
    public void areNotPalindromes() {
        assertFalse(Palindrome.isPalindrome(1961));
        assertFalse(Palindrome.isPalindrome(2442));
        assertFalse(Palindrome.isPalindrome(45674));
        assertFalse(Palindrome.isPalindrome(82682));
    }
}
