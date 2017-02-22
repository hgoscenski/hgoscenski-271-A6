import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by hgoscenski on 2/22/17.
 */
class PotentialPalindromeArrayListTest {
    @Test
    void isPalindromeArrayList() {
        String input = "Madam I'm Adam";
        String input2 = "Madam I'm not adam";
        PotentialPalindromeArrayList b = new PotentialPalindromeArrayList(input);
        PotentialPalindromeArrayList b2 = new PotentialPalindromeArrayList(input2);
        assertTrue(b.isPalindromeArrayList());
        assertFalse(b2.isPalindromeArrayList());
    }
}