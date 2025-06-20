#include <iostream>
using namespace std;
int countDigit(int n){
    int num = n;
    int count = 0;
    while(num%10 != 0){
        num = num/10;
        ++count;
    }
    return count;
}
int main() {
    int output = countDigit(5289);
    cout<<output;
    return 0;
}
