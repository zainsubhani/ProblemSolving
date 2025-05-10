package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class IntersactionTwoArrayII {

        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums1) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            List<Integer> resultList = new ArrayList<>();
            for (int num : nums2) {
                if (map.containsKey(num) && map.get(num) > 0) {
                    resultList.add(num);
                    map.put(num, map.get(num) - 1);
                }
            }

            // Convert resultList to array
            int[] result = new int[resultList.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = resultList.get(i);
            }
            return result;
        }


    public static void main(String[] args) {
        IntersactionTwoArrayII obj = new IntersactionTwoArrayII();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = obj.intersect(nums1, nums2);
        for (int j : result) {
            System.out.print(j + " ");
        }

    }
}
