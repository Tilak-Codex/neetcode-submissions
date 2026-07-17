class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                int index=Math.min(i,map.get(diff));
                int value=Math.max(i,map.get(diff));
                return new int[]{index,value};
            }
            map.put(nums[i],i);
        }
       return new int[]{};
    }
    }

