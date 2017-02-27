import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * Created by hgoscenski on 2/22/17.
 */
@SuppressWarnings("Duplicates")


public class PotentialPalindromeDeque extends BasePalindrome {
    ArrayDeque dequePalindrome;

    /**
     * @param tempString this is the potential palindrome
     */
    public PotentialPalindromeDeque(String tempString){
        super(tempString);
        origPotentialPalindrome = tempString;
        testPalindrome = sanitizePotentialPalindrome(tempString);
        dequePalindrome = new ArrayDeque();
        for(int i = 0; i<testPalindrome.length();i++){
            dequePalindrome.add(testPalindrome.charAt(i));
        }
    }

    /**
     * @return whether the potential palindrome is in fact a palindrome
     */
    public boolean isPalindromeDeque(){
        int counter = 0;
        int target = dequePalindrome.size() / 2;
        while(!dequePalindrome.isEmpty()){
            if(dequePalindrome.getLast() == dequePalindrome.getFirst()) {
                counter ++;
                dequePalindrome.removeFirst();
                dequePalindrome.removeLast();
                if(counter==target){
                    return true;
                }
            }
            else return false;
        }
        return false;
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
