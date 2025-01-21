class Solution {
    public int findNumbers(int[] nums) {
    int count=0;
    int c=0;
    int n=nums.length;
    for(int i=0;i<n;i++)
    {
        c=0;
        while(nums[i]!=0)
        {
            int d=nums[i]%10;
            c++;
            nums[i]=nums[i]/10;
        }
        if(c%2==0)
        {
            count++;
        }
    }
    return count;
        
    }
}