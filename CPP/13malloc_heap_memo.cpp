#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure

int main()
{
    int *num = (int *)malloc(sizeof(int) * 3);
    for (int i = 0; i < 3; ++i)
        cin >> *(num + i);
    cout << endl;
    for (int i = 0; i < 3; ++i)
        cout << *(num + i) << " ";
    return 0;
   // in 1 2 3
   // out 1 2 3
}