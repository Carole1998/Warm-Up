/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.util.Arrays;

public class SplitArray {
    public boolean splitArray(int[] nums) {
        int sum1 = helper(Arrays.copyOfRange(nums, 0, 1));
        int sum2 = helper(Arrays.copyOfRange(nums, 1, nums.length));
        return sum1 == sum2;
    }

    public int helper(int[] nums1) {
        if (nums1.length == 0) {
            return 0;
        }
        int index = 1;

        int result = nums1[0];
        if (index != nums1.length) {
            result = helper(Arrays.copyOfRange(nums1, 0, index));
        }
        index++;
        return result;
    }
}
