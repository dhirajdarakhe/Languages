#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure
class Base
{
public:
    Base() { cout << "Non-param base " << endl; }
    Base(int x) { cout << "Param base " << x << endl; }
};
class Derived : public Base
{
public:
    Derived() { cout << "Non-param Derived" << endl; }
    Derived(int x) { cout << "param of Derived" << endl; }
    Derived(int x, int y) : Base(x)
    {
        cout << "D-param Const " << x << " " << y << endl;
    }
};
int main()
{
    // |
    // Derived d(12, 12);
    // Param base 12
// D-param Const 12 12

//   Derived d(12);
//   Non-param base 
// param of Derived
    return 0;
}