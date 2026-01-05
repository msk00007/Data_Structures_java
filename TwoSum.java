class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            int compliment = target-nums[i];
            if(mp.containsKey(Integer.valueOf(compliment))){
                result[0] = mp.get(Integer.valueOf(compliment));
                result[1]=i;
                return result;

            }
            else{
                mp.put(Integer.valueOf(nums[i]),Integer.valueOf(i));
            }
        }
        return result;
    }
}
