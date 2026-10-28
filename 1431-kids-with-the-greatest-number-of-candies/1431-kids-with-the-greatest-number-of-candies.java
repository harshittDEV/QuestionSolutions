class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls=new ArrayList<>();
        int maximum=max(candies);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maximum){
ls.add(true);
            }else{
                ls.add(false);
            }
        }
        return ls;
    }

    public int max(int[]cand){
        int max=cand[0];
        for(int i=0;i<cand.length;i++){
if(cand[i]>max){
    max=cand[i];
}
        }
        return max;
    }
}
