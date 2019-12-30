package com.edu.leetcode;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class Solution {

    public static void main(String[] args) {
        /*int[] nums = {2,5,5,11} ;
        int target = 10;
        Solution solution = new Solution();
        int[] ints = solution.twoSum3(nums, target);
        System.out.println(ints);*/

        Calendar instance = Calendar.getInstance();
        String date = String.valueOf(instance.get(Calendar.YEAR));
        int month = instance.get(Calendar.MONTH) + 1;//获取月份
        String tableName = "sys_log_" + date+month;
        System.out.println(tableName);


    }

    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=1;j<nums.length;j++){
               boolean flag =  (nums[i] + nums[j]) == target;
                if (flag && i!=j){
                    int [] result =new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    /**
     * 暴力解法，代码较优
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }



    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }



}
