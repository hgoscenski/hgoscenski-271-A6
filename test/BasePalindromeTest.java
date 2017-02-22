import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by hgoscenski on 2/22/17.
 */
class BasePalindromeTest {

    @Test
    void sanitizePotentialPalindrome() {
        BasePalindrome b = new BasePalindrome();
        String input ="MadamI'mAdam";
        String output = "madamimadam";
        String sanitizedString = b.sanitizePotentialPalindrome(input);
        assertEquals(output,sanitizedString);
    }

    @Test
    void getOrigPotentialPalindrome() {
        String input = "Madam I'm Adam";
        BasePalindrome b = new BasePalindrome(input);
        String output = "Madam I'm Adam";
        String origOutput = b.getOrigPotentialPalindrome();
        assertEquals(output, origOutput);
    }

    @Test
    void isPalindromeBasic() {
        String input = "Madam I'm Adam";
        BasePalindrome b = new BasePalindrome(input);
        assertTrue(b.isPalindromeBasic());
    }

}