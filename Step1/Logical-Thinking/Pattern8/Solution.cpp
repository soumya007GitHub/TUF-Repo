/* SAMPLE PATTERN
*****
 ***
  *
  */
#include <iostream>
using namespace std;
void star(int n){
    for(int i = n; i>0; --i){
            for(int j = 0; j<=(n-i); ++j){
                cout<<" ";
            }
            for(int k = 0; k<(2*i-1); ++k){
                cout<<"*";
            }
            cout<<endl;
        }
}
int main()
{
    star(5);

    return 0;
}
