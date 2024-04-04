/*
modify the value of a as a = a+b
modify the value of b as b=|a-b|
using pointers
NOTE: for subtraction using pointers use 2* 
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void update(int& a,int& b){
    a=a+b;
    b=abs(a-2*b);
    cout<<a<<endl;
    cout<<b<<endl;
}


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int a,b;
    cin>>a;
    cin>>b;
    update(a,b);
      
    return 0;
}
