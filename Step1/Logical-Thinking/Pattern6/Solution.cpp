// SAMPLE PATTERN
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1

#include <iostream>
using namespace std;
void reverse(int n){
    for(int i = n; i>=1; --i){
        for(int j = 1; j<=i; ++j){
            cout<<j<<" ";
        }
        cout<<endl;
    }
}
int main()
{
    reverse(7);

    return 0;
}
