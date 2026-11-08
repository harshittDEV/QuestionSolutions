class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans=new int[nums.length];
        int zeros=0;
        for(int num:nums){
            if(num%2==0){
                zeros++;
            }
        }
        for(int i=zeros;i<nums.length;i++){
            ans[i]=1;
        }
        return ans;
    }
}