class Solution {
    public int arraySign(int[] nums) {
        long pro=1;
        for(int i=0;i<nums.length;i++)
        {
            pro*=nums[i];
        }
        if(pro==0)
        {
            return 0;
        }
        else if(pro<1)
        {
            return -1;
        }
        else
        {
            return 1;
        }
        
    }
}