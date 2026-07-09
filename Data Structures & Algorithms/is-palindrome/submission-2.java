class Solution {
    public boolean isPalindrome(String s) {
        boolean poss=true;
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        StringBuilder sb=new StringBuilder(s);
        if(s.equals(sb.reverse().toString())) 
        return true;
        return false;
    }
}
