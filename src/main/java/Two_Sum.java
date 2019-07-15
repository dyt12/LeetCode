import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:  Given nums = [2, 7, 11, 15], target = 9,  Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].$
 *
 * @author dytwest$
 * @version %I%, %G%
 * @since 1.8
 */

class Solution{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i=0;i<nums.length;i++) {
            int a = target-nums[i];
            if(map.containsKey(a) && map.get(a) != i)
                return new int[] {i, map.get(a)};
        }
        throw  new IllegalArgumentException("No two sum solution");
    }
}

class Solution1{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(nums[0], 0);
        for(int i=1; i<nums.length; i++) {
            int a = target - nums[i];
            if(map.containsKey(a) && map.get(a) !=i)
                return new int[] {map.get(a), i};
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

public class Two_Sum {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] res = solution.twoSum(new int[] {2, 7, 11, 13}, 9);
        for (int i : res) {
            System.out.printf(i + " ");
        }
    }
}
