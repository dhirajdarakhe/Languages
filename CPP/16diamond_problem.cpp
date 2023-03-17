#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure
class grandparent
{
public:
    grandparent(int x) { cout << "grandparent class\n"; }
};
class father : public grandparent
{
public:
    father(int x) : grandparent(x) { cout << "father class\n"; }
};
class mother : public grandparent
{
public:
    mother(int x) : grandparent(x) { cout << "mother class\n"; }
};
class son : public father, public mother
{
public:
    son(int x) : father(x), mother(x)
    {
        cout << "son class\n";
    }
};
int main()
{
    son s(12);
    return 0;
}
// grandparent class
// father class
// grandparent class
// mother class
// son class