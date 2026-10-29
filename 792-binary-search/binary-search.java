class Solution {
    public int search(int[] nums, int target) {
        int first=0;
        int end=nums.length-1;
        while(end>=first){
            int mid=first+(end-first)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                first= mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
}