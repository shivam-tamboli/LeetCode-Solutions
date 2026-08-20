class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> map1 = new HashSet<>();

        HashSet<Integer> map2 = new HashSet<>();

        HashSet<Integer> result = new HashSet<>();

        

        for(int num : nums1){
            map1.add(num);
        }

        for(int  num : nums2){
            map2.add(num);
        }

        for(int num : nums1){
            if(map2.contains(num)){
                result.add(num);
            }
        }

       int[] ft = new int[result.size()];

       int index = 0;
       for(int num : result){
        ft[index] = num;
        index++;
       }

       return ft;

    }    

}
    
        
    
