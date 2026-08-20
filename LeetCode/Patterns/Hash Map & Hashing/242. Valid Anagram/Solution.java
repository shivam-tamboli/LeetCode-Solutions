class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        HashMap<Character, Integer> maps = new HashMap<>();

        char[] cc = s.toCharArray();
        char[] hh = t.toCharArray();

        for(char c : cc ){
            map.put(c , map.getOrDefault(c, 0) + 1);
        }

        for(char h : hh ){
            maps.put(h , maps.getOrDefault(h, 0) + 1);
        }
 
        if(maps.equals(map)){
            return true;
        }else{
            return false;
        }

        
    }
}