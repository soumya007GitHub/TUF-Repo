#include <bits/stdc++.h>
using namespace std;
bool armstrong(int n){
    int num = n;
    int result = 0;
    int digits = (int)(log10(num)+1);
    while(num > 0){
        result = result + pow(num%10, digits);
        num /= 10;
    }
    if(result == n){
        return true;
    }
    else{
        return false;
    }
}
int main()
{
    int result = armstrong(1534);
    cout<<result;
    return 0;
}
