import java.util.*;

/**
 * Created by hgoscenski on 2/22/17.
 */
@SuppressWarnings("Duplicates")


public class PotentialPalindromeArrayList extends BasePalindrome {
    ArrayList arrayPalindrome;

    public PotentialPalindromeArrayList(String tempString){
        super(tempString);
        origPotentialPalindrome = tempString;
        testPalindrome = sanitizePotentialPalindrome(tempString);
//        testPalindrome = tempString;
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
            } else return false;
        }
        return false;
    }

//    public void isPalindromeIterator(){
//        String[] badChars ={"!", ",", " ", "\'"};
//        CustomIteratorOfPainAndSuffering ciopas = new CustomIteratorOfPainAndSuffering(badChars, arrayPalindrome);
//        while(ciopas.hasNext()){
//            System.out.println(ciopas.next());
//        }
//    }

    @Override
    public String toString() {
        Iterator it = arrayPalindrome.iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()){
            sb.append(it.next());
        }
        return sb.toString();
    }
//
//    public class CustomIteratorOfPainAndSuffering implements Iterator {
//
//        ListIterator fit;
//        List listThing;
//        List badCharsList;
//
//        public CustomIteratorOfPainAndSuffering(String[] badChars, ArrayList array) {
//            badCharsList = Arrays.asList(badChars);
//            System.out.println(badCharsList);
//            System.out.println(array);
//            this.listThing = array;
//            fit = array.listIterator();
//        }
//
//        @Override
//        public boolean hasNext() {
//            if(!badCharsList.contains(fit.next()))
//            while(badCharsList.contains(fit.next())){
//                continue;
//            }
//
//        }
//
//        @Override
//        public String next() {
//            if (fit.hasNext()) {
//                String thing = fit.next().toString();
//                return thing;
//            }
//            return null;
//        }
//    }
}