class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }

        for(char ch : map1.keySet()){
            if(!map1.get(ch).equals(map2.getOrDefault(ch, 0))){
                return false;
            }
        }

        for(char ch : map2.keySet()){
            if(!map2.get(ch).equals(map1.getOrDefault(ch, 0))){
                return false;
            }
        }

        return true;
    }
}