/*Burgers
Chef is fond of burgers and decided to make as many burgers as possible.
Chef has A patties and B buns. To make 1 burger, Chef needs 1 patty and 1 bun.
Find the maximum number of burgers that Chef can make.
*/

#include <iostream>

using namespace std;

int main() {
    int T;
    cin >> T;
    while (T--)
    {
        int A, B;
        cin >> A >> B;
        if (A > B)
        {
            cout << B << endl;
        }
        else if (A < B)
        {
            cout << A << endl;
        }
        else if (A == B)
        {
            cout << A << endl;
        }
    }
    return 0;
}
