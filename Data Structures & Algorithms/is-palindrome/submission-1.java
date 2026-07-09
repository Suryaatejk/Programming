class Solution {
    public boolean isPalindrome(String s) {
        boolean poss=true;
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int left=0;
        int right=s.length()-1;
        while(left<right) {
            if(s.charAt(left)!=s.charAt(right)) {
                poss=false;
                break;
            }
            left++;
            right--;
        }
        return poss;
    }
}
