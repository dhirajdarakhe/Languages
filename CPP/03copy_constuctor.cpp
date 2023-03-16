#include <bits/stdc++.h>
using namespace std;
#define ll long long
class Test
{
    int *ptr;

public:
    Test(int i)
    {
        ptr = new int(i);
    }
    void set(int x)
    {
        *ptr = x;
    }
    void print()
    {
        cout << *ptr;
    }
};
int main()
{
    Test t(0), x(0);
    t = x;
    t.set(12);
    x.print(); // 12

    return 0;
}