/*
two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show.
If it is possible, return YES, otherwise return NO.
  */

import java.util.*;

public class Solution{
    public static void Kangaroo(int x1,int v1,int x2,int v2){
    
        if(v1 != v2){
            if((x2-x1)%(v1-v2)==0 && (x2-x1)/(v1-v2)>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int x1 = m.nextInt();
        int v1 = m.nextInt();
        int x2 = m.nextInt();
        int v2 = m.nextInt();
        Kangaroo(x1,v1,x2,v2); 
    }
}
