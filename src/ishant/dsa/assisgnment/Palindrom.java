package ishant.dsa.assisgnment;

public class Palindrom {
    public static void main(String[] args) {
        String a="radar";
        if (isPalindrome(a)) {
            System.out.println("Data is Palindrome");
        }else{
            System.out.println("Data is Not Palindrome");
        }
    }
    private static boolean isPalindrome (String data){
        int i=0,j=data.length()-1;
        while (i<j){
            if (data.charAt(i) != data.charAt(j)) {
                return  false;
            }
            i++;
            j--;

        }
        return true;
    }
}
