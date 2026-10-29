class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> ls1=new ArrayList<>();
         List<Integer> ls2=new ArrayList<>();
         List<Integer> lsn=new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ls1.add(nums[i]);
            
            }else if(nums[i]>pivot){
                ls2.add(nums[i]);
            }else if(nums[i]==pivot){
                lsn.add(nums[i]);
            }
         }
         List<Integer> ls3= new ArrayList<>(ls1);
         ls3.addAll(lsn);
         ls3.addAll(ls2);
         int[] ans = new int[ls3.size()];
for (int i = 0; i < ls3.size(); i++) {
    ans[i] = ls3.get(i); 
}   
return ans;
    }
}