class Solution {
    public int maxDistinct(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int count=0;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]!=chars[i+1]){
                count++;
            }
        }
        return count+1;
    }
}