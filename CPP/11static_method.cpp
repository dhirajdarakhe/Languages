#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure
class Test
{
public:
    // 1
    // static int v = 0;

    // 2
    static int v;

    Test()
    {
        v++;
        // cout << v << " ";
    }
};

// 2
int Test ::v = 0;

int main()
{
    // 1
    // Test t1;
    // Test t2;
    // 10static.cpp:9:20: error: ISO C++ forbids in-class initialization of non-const static member 'Test::v'
    //  static int v = 0;

    // 2
    Test t1;
    Test t2;
    // 1 2
    t1.v = 12;
    t2.v = 1123;
    cout << Test ::v << " " << t1.v << "  " << t2.v << endl;
    return 0;
}