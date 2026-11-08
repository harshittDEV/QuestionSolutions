class Solution {
    public int[] leftRightDifference(int[] nums) {
       int rightsum=0;
       int leftsum=0;
       int[] ans=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        rightsum=rightsum+nums[i];
       }
       for(int i=0;i<nums.length;i++){
        rightsum=rightsum-nums[i];
        ans[i]=Math.abs(leftsum-rightsum);
        leftsum=leftsum+nums[i];
       }

return ans;
    }
}