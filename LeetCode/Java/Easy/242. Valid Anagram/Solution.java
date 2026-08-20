class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> maps = new HashMap<>();

        HashMap<Character, Integer> mapt = new HashMap<>();

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        for(int i = 0; i < ss.length; i++){
            maps.put(ss[i], maps.getOrDefault(ss[i], 0) + 1);
        }

        for(int i = 0; i < tt.length; i++){
            mapt.put(tt[i], mapt.getOrDefault(tt[i], 0) + 1);
        }

        if(maps.equals(mapt)){
            return true;
        }

        return false;
        
    }
}