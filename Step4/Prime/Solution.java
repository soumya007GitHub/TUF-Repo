class Solution {
    public boolean isPrime(int n) {
          int count = 0;
          for(int i = 1; i<=n; ++i){
            if(n%i == 0){
                ++count;
            }
            else{
                continue;
            }
          }
          if(count>2){
            return false;
          }
          else{
            return true;
          }
    }
}
