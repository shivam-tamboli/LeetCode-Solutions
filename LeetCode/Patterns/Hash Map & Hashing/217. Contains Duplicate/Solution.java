class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> memory = new HashSet<>();

        for(int num : nums){
            if(memory.contains(num)){
                return true;
            }

            memory.add(num);
        }       
        return false;
    }
}