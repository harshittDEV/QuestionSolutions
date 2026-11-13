class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                sum+=Math.abs(s.charAt(i)-s.charAt(j));
                break;
            }
        }
        return sum;
    }
}