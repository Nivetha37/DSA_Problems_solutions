/*
Chef invented a modified wordle.

There is a hidden word S and a guess word T, both of length 5.

Chef defines a string M to determine the correctness of the guess word.

For the i th index:
    -If the guess at the i th index is correct, the i th character of M is G.
    -If the guess at the i th index is wrong, the i th character of M is B.
    -Given the hidden word S and guess T, determine string M.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m =new Scanner(System.in);
		int t= m.nextInt();
		m.nextLine();
		
		while(t-- >0){
		    String S=m.nextLine();
		    String T=m.nextLine();
		    int n=S.length();
		    char [] s1=S.toCharArray();
		    char [] t1=T.toCharArray();
		    char [] M= new char[n];
		    
		    for(int i=0;i<n;i++){
		        if(s1[i]==t1[i]){
		          M[i]='G';  
		        }
		        else{
		            M[i]='B';
		        }
		    }
		    System.out.println(new String(M));
		}

	}
}
