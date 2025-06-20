#include <iostream>
using namespace std;

/* SAMPLE PATTERN
* * * * *
* * * *
* * *
* *
*
*/

void seeding(int n){
        for(int i = n; i>=1; --i){
            for(int j = i; j>=1; --j){
               cout<<"* ";
            }
            cout<<endl;
        }
    }
int main()
{
    seeding(5);

    return 0;
}
