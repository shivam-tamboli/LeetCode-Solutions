class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> map1 = new HashSet<>();

        HashSet<Integer> map2 = new HashSet<>();

        for(int num : nums1){
            map1.add(num);
        }

        for(int  num : nums2){
            map2.add(num);
        }

        if(map1.contains(map2)){
            
        }
        
    }
}