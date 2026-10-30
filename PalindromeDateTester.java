import java.util.Scanner;
public class PalindromeDateTester{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        boolean wasThere = false;
        System.out.println("You give me a year, and I'll give you all palindromic dates in that year, if there are any!");
        while(true){
            System.out.print("Enter a year: ");
            input = scanner.nextLine();
            wasThere = false;
            try{
                Integer.parseInt(input);
                for(int i = 1; i < 13; i++)
                {
                    if(i == 2){
                        //is leap year?
                        if(Integer.parseInt(input)%4==0)
                        {
                            for(int j = 1; j < 30; j++)
                            {
                                if(PalindromeCheck.isPalindrome(parseDate(i,j,input)))
                                {
                                    System.out.println(parseDate(i,j,input));
                                    wasThere = true;
                                }
                            }
                        }
                        else
                        {
                            for(int j = 1; j < 29; j++)
                            {
                                if(PalindromeCheck.isPalindrome(parseDate(i,j,input)))
                                {
                                    System.out.println(parseDate(i,j,input));
                                    wasThere = true;
                                }
                            }
                        }
                    }
                    else if(i % 2 == 0)
                    {
                        for(int j = 1; j < 31; j++)
                        {
                            if(PalindromeCheck.isPalindrome(parseDate(i,j,input)))
                            {
                                System.out.println(parseDate(i,j,input));
                                wasThere = true;
                            }
                        }
                    }
                    else
                    {
                        for(int j = 1; j < 32; j++)
                        {
                            if(PalindromeCheck.isPalindrome(parseDate(i,j,input)))
                            {
                                System.out.println(parseDate(i,j,input));
                                wasThere = true;
                            }
                        }
                    }
                }
            }
            catch(NumberFormatException e){
                System.out.println("That's not a year!");
            }
            if(!wasThere)
            {
                System.out.println("Oof, that was a palindrome-less year!");
            }
        }
    }

    public static String parseDate(int m, int d, String y)
    {
        String date = "";
        if((m+"").length()==1)
            date+="0"+m;
        else
            date+=m;
        
        if((d+"").length()==1)
            date+="0"+d;
        else
            date+=d;

        return date+y;
    }
}