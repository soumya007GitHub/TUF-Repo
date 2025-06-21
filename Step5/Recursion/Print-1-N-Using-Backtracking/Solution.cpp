#include <iostream>
using namespace std;
void func(int i){
         if(i < 1){return;}
        func(i - 1);
        cout<<i<<endl;

    }
    int main(){
       func(4);
       return 0;
    }
