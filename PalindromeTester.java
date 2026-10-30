import java.util.Scanner;
public class PalindromeTester{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(true){
            System.out.print("Enter a palindrome: ");
            input = scanner.nextLine();
            if(PalindromeCheck.isPalindrome(input))
            {
                System.out.println("Yep, that's a palindrome. Good job.");
            }
            else
            {
                System.out.println("That's not a palindrome.");
            }
        }
        /*
        System.out.println("racecar");
        System.out.println(PalindromeCheck.isPalindrome("racecar"));
        System.out.println("tacocat");
        System.out.println(PalindromeCheck.isPalindrome("tacocat"));
        System.out.println("Question");
        System.out.println(PalindromeCheck.isPalindrome("Question"));
        System.out.println("!Barab");
        System.out.println(PalindromeCheck.isPalindrome("!Barab"));
        System.out.println("tAcoCAT");
        System.out.println(PalindromeCheck.isPalindrome("tAcoCAT"));
        System.out.println("Are we not drawn onward, we few, drawn onward to new era?");
        System.out.println(PalindromeCheck.isPalindrome("Are we not drawn onward, we few, drawn onward to new era?"));
        System.out.println("racecar");
        System.out.println(PalindromeCheck.isPalindrome("racecar"));
        */
    }
}