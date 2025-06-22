class Solution {
    public boolean isPalindrome(String s) {
        String name = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
      // removing all characters except A-Z, a-z, 0-9
         int startIndex = 0;
        int lastIndex = name.length()-1;
        if(name.equals("")){
            return true;
        }
        while(startIndex < lastIndex){
            if(name.charAt(startIndex) != name.charAt(lastIndex)){
                return false;
            }
                ++startIndex;
                --lastIndex;
        }
        return true;
    }
}
