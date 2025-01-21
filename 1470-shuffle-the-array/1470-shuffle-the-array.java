class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1=new int[n];
        int[] arr2=new int[nums.length-n];
        int[] ans=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            arr1[i]=nums[i];
        }
        for(int i=n;i<nums.length;i++)
        {
            arr2[i-n]=nums[i];
        }
        int j=0;
        for(int i=0;i<nums.length;i+=2)
        {
            ans[i]=arr1[j];
            ans[i+1]=arr2[j];
            j++;

        }
        return ans;
        
    }
}