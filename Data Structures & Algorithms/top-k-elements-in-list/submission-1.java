class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0) return new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int index = 0;
        int[] result = new int[k];
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                count = 1;
                map.put(nums[i], count);
            }
            else{
                count = map.get(nums[i]) + 1;
                map.put(nums[i], count);
            }
        }

        while(index < k){
            int maxFreq = -1;
            int maxNum = 0;

         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxNum = entry.getKey();
            }
         }
         result[index] = maxNum;
         index++;
         map.remove(maxNum);
         }
        
        return result;
    }
}
