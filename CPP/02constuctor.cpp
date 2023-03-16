#include <bits/stdc++.h>
using namespace std;
#define ll long long
class Transportation
{
private:
    int no_wheel;
    int capacity;

public:
    Transportation()
    {
        no_wheel = 12;
        capacity = 12;
    }
    Transportation(const Transportation &temp)
    {
        cout << "User Defined COnstructor get callled >>>>> " << endl;
        this->capacity = temp.capacity;
        this->no_wheel = temp.no_wheel;
    }
};
int main()
{
    Transportation T;

    // 1 ) our copy constructor invoked .
    // Transportation X = T;
    // Transportation X(T);

    // 2 ) default copy constructor invoked .
    // Transportation X;
    // X = T;
    //  To handle this case
    // we have to make use of operator overloading

    //  → when we create &
    // copy in same line > then copy
    // constructor invoked , but assignment copy
    // constructor doesn't invoked
    
    return 0;
}