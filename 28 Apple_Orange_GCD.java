import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner c = new Scanner(System.in);
        int t = c.nextInt();
        for (int i = 0; i < t; i++) {
            int m = c.nextInt();
            int n = c.nextInt();
            int r = 0;
            while (n != 0) {
                r = m % n;
                m = n;
                n = r;
            }
            System.out.println(m);
        }
    }
}