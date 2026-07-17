class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char c: s.toCharArray()){
           int count=1;
            if(map1.containsKey(c)){
                count++;
                 map1.put(c,count);
            }
            else{
                map1.put(c,count);
            }
        }
        for(char c: t.toCharArray()){
           int count=1;
            if(map2.containsKey(c)){
                count++;
                map2.put(c,count);
            }
            else{
                map2.put(c,count);
            }
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
}
