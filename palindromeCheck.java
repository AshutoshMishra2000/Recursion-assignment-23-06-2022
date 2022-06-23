public class palindromeCheck {
    public static boolean isPalinddrome(String str, int start, int end) {
        if (start == end) {
            return true;
        }
        if(start>end){
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalinddrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "aba";
        if (isPalinddrome(str, 0, str.length() - 1)) {
            System.out.println("PalinDrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
