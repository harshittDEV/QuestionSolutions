class Solution {
    public int countElements(int[] nums) {
       Arrays.sort(nums);
       int ans=0;
       for(int i=1;i<nums.length-1;i++){
        if(nums[i] > nums[0] && nums[i] < nums[nums.length-1]){
        ans++;
        }
       }
       return ans;
    }
}