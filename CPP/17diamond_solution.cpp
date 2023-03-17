#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure
class grandparent
{
public:
    grandparent() { cout << "grandparent class(-)\n"; }
    grandparent(int x) { cout << "grandparent class(int)\n"; }
    grandparent(int x, int y) { cout << "grandparent class(int, int)\n"; }
};
class father : virtual public grandparent
{
public:
    father(int x, int y) : grandparent(x, y) { cout << "father class\n"; }
};
class mother : virtual public grandparent
{
public:
    mother(int x) : grandparent(x) { cout << "mother class\n"; }
};
class son : public father, public mother
{
public:
    son(int x,int y) : father(x, y), mother(x)
    {
        cout << "son class\n";
    }
};
int main()
{
    son s(12,21);
    return 0;
}
// grandparent class(-)
// father class
// mother class
// son class