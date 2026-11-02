class Solution {
    public int countOdds(int low, int high) {
        int n=(high-low+1);
        int odds=0;
        if(n%2==0){
            odds=n/2;
        }else if(n%2!=0){
            if(low%2!=0 || high%2!=0){
                odds=(n/2)+1;
            }else{
                odds=n/2;

            }
        }
        return odds;
    }
}