#include <iostream>
using namespace std;
int reverseNumber(int n) {
        int original = n;
        int reversed = 0;
        while(original > 0){
            reversed = reversed*10 +(original%10); 
            original /= 10; 
        }
        return reversed;
    }
int main() {
    int result = reverseNumber(10400);
    cout<<result;

    return 0;
}
