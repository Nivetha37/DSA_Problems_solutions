/*You are given a string containing characters  A and B only.
  Your task is to change it into a string such that there are no matching adjacent characters. 
  To do this, you are allowed to delete zero or more characters in the string.
  Your task is to find the minimum number of required deletions.*/
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int q = m.nextInt();
        m.nextLine();
        while(q-->0){
           String s = m.nextLine();
           int count = 0;
           for(int i=1;i<s.length();i++){
               if(s.charAt(i) == s.charAt(i-1)) count++;
           }
           System.out.println(count); 
        }
    }
}
