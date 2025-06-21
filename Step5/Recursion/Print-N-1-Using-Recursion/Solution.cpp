#include <iostream>
using namespace std;
void run(int n){
    if(n == 0){return;}
        cout<<n<<endl;
        run(--n);
}
int main()
{
    run(10);

    return 0;
}
