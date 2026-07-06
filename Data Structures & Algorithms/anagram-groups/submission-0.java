class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        List<List<String>> list=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String i:s) {
            char ch[]=i.toCharArray();
            Arrays.sort(ch);
            String snew=Arrays.toString(ch);
            if(!map.containsKey(snew)) {
                map.put(snew,new ArrayList<>());
            }
            List<String> li=map.get(snew);
            li.add(i);
        }
        for(List<String> li:map.values()) {
            list.add(li);
        }
        return list;
    }
}
