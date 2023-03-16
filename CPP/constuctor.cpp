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
    
    return 0;
}