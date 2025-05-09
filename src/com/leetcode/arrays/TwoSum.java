package com.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
    public static int[] twoSumOptimized(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        int [] resultOptimized = twoSumOptimized(nums, target);
        System.out.println(Arrays.toString(resultOptimized));
    }


}
