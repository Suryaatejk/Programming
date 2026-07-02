class Solution {
    public boolean isAnagram(String s, String t) {
        boolean poss=true;
        int freq[]=new int[26];
        for(char ch:s.toCharArray()) {
            freq[ch-'a']++;
        }
        for(char ch:t.toCharArray()) {
            freq[ch-'a']--;
        }
        for(int i=0;i<26;i++) {
            if(freq[i]!=0) {
                poss=false;
                break;
            }
        }
        return poss;
    }
}
