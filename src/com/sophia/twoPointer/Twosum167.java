package com.sophia.twoPointer;

import java.util.Arrays;

//Input: numbers = [2,7,11,15], target = 9
//        Output: [1,2]
//        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
public class Twosum167 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr)));
    }

        public static int[] twoSum(int[] numbers) {
        int target = 9;
            int left = 0;
            int right = numbers.length-1;
            int[] array = new int[2];
            while(left <= right){
                if(numbers[left] + numbers[right] > target){
                    right--;
                }else if(numbers[left] + numbers[right] < target){
                    left++;
                }else{
                    array = new int[]{left+1,right+1};
                    return array;


                }
            }
            return array;
        }
    }


