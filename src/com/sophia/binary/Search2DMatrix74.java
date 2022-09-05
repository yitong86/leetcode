package com.sophia.binary;

public class Search2DMatrix74 {

        public boolean searchMatrix(int[][] matrix, int target) {
            int left = 0, right = matrix[0].length - 1;
            while(left < matrix.length && right>= 0){
                if(matrix[left][right] == target)
                    return true;
                else if(matrix[left][right] > target)
                    right--;
                else
                    left++;
            }
            return false;
        }
    }

