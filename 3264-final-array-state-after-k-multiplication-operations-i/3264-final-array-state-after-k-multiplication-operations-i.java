class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
       
       
        for(int i=0;i<k;i++){
            int x=0;
             int min=nums[0];
            for(int j=0;j<nums.length;j++){

            if(nums[j]<min){
                 x=j;
                min=nums[j];
                break;
            }
            }
            nums[x]=min*multiplier;



        }
        return nums;
        

        }
        
    }
