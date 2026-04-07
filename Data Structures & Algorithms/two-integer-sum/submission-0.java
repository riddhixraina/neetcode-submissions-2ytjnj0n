class Solution {
    public int[] twoSum(int[] nums, int target) {
        //3+4 = 7. 7-3 =4, 7-4 =3, 7-5 =2, 7-6=1
        //4+6=10. 10-4=6, 10-5=5, 10-6=4
        //complement = target - nums[i], and if this complement exists in the hashmap, 
        //then return the indices of those numbers.

        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}