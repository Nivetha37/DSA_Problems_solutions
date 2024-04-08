/*
-14 Classical games will be played between Chef and Carlsen in the championship, where each game has one of three outcomes — it can be won by Carlsen, won by Chef, or it can be a draw.
The winner of a game 2 gets points, and the loser gets 0 points. If it’s a draw, both players get 1 point each.The total prize pool of the championship is100⋅X. 
At end of the 14 Classical games, if one player has strictly more points than the other, he is declared the champion and gets 60⋅X as his prize money, and the loser gets 40⋅X.
If the total points are tied, then the defending champion Carlsen is declared the winner. However, if this happens, the winner gets only 55⋅X, and the loser gets 45⋅X.
Given the results of all the 14 games, output the prize money that Carlsen receives.The results are given as a string of length 14 consisting of the characters C, N, and D.

C denotes a victory by Carlsen.
N denotes a victory by Chef.
D denotes a draw.

For each test case, output in a single line the total prize money won by Carlsen.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner m = new Scanner(System.in);
		int t=m.nextInt();
		while(t-- >0){
		    int x=m.nextInt();
		    m.nextLine();
		    String res=m.nextLine();
		    char[] ch=res.toCharArray();
		    
		    //loop to calculate the points
		    int carlesn=0;
		    int chef=0;
		    for(int i=0;i<ch.length;i++){
		        if(ch[i]=='C'){
		            carlesn+=2;
		        }
		        else if(ch[i]=='N'){
		            chef+=2;
		        }
		        else{
		            carlesn++;
		            chef++;
		        }
		    }
		    
		    //money won by carlesn
		    int price = 0;
		    if(carlesn > chef){
		        price = 60*x;
		    }
		    else if(carlesn < chef){
		        price = 40*x;
		    }
		    else{
		        price = 55*x;
		    }
		    
		    System.out.println(price);  
		}
	}
}
