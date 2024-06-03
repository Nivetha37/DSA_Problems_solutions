/*
Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month m , and,
The sum of the integers on the squares is equal to his birth day d.
Determine how many ways she can divide the chocolate.
  */
import java.util.*;

public class Solution{
    
    public static int Birthday(int[] s,int d,int m){
        int n = s.length;
        int count=0;
        for(int i=0;i<n-m+1;i++){
            int sum = 0;
            for(int j=i;j<i+m;j++){
                sum+=s[j];
            }
            if(sum==d){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Birthday(s,d,m));
    }
}
