#include <iostream>
using namespace std;
void run(int counter, int n){
    if(counter > n) {return;}
        cout<<"Soumya"<<endl;
        run(++counter, n);
}
int main()
{
    run(1, 3);

    return 0;
}
