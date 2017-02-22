import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by hgoscenski on 2/22/17.
 */
class PotentialPalindromeLinkedListTest {
    @Test
    void isPalindromeLinkedList() {

        String input = "Madam I'm Adam";
        String input2 = "Madam I'm not adam";
        PotentialPalindromeLinkedList b = new PotentialPalindromeLinkedList(input);
        PotentialPalindromeLinkedList b2 = new PotentialPalindromeLinkedList(input2);
        assertTrue(b.isPalindromeLinkedList());
        assertFalse(b2.isPalindromeLinkedList());
    }

}