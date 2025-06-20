class Solution {
public:
    bool isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while(original > 0){
            reversed = reversed*10 +(original%10); 
            original /= 10; 
        }
        return (n == reversed)? true : false;
    }
};
