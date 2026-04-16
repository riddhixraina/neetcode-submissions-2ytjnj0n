class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        //hashmap - each letter and its frequency should be tracked
        if(s.length() != t.length()){
            return false;
        }
        Arrays.sort(sa);
        Arrays.sort(ta);
        return Arrays.equals(sa, ta);
        // int count = 0;
        // Map<Character, Integer> mapS = new HashMap<>();
        // Map<Character, Integer> mapT = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //     if(mapS.containsKey(s.charAt(i))){
        //       count = mapS.get(s.charAt(i)) + 1;
        //     }
        //     else{
        //         count = 1;
        //     }
        //     mapS.put(s.charAt(i), count);
        // }
        // for(int i=0; i<t.length(); i++){
        //     if(mapT.containsKey(t.charAt(i))){
        //         count = mapT.get(t.charAt(i)) + 1;
        //     }
        //     else{
        //         count = 1;
        //     }
        //     mapT.put(t.charAt(i), count);
        // }
        // if(mapS.equals(mapT)){
        //     return true;
        // }
        // return false;
    }
}
