public class leetcode_1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            Map <Integer, Integer> map = new HashMap<>();
            //Map: we use general class interface to declare the valuable and use the concrete class to instantiate
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if(map.containsKey(diff)) {
                    return new int[] {map.get(diff), i};
                } else {
                    map.put(nums[i], i);
                }
            }
            return res;
        }
    }
}

/*
Hashmap的应用
hashmap是一个<key value> pair
map.containsKey();
{<2,0>, <7,1>, <11,2>, <15,3>}


            2      7      11     15      9
diff        7      2
hashmap  <2,0>    <7,1>
return   <0,1>

1. Create a HashMap "map" to keep track of element and index
2. Iterate throught the indices of input array "nums", denoted as "i"
     if " map " contains "target - nums[i]"
					return {i, map.get(target - nums[i])}
     else put "nums[i] and "i" into "map"
*/
