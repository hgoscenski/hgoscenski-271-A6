import java.util.Scanner;

/**
 * Created by hgoscenski on 2/21/17.
 */
public class main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String origString;
        int switchInt;

        boolean notQuit = true;

//        PotentialPalindromeArrayList ppal = new PotentialPalindromeArrayList("Madam I'm Adam");
//        ppal.isPalindromeIterator();
//
        while (notQuit) {
            System.out.println("Please select the Collection used to store and test the palindrome.\n" +
                    "Simply type the number of the item:\n1. String \n2. ArrayList \n3. LinkedList\n4. Deque\n5. Quit");
            switchInt = stdin.nextInt();

            if (switchInt == 5) {
                notQuit = false;
                System.exit(2);
            }
            stdin.nextLine();
            System.out.println("Please provide a potential palindrome posthaste!");
            origString = stdin.nextLine();
            testingOfThePalindrome(switchInt, origString);


            //        String[] largeListOfTestPalindromes = {
//                "A man, a plan, a canal -- Panama",
//                "Never a foot too far, even.",
//                "I, man, am regal; a German am I.",
//                "Sex at noon taxes.",
//                "Too hot to hoot.",
//                "Live not on evil deed, live not on evil.",
//                "Sir, I'm Iris!",
//                "Name now one man.",
//                "Mad? Am I, madam?",
//                "Madam, in Eden I'm Adam!",
//                "Madam, I'm Adam!",
//                "Able was I ere I saw Elba.",
//                "Step on no pets!",
//                "Niagara, O roar again!",
//                "Was it a rat I saw?",
//                "Adam, I'm Ada!",
//                "A Toyota.",
//                "Never odd or even.",
//                "Was it a car or a cat I saw?",
//                "‘Redivider’",
//                "‘Aibohphobia’"
//        };
//        String[] notPalindromes = {
//                "Not one",
//                "Nor me"
//        };

//        testPalindromes(largeListOfTestPalindromes);
//        testPalindromes(notPalindromes);
//            switch (switchInt){
//                case 1:
//                    testingOfThePalindrome(1, origString);
//                    break;
//                case 2:
//                    testingOfThePalindrome(2, origString);
//                    break;
//                case 3:
//                    testingOfThePalindrome(3, origString);
//                    break;
//                case 4:
//                    testingOfThePalindrome(4, origString);
//                    break;
        }
    }

    public static void testingOfThePalindrome(int type, String potential) {
        switch (type) {
            case 1:
                BasePalindrome b = new BasePalindrome(potential);
                if (b.isPalindromeBasic()) {
                    System.out.println(b.getOrigPotentialPalindrome() + " is a palindrome.");
                } else {
                    System.out.println(b.getOrigPotentialPalindrome() + " is not a palindrome.");
                }
                break;
            case 2:
                PotentialPalindromeArrayList a = new PotentialPalindromeArrayList(potential);
                if (a.isPalindromeArrayList()) {
                    System.out.println(a.getOrigPotentialPalindrome() + " is a palindrome.");
                } else {
                    System.out.println(a.getOrigPotentialPalindrome() + " is not a palindrome.");
                }
                break;
            case 3:
                PotentialPalindromeLinkedList c = new PotentialPalindromeLinkedList(potential);
                if (c.isPalindromeLinkedList()) {
                    System.out.println(c.getOrigPotentialPalindrome() + " is a palindrome.");
                } else {
                    System.out.println(c.getOrigPotentialPalindrome() + " is not a palindrome.");
                }
                break;
            case 4:
                PotentialPalindromeDeque d = new PotentialPalindromeDeque(potential);
                if (d.isPalindromeDeque()) {
                    System.out.println(d.getOrigPotentialPalindrome() + " is a palindrome.");
                } else {
                    System.out.println(d.getOrigPotentialPalindrome() + " is not a palindrome.");
                }
                break;
        }
        System.out.println("\n\n");
    }
//
//    public static void testPalindromes(String[] palindromeList) {
//
//        System.out.println("This is using the arraylist\n");
//        for (String palin : palindromeList) {
//            PotentialPalindromeArrayList testArray = new PotentialPalindromeArrayList(palin);
//            System.out.println(testArray.isPalindromeArrayList() + "\n");
//        }
//
//        System.out.println("\nThis is using the linkedlist \n");
//
//        for (String palin : palindromeList) {
//            PotentialPalindromeLinkedList testArray = new PotentialPalindromeLinkedList(palin);
//            System.out.println(testArray.isPalindromeLinkedList() + "\n");
//        }
//
//        System.out.println("\nThis is using the deque \n");
//
//        for (String palin : palindromeList) {
//            PotentialPalindromeDeque testArray = new PotentialPalindromeDeque(palin);
//            System.out.println(testArray.isPalindromeDeque() + "\n");
//        }
//
//    }
}