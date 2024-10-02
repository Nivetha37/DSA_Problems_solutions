/*Alice and Bob are playing a game of Blobby Volley.
  In this game, in each turn, one player is the server and the other player is the receiver.
  Initially, Alice is the server, and Bob is the receiver.

If the server wins the point in this turn, their score increases by 1, and they remain as the server for the next turn.
But if the receiver wins the point in this turn, their score does not increase. But they become the server in the next turn.
In other words, your score increases only when you win a point when you are the server.
Please see the Sample Inputs and Explanation for more detailed explanation.

They start with a score of 0 each, and play N turns. 
The winner of each of those hands is given to you as a string consisting of 'A's and 'B's. 
'A' denoting that Alice won that point, and 'B' denoting that Bob won that point.
Your job is the find the score of both of them after the N turns.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();

            int a = 1, a_count = 0, b_count = 0; // a=1 alice is server a=0 bob is server
            String s = scanner.next();


            for (int i = 0; i < n; i++) {

                char ch = s.charAt(i);

                if (a == 1 && ch == 'A') a_count++;

                else if (a == 1 && ch != 'A') a = 0;

                else if (a == 0 && ch == 'B') b_count++;

                else a = 1; 
            }

            System.out.println(a_count + " " + b_count);
        }
    }
}
