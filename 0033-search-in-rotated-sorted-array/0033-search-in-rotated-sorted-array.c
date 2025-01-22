int search(int* nums, int numsSize, int target) {
    int low=0;
    int high=numsSize-1;
    int mid=low+(high-low)/2;
    while(low <= high){
        if(target==nums[mid]){
            return mid;
        }
        else if(nums[low]<=nums[mid]){
            if(target>=nums[low]&&target<=nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
                }
        }
        else 
        {
            if(target>=nums[mid]&&target<=nums[high]){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    mid=low+(high-low)/2;
    }
    return -1;
}