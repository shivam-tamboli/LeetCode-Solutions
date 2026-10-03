public void moveZeroes(int[] nums) {
    int[] result = new int[nums.length]; // Java fills with 0 by default
    int index = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            result[index] = nums[i];
            index++;
        }
    }

    for (int i = 0; i < nums.length; i++) {
        nums[i] = result[i]; // copy back into nums
    }
}
