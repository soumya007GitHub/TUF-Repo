#include <iostream>
using namespace std;
void pattern(int n){
        int letter = 65;
    for(int i = 1; i<=n; ++i){
        for(int j = 0; j<i; ++j){
           cout<<(char(letter));
        }
        ++letter;
        cout<<endl;
    }
}
int main()
{
    pattern(5);

    return 0;
}
