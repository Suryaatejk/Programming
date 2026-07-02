class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean poss=false;
        Set<Integer> set=new HashSet<>();
        for(int i:nums) {
            if(set.contains(i)) {
                poss=true;
                break;
            }
            set.add(i);
        }
        return poss;
    }
}