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
    Test & operator = (const Test &temp)
    {
        if(this != &temp)
        {
            *(this->ptr) = *(temp.ptr);
        }
        return *this;
    }

};
int main()
{
    Test t(0), x(0);
    t = x; 
    // to handle this case we have overload the operator
    t.set(12);
    x.print(); // 0

    return 0;
}