class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int product = nums[i] * nums[j];
                result += mp.getOrDefault(product, 0) * 8;
                mp.put(nums[i]*nums[j],mp.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        return result;
    }
}