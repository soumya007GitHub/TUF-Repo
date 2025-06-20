#include <iostream>
using namespace std;
void pattern(int n){
    for(int i = 1; i<=n; ++i){
        for(int j = 65; j<(65+i); ++j){
            cout<<char(j);
        }
        cout<<endl;
    }
}
int main()
{
    pattern(3);

    return 0;
}
