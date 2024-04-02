#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
	// your code goes here

	    int a,b,n;
	    cin>>n>>a>>b;
	    cout<<(n-a)<<" "<<(n-(a+b))<<endl;
	 
	return 0;
}

/*

n - total no of users
a - no of users who only saw the problems without any submission.
b - no of user who made submissions but no answers are correct.
(n-a)  - no of user who got ratings
(n-(a+b) - no of users who got ratings above 1000.

  note:if not made any submissions then no ratings will be awarded.
       if made submisions but no answers are correct then ratings will be 700 - 800.
       if solved atleast one answers correctly then get ratings above 1000.

task: find no of users who got ratings and users who ratings above 1000.
*/ 
