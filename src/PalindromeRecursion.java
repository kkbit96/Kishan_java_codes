public class PalindromeRecursion {
    //Check if a number is palindrome using recursion
    public static boolean Palindrome(String str, int start, int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return Palindrome(str, start+1, end-1);
    }

    public static void main(String[] args) {
        String str = "madam";
        if(Palindrome(str, 0, str.length()-1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
