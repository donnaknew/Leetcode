package easy;

class Two_Sum_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                    break;
                }
            }
        }

        return resultArray;
    }
}