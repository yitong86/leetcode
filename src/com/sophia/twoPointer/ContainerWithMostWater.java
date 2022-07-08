package com.sophia.twoPointer;

import java.util.Queue;

//11
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//        Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//        Return the maximum amount of water a container can store.
//
//        Notice that you may not slant the container.
//        Input: height = [1,8,6,2,5,4,8,3,7]
//        Output: 49
//        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
//        In this case, the max area of water (blue section) the container can contain is 49.
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(array));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left < right){
            int currMin = Math.min(height[left],height[right]);
            //max = Math.max(max,currMin * (right - left));
            int currArea = currMin * (right - left);
            if(currArea > max){
                max = currArea;
            }
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }

        }
            return max;
    }
}


