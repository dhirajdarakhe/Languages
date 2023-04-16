#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure
class Base
{

public:
    Base()
    {
        cout << "Constrctor of Base calss\n";
    }
    ~Base()
    {
        cout << "Destructor of Base calss\n";
    }
};
class Derived : public Base
{

public:
    Derived()
    {
        cout << "Constrctor of Derived calss\n";
    }
    ~Derived()
    {
        cout << "Destructor of Derived calss\n";
    }
};


int main()
{
    Derived D;
    return 0;
}

// Constrctor of Base calss
// Constrctor of Derived calss
// Destructor of Derived calss
// Destructor of Base calss