class Solution {
    public boolean hasDuplicate(int[] nums) {
        //store each number from the array in hashset, and if its already existing then return true
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(s.contains(nums[i])){
            return true;
            }
        s.add(nums[i]);
        }
        return false;
    }
}