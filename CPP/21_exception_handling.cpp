#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure
int divi(int x, int y) 
// throw (int)
{
    if (y == 0)
        throw 1;
    return x / y;
}
int main()
{

    try
    {
        int x = 12;
        int y = 0;
        cout << divi(x, y);
    }
    catch (int x)
    {
        cout << "Exception Occured\n";
    }
    return 0;
}