// SAMPLE OUTPUT
// *
// **
// ***
// **
// *
#include <iostream>
using namespace std;

void triangle(int n) {
        for(int i = 0;i<n; ++i){
            for(int j = 0; j<=i; ++j){
                cout<<"* ";
            }
            cout<<endl;
        }
    }
void reversedTriangle(int n){
        for(int i = n-1; i>=1; --i){
            for(int j = i; j>=1; --j){
               cout<<"* ";
            }
            cout<<endl;
        }
    }
int main()
{
    triangle(3);
    reversedTriangle(3);
    return 0;
}
