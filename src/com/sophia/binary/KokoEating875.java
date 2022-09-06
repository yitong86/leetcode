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
            if(canEatAll(piles,h,mid)){
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

