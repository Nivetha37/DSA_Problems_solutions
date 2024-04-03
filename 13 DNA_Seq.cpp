/* For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:

00 is replaced with A
01 is replaced with T
10 is replaced with C
11 is replaced with G*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            char [] arr = s.toCharArray();

            // Your code goes here
            for(int i=0;i<n;i+=2){
                String sub=""+arr[i]+arr[i+1];
                if(sub.equals("00")){
                    System.out.print("A");
                }
                else if(sub.equals("01")){
                    System.out.print("T");
                }
                else if(sub.equals("10")){
                    System.out.print("C");
                }
                else if(sub.equals("11")){
                    System.out.print("G");
                }
                else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
