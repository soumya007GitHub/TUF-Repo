#include <iostream>
using namespace std;
void run(int counter, int n){
    if(counter > n) {return;}
        cout<<counter<<endl;
        run(++counter, n);
}
int main()
{
    run(1, 10);

    return 0;
}
