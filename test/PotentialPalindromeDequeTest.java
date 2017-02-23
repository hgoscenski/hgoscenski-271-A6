import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by hgoscenski on 2/22/17.
 */
class PotentialPalindromeDequeTest {
    @Test
    void isPalindromeDeque() {
        PotentialPalindromeDeque dequeTest = new PotentialPalindromeDeque("Hello World");
        PotentialPalindromeDeque dequeTest2 = new PotentialPalindromeDeque("Madam I'm Adam");
        assertFalse(dequeTest.isPalindromeDeque());
        assertTrue(dequeTest2.isPalindromeDeque());
    }

}