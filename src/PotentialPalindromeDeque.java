import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

/**
 * Created by hgoscenski on 2/22/17.
 */
@SuppressWarnings("Duplicates")


public class PotentialPalindromeDeque extends BasePalindrome {
    ArrayDeque dequePalindrome;

    public PotentialPalindromeDeque(String tempString){
        super(tempString);
        origPotentialPalindrome = tempString;
        testPalindrome = sanitizePotentialPalindrome(tempString);
        dequePalindrome = new ArrayDeque();
        for(int i = 0; i<testPalindrome.length();i++){
            dequePalindrome.add(testPalindrome.charAt(i));
        }
    }

    @Override
    public String toString() {
        Iterator it = dequePalindrome.iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()){
            sb.append(it.next());
        }
        return sb.toString();
    }


}
