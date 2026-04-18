class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            char [] ch = s.toCharArray();

            for(char c: ch){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            //Arrays.sort(ch);
            //String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }

        return new ArrayList(map.values());

    }
}
