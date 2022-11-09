package com.sophia.binary;

public class Search2DMatrix74 {

        public boolean searchMatrix(int[][] matrix, int target) {


//corner case
            if(matrix.length == 0 ||matrix == null){
                return false;
         }

         int m = matrix.length;//total row
         int n = matrix[0].length;//total col

         int left = 0;
         int right = m*n-1;//total number -1 ->index;

         while(left<=right){
         int mid = left + (right-left)/2;
         //key point
         int row = mid/n;//row index
         int col = mid % n;//col index
         if(matrix[row][col]==target){
            return true;
         }else if(matrix[row][col]<target){
        left = mid =1;
        }else if(matrix[row][col] > target){
        right = mid -1;
        }
        }
        return false;
        }
        }

//
//    int left = 0;
//    int right = matrix[0].length - 1;
//            while(left <= right){
//                    if(matrix[left][right] == target)
//                    return true;
//                    else if(matrix[left][right] > target)
//                    right--;
//                    else
//                    left++;
//                    }
//                    return false;
//                    }
//                    }