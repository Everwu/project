package src;
import java.util.HashMap;
import java.util.Map;

public class LC0001 {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            Map<Integer, Integer> map = new HashMap<>();
            //Map: we use general class interface to declare the valuable and use the concrete class to instantiate
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if (map.containsKey(diff)) {
                    return new int[]{map.get(diff), i};
                } else {
                    map.put(nums[i], i);
                }
            }
            return res;
        }
}
