#include <iostream>
using namespace std;
void triangle(int n){
    for(int i = 1; i<=n; ++i){
        for(int j = 1; j<=i; ++j){
            cout<<i<<" ";
        }
        cout<<endl;
    }
}
int main()
{
    triangle(5);

    return 0;
}
