class Solution {
    public int[] minOperations(String boxes) {
        char[] box=boxes.toCharArray();
        int[] ans=new int[box.length];
        for(int i=0;i<box.length;i++){
            int sum=0;
            for(int j=0;j<box.length;j++){
                if(box[j]=='1'){
                    sum=sum + Math.abs(j-i);
                    

                }
                
            }
            ans[i]=sum;
        }
        return ans;
    }
}