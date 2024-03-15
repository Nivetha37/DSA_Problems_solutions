import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        for (int i = 0; i < t; i++) {
            int a = m.nextInt();
            int b = m.nextInt();
            double s1 = 100 - (100 * a / 100);
            double s2 = 200 - (200 * b / 100);


            if (s1 < s2) {
                System.out.println("FIRST");
            }
            else if (s1 > s2) {
                System.out.println("SECOND");
            }
            else {
                System.out.println("BOTH");
            }
        }
    }
}