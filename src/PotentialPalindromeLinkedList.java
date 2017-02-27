import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by hgoscenski on 2/22/17.
 */
@SuppressWarnings("Duplicates")

public class PotentialPalindromeLinkedList extends BasePalindrome {
    LinkedList linkedPalindrome;

    /**
     * @param tempString takes in the string that may or may not be a palindrome
     */
    public PotentialPalindromeLinkedList(String tempString){
        origPotentialPalindrome = tempString;
        testPalindrome = sanitizePotentialPalindrome(tempString);
        linkedPalindrome = new LinkedList();
        for(int i = 0; i<testPalindrome.length();i++){
            linkedPalindrome.add(testPalindrome.charAt(i));
        }
    }

    /**
     * @return returns the boolean value of the the palindromity
     */
    public boolean isPalindromeLinkedList(){
        ListIterator itF = linkedPalindrome.listIterator();
        ListIterator itR = linkedPalindrome.listIterator(linkedPalindrome.size());
        int halfPalin = linkedPalindrome.size()/2;
        int counter = 0;
        while(itF.hasNext() && itR.hasPrevious()){
            if(itF.next().equals(itR.previous())){
                counter++;
                if(counter==halfPalin){
                    return true;
                }
            } else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        Iterator it = linkedPalindrome.iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()){
            sb.append(it.next());
        }
        return sb.toString();
    }
}
