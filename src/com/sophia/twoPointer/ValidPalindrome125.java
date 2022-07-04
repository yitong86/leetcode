package com.sophia.twoPointer;
//125. Valid Palindrome
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//        Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//        Example 1:
//
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome(String s) {
        //corner case
        if(s.isEmpty()){
            return true;
        }
        //two pointer,left++,right--
        int left = 0;
        int right = s.length()-1;
        while(left <= right){
            while( left <= right && Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while( left <= right && Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (left <= right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {

                return false;
            }
            //if left == right.continue while loop
            left++;
            right--;
        }
        return  true;

    }
}