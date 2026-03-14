import java.util.Scanner;
class Solution {
    public static boolean isPalindrome(int x) {
       String a= Integer.toString(x);
       StringBuilder s= new StringBuilder(a);
       s.reverse();
       String rev=s.toString();
       if(a.equals(rev)){
           return true;
       }
       else{
           return false;
       }
        }
    
    public static void main(String[]argh){
       Scanner z= new Scanner(System.in);
       int x=z.nextInt();
       System.out.print(Solution.isPalindrome(x));
    }
}
