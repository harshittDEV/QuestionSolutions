class Solution {
    public int heightChecker(int[] heights) {
        int[] array=heights.clone();
        for(int i=0;i<array.length;i++){
        boolean swap=false;
        for(int j=1;j<array.length-i;j++){
            if(array[j]<array[j-1]){
            int temp=array[j];
            array[j]=array[j-1];
            array[j-1]=temp;
            swap=true;
            }
        }
        if(swap==false){
            break;
        }
    }
        
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(array[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
