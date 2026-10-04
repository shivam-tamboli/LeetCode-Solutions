class Solution {
    public int removeElement(int[] nums, int val) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                result[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }

        return index;
    }
}
