import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
       
        Scanner m = new Scanner(System.in);

         // integer division 5/2=2

        int t = m.nextInt();
        for (int i = 0; i < t; i++) {
            int N = m.nextInt();
            int K = m.nextInt();
            int Max_Cut = (N /K) * (N/ K);
            System.out.println(Max_Cut);
        }

    }
}