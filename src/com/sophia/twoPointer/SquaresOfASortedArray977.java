package com.sophia.twoPointer;

import java.util.Arrays;

//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//
//
//        Example 1:
//
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//        Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].
public class SquaresOfASortedArray977 {
    public static void main(String[] args) {
        int[] array = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(array)));
    }


        public static int[] sortedSquares(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int[] result = new int[nums.length];
            int pointer = nums.length - 1;

            while (left < right) {
                if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                    result[pointer] = nums[left] * nums[left];
                    left++;
                } else {
                    result[pointer] = nums[right] * nums[right];
                    right--;
                }
                pointer--;
            }
            return result;
        }

    }







