package com.sophia.twoPointer;

import java.util.Collections;

public class ReverseOnlyLetters917 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
    }



//
//    Given a string s, reverse the string according to the following rules:
//
//    All the characters that are not English letters remain in the same position.
//    All the English letters (lowercase or uppercase) should be reversed.
//    Return s after reversing it.
//
//
//
//            Example 1:
//
//    Input: s = "ab-cd"
//    Output: "dc-ba"
    //swap
    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }
            //ArrayList<String> arr = new ArrayList<String>();
            //Collections.swap(arr,left,right)
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
