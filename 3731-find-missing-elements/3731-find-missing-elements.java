class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer>ls=new ArrayList<>();
        for (int i = 1, prevNum = nums[0]; i < nums.length; i++) {
            while (nums[i] != prevNum + 1) {
                ls.add(++prevNum);
            }
            prevNum = nums[i];
        }

        return ls;

    }
}