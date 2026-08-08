class Solution {
    public int minimumPushes(String word) {
        int ans=0;
        for(int i=0;i<=word.length()-1;i++){
            ans=ans+(i/8)+1;
        }
        return ans;
    }
}