#include <iostream>
using namespace std;
void nTriangle(int n) {
	for(int i = 1; i<=n; ++i){
	    for(int j = 1; j<=i; ++j){
	        cout<<j;
	    }
	    for(int k = 1; k<=(n-i); ++k){
	        cout<<" ";
	    }
	    for(int k = (n-i); k>=1; --k){
	        cout<<" ";
	    }
	    for(int j = i; j>=1; --j){
	        cout<<j;
	    }
	    cout<<endl;
	}
}
int main()
{
    nTriangle(5);

    return 0;
}
