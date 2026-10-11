class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int array[]=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            array[k]=nums1[i];
            k++;
        
        }
        for(int j=0;j<n;j++){
            array[k]=nums2[j];
            k++;
        
        }
        Arrays.sort(array);
        for(int i=0;i<m+n;i++){
           nums1[i]=array[i];
         
        
        }
    }
}