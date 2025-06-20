class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        long reversed = 0;
        while(original > 0){
            reversed = reversed*10 +(original%10); 
            original /= 10; 
        }
        return (x == reversed)? true : false;
    }
}
