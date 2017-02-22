import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by hgoscenski on 2/22/17.
 */
public class PotentialPalindromeArrayList extends BasePalindrome {
    ArrayList arrayPalindrome;

    public PotentialPalindromeArrayList(String tempString){
        super(tempString);
        origPotentialPalindrome = tempString;
        testPalindrome = sanitizePotentialPalindrome(tempString);
        arrayPalindrome = new ArrayList();
        for(int i = 0; i<testPalindrome.length();i++){
            arrayPalindrome.add(testPalindrome.charAt(i));
        }
    }

    public boolean isPalindromeArrayList(){
        ListIterator itF = arrayPalindrome.listIterator();
        ListIterator itR = arrayPalindrome.listIterator(arrayPalindrome.size());
        int halfPalin = arrayPalindrome.size()/2;
        int counter = 0;
        while(itF.hasNext() && itR.hasPrevious()){
            if(itF.next().equals(itR.previous())){
                counter++;
                if(counter==halfPalin){
                    return true;
                }
            } else {return false;}
        }

        return false;
    }

    @Override
    public String toString() {
        Iterator it = arrayPalindrome.iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()){
            sb.append(it.next());
        }
        return sb.toString();
    }
}
