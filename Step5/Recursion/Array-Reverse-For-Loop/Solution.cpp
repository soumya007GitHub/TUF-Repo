#include <iostream>
using namespace std;
void reversedArray(int array[], int size){
       for(int i = 0; i<size/2; ++i){
            array[i] = array[i]+array[size-(i+1)];
            array[size-(i+1)] = array[i] - array[size-(i+1)];
            array[i] = array[i] - array[size-(i+1)];
        }
    }
    int main(){
       int array[] = {2, 3, 4, 5, 3};
       int size = sizeof(array)/sizeof(array[0]);
	   reversedArray(array, size);
		for(int i:array){
		    cout<<i<<endl;
		}
		return 0;
    }
