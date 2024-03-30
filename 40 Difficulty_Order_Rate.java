/*
-Here, the array d[] contains the difficulty ratings of the problems solved by the students. 
-Initially, a reference variable count is set to 0.
-We have to check through the entire array to see if the current item is greater than the previous item. 
-If not,(d[i]<d[i-1]) increment the count and break from the loop. 
-Output "Yes" if count is 0 after processing the entire -array; otherwise, output "No".
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }


            int count = 0;
            for (int i = 1; i < n; i++) {
                if (d[i] < d[i - 1]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
