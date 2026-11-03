class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder b1=new StringBuilder();
        for(String ele : word1){
            b1.append(ele);
        }
        StringBuilder b2=new StringBuilder();
        for(String ele : word2){
            b2.append(ele);
        }
        String s1=b1.toString();
        String s2=b2.toString();
        return s1.equals(s2);
    }
}