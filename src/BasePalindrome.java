/**
 * Created by hgoscenski on 2/22/17.
 */
public class BasePalindrome {
    String testPalindrome;
    String origPotentialPalindrome;

    public BasePalindrome(String testString){
        origPotentialPalindrome = testString;
        testPalindrome = sanitizePotentialPalindrome(testString);
    }
    public BasePalindrome(){}

    public String sanitizePotentialPalindrome(String testPalin){
        String tempPalin = "";
        tempPalin = testPalin.toLowerCase();
        tempPalin = tempPalin.replaceAll("[^a-z]", "");
        return tempPalin;
    }

    public String getOrigPotentialPalindrome() {
        return origPotentialPalindrome;
    }

    public boolean isPalindromeBasic(){
        String reversedString ="";
        for (int i = testPalindrome.length()-1; i >= 0; i--) {
            reversedString += testPalindrome.charAt(i);
        }
        return(reversedString.equals(testPalindrome));
    }

    @Override
    public String toString() {
        return testPalindrome;
    }
}
