
/*Watson gives Sherlock an array of integers.
  His challenge is to find an element of the array such that the sum of all elements to the left is equal to the sum of all elements to the right.*/
import java.util.*;


public class Solution {

    public static String balancedSums(int[] a) {
        // Write your code here
        if(a.length==1){
            return "YES";
        }
        
        int found = 0,leftsum=0,rightsum=0;
        for(int j=1;j<a.length;j++){
            rightsum+=a[j];
        }
        
        for (int i = 0; i < a.length-1; i++) {
           if(leftsum == rightsum){
               return "YES";
           }
           else{
               leftsum+=a[i];
               rightsum-=a[i+1];
           } 
        }
        return "NO";
        
    }

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        while (t-- > 0) {
            int n = m.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = m.nextInt();
            }
            System.out.println(balancedSums(a));
        }

    }
}
