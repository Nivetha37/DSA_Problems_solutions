/*
Chef has a binary string S of length N. 
Chef can perform the following operation on S:Insert any character (0 or 1) at any position in S.
Find the minimum number of operations Chef needs to perform so that no two consecutive characters are same in S.

NOTE** : use nextLine(); function in case of getting string after an integer.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();

        while (t-- > 0) {
            int n = m.nextInt();
            m.nextLine();
            String S = m.nextLine();
            char[] s = S.toCharArray();
            int count = 0;

            if (n > 0) {
                for (int i = 0; i < n - 1; i++) {
                    if (s[i] == s[i + 1]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }

}
