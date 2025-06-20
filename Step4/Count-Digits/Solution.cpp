#include <iostream>
using namespace std;
int countDigit(int n){
    int num = n;
    int count = 0;
    while(num>0){
        ++count;
        num = num/10;
    }
    return count;
}
int main() {
    int output = countDigit(5289);
    cout<<output;
    return 0;
}
