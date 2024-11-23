

public class palindromecheck{
    public static void main(String[] args) {
        String a="madam";
        boolean ispalindrome=true;
        int length=a.length();
        for(int i=0;i<length/2;i++)
        {
            if(a.charAt(i)!=a.charAt(length-1-i)){
                ispalindrome=false;
                break;
            }
        }
        if(ispalindrome){
            System.out.println("the string is a palindrome");
        }
        else{
            System.out.println("the string is not palindrome");
        }
    }
}