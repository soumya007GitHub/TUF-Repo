/* SAMPLE PATTERN
     *
    ***
   ***** 
  *******
 *********
***********  
***********
 *********
  *******
   ***** 
    ***    
     *
  */

#include <iostream>
using namespace std;
void star(int n){
    for(int i = 0; i<n; ++i){
            for(int j = 0; j<(n-i-1); ++j){
                cout<<" ";
            }
            for(int k = 0; k<(2*i+1); ++k){
                cout<<"*";
            }
            cout<<endl;
        }
}
void reversedStar(int n){
    for(int i = n; i>0; --i){
            for(int j = 0; j<=(n-i-1); ++j){
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
    reversedStar(5);

    return 0;
}
