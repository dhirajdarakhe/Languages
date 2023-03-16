#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure
class Test
{
public:
    
    static int v;
    int c;
    static void func()
    {
        v++;
        // c++;
    }
    Test()
    {
        c = 0;
    }
};

// 2
int Test ::v = 0;

int main()
{
    Test t1;
    Test t2;
    t1.func();
    cout << Test ::v << " " << t1.v << " " << t2.v << endl;
    return 0;
}