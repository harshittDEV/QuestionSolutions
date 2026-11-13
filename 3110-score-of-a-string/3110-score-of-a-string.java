class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                int a=(int)s.charAt(i);
                int b=(int)s.charAt(j);
                sum+=Math.abs(a-b);
                break;
            }
        }
        return sum;
    }
}