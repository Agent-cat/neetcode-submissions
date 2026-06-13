class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0){
            return new ArrayList<>();
        }
      Map<String,List<String>> map=new HashMap();
      for(String s : strs){
            
            char[] arr=s.toCharArray();
            Arrays.sort(arr);  // Sorting the array 
            String sorted=new String(arr);

            if(map.containsKey(sorted)){
                map.get(sorted).add(s);   // Check if the sorted string is in the map and add the sstr to list
            }else{
                List<String> list=new ArrayList<>();
                list.add(s);              // If not create the list and add the str to the list
                map.put(sorted,list);
            }
      }
        return new ArrayList<>(map.values());
    }
}

// TC: O(n*klogk)
// SC: O(n*k)
