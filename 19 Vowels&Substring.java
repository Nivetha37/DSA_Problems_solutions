/*
Chef has a string S with him. 
Chef is happy if the string contains a contiguous substring of length strictly greater than 2 in which all its characters are vowels.
Determine whether Chef is happy or not.
English alphabet, vowels are a, e, i, o, and u.
*/

import java.util.Scanner;
public class Main {
    
    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            char[] ch = s.toCharArray();
            int n = ch.length;
            int count = 0;
          
            for (int i = 0; i < n - 2; i++) {
                if (isVowel(ch[i])) {
                    if (isVowel(ch[i+1])) {
                        if (isVowel(ch[i+2])) {
                            count++;
                            break;
                        }
                    }

                }
            }
            if (count > 0) {
                System.out.println("Happy");
            }
            else {
                System.out.println("Sad");
            }
        }

    }
}
