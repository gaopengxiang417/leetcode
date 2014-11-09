package com.gao;

/**
 * User: wangchen
 * Date: 14/11/9
 * Time: 13:19
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 The function twoSum should return indices of the two numbers such that they add up to the target,
 where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 You may assume that each input would have exactly one solution.
 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 */
public class TwoSum {
    public static void main(String[] args) {

        int[] arg = {3, 2, 4};
        int[] twoSum = twoSum(arg, 6);

        System.out.println(twoSum[0]);
        System.out.println(twoSum[1]);
    }

    /**
     * 计算出来最后的下标数组,最简单的循环
     * @param args
     * @param target
     * @return
     */
    public static int[] twoSum(int[] args, int target) {

        int[] result = new int[2];

        int i = 0;
        int j = i + 1;

        for (; i < j; i++) {
            if (i != 0)
                j = i + 1;
            for (; j < args.length; j++) {

                int first = args[i];
                int second = args[j];

                if ((first + second) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }


    /**
     * 快速的进行搜索，从两边进行搜索
     * @param args
     * @param target
     * @return
     */
    public static int[] twoSum_quick(int[] args, int target) {
        int[] result = new int[2];

        //首先应该排序
        return null;
    }
}
