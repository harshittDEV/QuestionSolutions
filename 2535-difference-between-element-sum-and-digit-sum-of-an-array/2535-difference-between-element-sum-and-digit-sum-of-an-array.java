class Solution {
    public int differenceOfSum(int[] nums) {
        int el=0;
        int dig=0;
        for(int i=0;i<nums.length;i++){
            el+=nums[i];
            dig+=sumOfDigits(nums[i]);

        }
        return Math.abs(el-dig);
    }
 public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); 
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}