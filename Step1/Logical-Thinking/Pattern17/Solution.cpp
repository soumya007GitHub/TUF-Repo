/* SAMPLE PATTERN
  A
  ABA
  ABCBA
  ABCDCBA
  /*
#include <iostream>
using namespace std;
void pattern(int n){
    int letter = 65;
    for(int i = 1; i<=n; ++i){
        for(int k = 1; k<=(n-i); ++k){
            cout<<" ";
        }
        for(int j = 65; j<65+i; ++j){
           cout<<(char(j));
           ++letter;
        }
        for(int l = letter-2; l>=65; --l){
            if(i == 1) continue;
            else{
                cout<<char(l);
            }
        }
        letter = 65;
        cout<<endl;
    }
}
int main()
{
    pattern(5);

    return 0;
}
