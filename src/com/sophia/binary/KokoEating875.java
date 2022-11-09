package com.sophia.binary;

public class KokoEating875 {
    public int minEatingSpeed(int[]piles, int H){
        int l = 0;
        int r = 0;
        for(int p : piles){
            r = Math.max(r,p);
            
        }
        while (l < r){
            int mid =  l +(r-l)/2;
            if(canEatAll(piles,H,mid)){
                r= mid;
            }else{
                l = mid +1;
            }
        }
        return l;
    }
    private boolean canEatAll(int[] piles,int H,int speed) {
        long h = 0;
        for (int pile : piles) {
            h += (long) Math.ceil(pile * 1.0 / speed);
        }
        return h <= H;
    }
    }

//class Solution {
//    public int minEatingSpeed(int[] piles, int h) {
//        int left = 1;
//        int right = max(piles);
//        while(left+1<right){
//            int mid = left +(right-left)/2;
//            if(isValid(mid,piles,h)){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        if(isValid(left,piles,h)){
//            return left;
//        }
//        return right;
//    }
//    private boolean isValid(int k ,int[]piles,int h){
//        int hNeeded = 0;
//        for(int p:piles){
//            hNeeded += p/k + (p % k == 0 ?0:1);
//        }
//        return hNeeded <=h;
//    }
//    private int max(int[] arr){
//        int ans = Integer.MIN_VALUE;
//        for(int a : arr){
//            ans = Math.max(a,ans);
//
//        }
//        return ans;
//    }
//}