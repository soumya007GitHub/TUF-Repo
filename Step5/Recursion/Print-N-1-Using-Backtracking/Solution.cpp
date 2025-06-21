#include <iostream>
using namespace std;
void func(int i, int num){
         if(i > num){return;}
        func(i+1, num);
        cout<<i<<endl;

    }
    int main(){
       func(1, 4);
       return 0;
    }
