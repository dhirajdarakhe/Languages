#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure
class frd
{
private:
    int x;
    friend class xyz;

protected:
    int y;

public:
    int z;
};
class xyz
{
public:
    void func()
    {
        frd f;
        f.x = 1;
        f.y = 2;
        f.z = 3;
        cout << f.x << " " << f.y << " " << f.z << endl;
    }
};

int
main()
{
    xyz x;
    x.func();
    return 0;
}