#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure
class frd
{
private:
    int x;
    friend void func();

protected:
    int y;

public:
    int z;
};
void func()
{
    frd f;
    f.x = 1;
    f.y = 2;
    f.z = 3;
    cout << f.x << " " << f.y << " " << f.z << endl;
}

int main()
{
    func();
    return 0;
}