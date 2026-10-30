import java.util.Stack;
public class PalindromeCheck{
    public static boolean isPalindrome(String s){
        Stack<String> stack = new Stack<>();
        String s2 = "";
        String s3 = "";
        String s4 = "";
        for(int i = s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            if(c!=' '&&c!='!'&&c!='?'&&c!=','&&c!='.'&&c!='\'')
                stack.add((c+"").toLowerCase());
        }
        while(!stack.isEmpty())
        {
            s2+=stack.peek();
            s4=stack.pop();
            s4+=s3;
            s3 = s4;
        }
        
        return s3.equals(s2);
    }
}