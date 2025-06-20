#include <iostream>
using namespace std;
void pattern(int n){
    int letter = 65+n-1;
    for(int i = 1; i<=n; ++i){
        for(int j = 1; j<=i; ++j){
            cout<<char(letter);
            ++letter;
        }
        cout<<endl;
        letter = letter - i-1;
    }
}
int main() {
    pattern(3);
