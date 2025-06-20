/* SAMPLE PATTERN
***
***
***
*/

#include <iostream>
using namespace std;
void nForest(int n) {
	for(int i = 0; i<n; ++i){
		for(int j = n-1; j>=0; --j){
			cout<<"* ";
		}
		cout<<endl;
	}
}

int main()
{
    nForest(3);
}
