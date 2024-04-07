/*
1. string S --->contains only lowercase ,uppercase (English letters), spaces.
2. convert it into title case
    title case : i) the first letter of each word is capitalized while the rest are in lowercase
                ii) except for words that are entirely in uppercase (considered as acronyms), which should remain unchanged

SOLUTION:
Split the input string into individual words based on spaces.
For each word:
Check if it is entirely in uppercase. If yes, it’s an acronym, so keep it unchanged.
If not, capitalize the first letter and convert the rest of the letters to lowercase.
Join all the modified words back together into a single string with spaces between them.
Output the resulting title case string.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int t = m.nextInt();
		m.nextLine();
		
		while(t-- >0){
		    String str=m.nextLine();
		    String[] s = str.split(" ");
		    int n = s.length;
		    String[] res=new String[n];
		    
		    for(int i=0;i<n;i++){
		        String words=s[i];
		        char[] ch = words.toCharArray();
		        
		        if(words.equals(words.toUpperCase())){
		            res[i]=words+" ";
		        }
		        
		        else{
		           ch[0]= Character.toUpperCase(ch[0]);
		           for(int j=1;j<ch.length;j++){
		               ch[j]=Character.toLowerCase(ch[j]);
		           }
		           res[i]=new String(ch);
		        }
		    }
		    
		    for(int i=0;i<n;i++){
		        System.out.print(res[i]+" ");
		    }
		    
		    System.out.println();
		    
		}

	}
}
