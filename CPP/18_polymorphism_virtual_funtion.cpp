#include <bits/stdc++.h>
using namespace std;
#define ll long long
// HII
// this is dsqure
class Car
{
public:
    virtual void Start() { cout << "Car started \n"; };
    virtual void Stop() { cout << "Car stopped\n"; }
    ~Car() {}
};
class Innova : public Car
{
public:
    void Start() { cout << "Innova started \n"; };
    void Stop() { cout << "Innova stopped\n"; }
    ~Innova() {}
};
class Swift : public Car
{
public:
    void Start() { cout << "Swift started \n"; };
    void Stop() { cout << "Swift stopped\n"; }
    ~Swift() {}
};
int main()
{
    Car *c;
    c = new Innova();
    c->Start();
    c->Stop();
    c = new Swift();
    c->Start();
    c->Stop();

    return 0;
}
Innova started 
Innova stopped
Swift started
Swift stopped