class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] char_array=str.toCharArray();
            Arrays.sort(char_array);
            String sorted=new String(char_array);
            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }
            else{
                map.put(sorted,new ArrayList<String>());
                map.get(sorted).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
