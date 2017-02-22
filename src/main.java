import java.util.Scanner;

/**
 * Created by hgoscenski on 2/21/17.
 */
public class main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String[] largeListOfTestPalindromes = {
                "A man, a plan, a canal -- Panama",
                "Never a foot too far, even.",
                "I, man, am regal; a German am I.",
                "Sex at noon taxes.",
                "Too hot to hoot.",
                "Live not on evil deed, live not on evil.",
                "Sir, I'm Iris!",
                "Name now one man.",
                "Mad? Am I, madam?",
                "Madam, in Eden I'm Adam!",
                "Madam, I'm Adam!",
                "Able was I ere I saw Elba.",
                "Step on no pets!",
                "Niagara, O roar again!",
                "Was it a rat I saw?",
                "Adam, I'm Ada!",
                "A Toyota.",
                "Never odd or even.",
                "Was it a car or a cat I saw?",
                "‘Redivider’",
                "‘Aibohphobia’"};
        String[] notPalindromes = {
                "Not one",
                "Nor me"
        };


        testPalindromes(largeListOfTestPalindromes);
        testPalindromes(notPalindromes);

//        boolean notQuit = false;
//        while (notQuit) {
//            System.out.println("Please provide a potential palindrome posthaste!");
//            String origString = "";
//            String sanitizedString = "";
//            origString = stdin.nextLine();
//            sanitizedString = origString.toLowerCase();
//            if (sanitizedString.equals("quit")) {
//                notQuit = false;
//                System.exit(2);
//            }
//
//            if (isPalindrome(sanitizedString)){
//                System.out.println("We have a winner");
//            }
//        }
//        BasePalindrome testBase = new BasePalindrome("Madam I'm Adam");
//        System.out.println(testBase.toString());
//        System.out.println(testBase.getOrigPotentialPalindrome());
//        System.out.println(testBase.isPalindromeBasic());
//
//        PotentialPalindromeArrayList testArray = new PotentialPalindromeArrayList("Madam I'm Adam");
//        System.out.println(testArray.toString());
//        System.out.println(testArray.getOrigPotentialPalindrome());
//        System.out.println(testArray.isPalindromeArrayList());


    }

    public static void testPalindromes(String[] palindromeList) {

        System.out.println("This is using the arraylist\n");
        for (String palin : palindromeList) {
            PotentialPalindromeArrayList testArray = new PotentialPalindromeArrayList(palin);
            System.out.println(testArray.toString());
            System.out.println(testArray.getOrigPotentialPalindrome());
            System.out.println(testArray.isPalindromeArrayList() + "\n");
        }

        System.out.println("\nThis is using the linkedlist \n");

        for (String palin : palindromeList) {
            PotentialPalindromeLinkedList testArray = new PotentialPalindromeLinkedList(palin);
            System.out.println(testArray.toString());
            System.out.println(testArray.getOrigPotentialPalindrome());
            System.out.println(testArray.isPalindromeLinkedList() + "\n");
        }

    }
}