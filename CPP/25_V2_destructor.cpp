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
    virtual ~Base()
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
    // case 1 : if it is not virtual  destructor
    // Base *BD = new Derived();
    // delete BD;
    // return 0;
    // Constrctor of Base calss
    // Constrctor of Derived calss
    // Destructor of Base calss

    // case 2 : if it is virtual  destructor
    Base *BD = new Derived();
    delete BD;
    return 0;
    // Constrctor of Base calss
    // Constrctor of Derived calss
    // Destructor of Derived calss
    // Destructor of Base calss
}

