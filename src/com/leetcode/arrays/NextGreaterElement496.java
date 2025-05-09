package com.leetcode.arrays;

import java.util.*;

public class NextGreaterElement496 {
    // https://leetcode.com/problems/next-greater-element-i/?envType=problem-list-v2&envId=array

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> num2Map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            num2Map.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (num2Map.containsKey(nums1[i])) {
                int j = num2Map.get(nums1[i]) + 1;
                if (j == nums2.length) {
                    result.add(-1);
                } else {

                    if (nums2[j] > nums1[i]) {
                        result.add(nums2[j]);

                    } else {
                        result.add(-1);
                    }

                }


            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }

    public int[] nextGreaterElementOptimized(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        // Step 1 Build next greater element for num2
        for(int num:nums2)
        {
            while(!stack.isEmpty() && stack.peek()<num)
            {
                map.put(stack.pop(),num);
            }
            stack.push(num);

        }
        while(! stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
        int [] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            result[i] = map.get(nums1[i]);
        }
        return result;

    }
    public static void main(String[] args) {
        NextGreaterElement496 obj = new NextGreaterElement496();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(obj.nextGreaterElementOptimized(nums1, nums2)));
    }

}


