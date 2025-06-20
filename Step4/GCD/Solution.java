class Solution {
    public int GCD(int n1, int n2) {
        for(int i = n1; i>=1; --i){
            for(int j = n2; j>=1; --j){
                if(n1%i == 0 && n2%j == 0){
                    if(i == j){
                        return i;
                    }
                    else{
                        continue;
                    }
                }
                else{
                    continue;
                }
            }
        }
        return 1;
    }
}
