

/**
 * Created by hgoscenski on 2/22/17.
 */
public class BasePalindrome {
    String testPalindrome;
    String origPotentialPalindrome;

    /**
     * @param testString is the potential palindrome
     */
    public BasePalindrome(String testString){
        origPotentialPalindrome = testString;
        testPalindrome = sanitizePotentialPalindrome(testString);
    }

    public BasePalindrome(){}

    /**
     * @param testPalin is a string that is then sanitized
     * @return returns the string value
     */
    public String sanitizePotentialPalindrome(String testPalin){
        String tempPalin = "";
        tempPalin = testPalin.toLowerCase();
        tempPalin = tempPalin.replaceAll("[^a-z]", "");
        return tempPalin;
    }

    /**
     * @return provides the original palindrome
     */
    public String getOrigPotentialPalindrome() {
        return origPotentialPalindrome;
    }

    /**
     * @return returns the boolean value of palindromity
     */
    public boolean isPalindromeBasic(){
        String reversedString ="";
        for (int i = testPalindrome.length()-1; i >= 0; i--) {
            reversedString += testPalindrome.charAt(i);
        }
        return(reversedString.equals(testPalindrome));
    }

}
