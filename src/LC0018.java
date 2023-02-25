package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) return res;
        if (target == -294967296 || target == 294967296) return res;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 4; i++) {
            if (i > 0 && nums[i] == nums[i + 1]) continue;
            for (int j = i + 1; j < nums.length - 3; j++) {
                if (j > i + 1 && nums[j] == nums[j + 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left + 1 < right && nums[left] == nums[left + 1]) left++;
                        while (right - 1 < left && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;

                    }
                }
            }
        }
        return res;
    }
}
