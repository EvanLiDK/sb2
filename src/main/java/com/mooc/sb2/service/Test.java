package com.mooc.sb2.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static int findKthLargest(int[] nums, int k) {
        Set<Integer> set =new HashSet();
        Arrays.sort(nums);

        for(int i=nums.length-1;i>-1;i--){
            set.add(nums[i]);
            if(set.size()==k){
                return nums[i];
            }
        }

        return 0;


    }

    public static void main(String[] args) {
        int[] nums={3,2,3,1,2,4,5,5,6,4};
        System.out.println(findKthLargest(nums,4));
    }
}
