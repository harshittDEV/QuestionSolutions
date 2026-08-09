class Solution {
    public int firstUniqChar(String s) {
        char[] str=s.toCharArray();
        for (int i=0;i<str.length;i++){
            boolean ans=true;
            for(int j=0;j<str.length;j++){
                if(i!=j && str[i]==str[j]){
                    ans=false;
                    break;
                }
            }
            if(ans){
                return i;
            }
        }
        return -1;
    }
}