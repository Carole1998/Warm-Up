/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

public class TenRun {
    public int[] tenRun(int[] nums) {
        int[] result = new int[nums.length];
        boolean found = false;
        int currValue = 0;
        for (int num = 0; num < nums.length; num++) {
            if (nums[num] % 10 == 0) {
                found = true;
                currValue = nums[num];
            } else {
                if (!found) {
                    result[num] = nums[num];
                    continue;
                }
            }
            result[num] = currValue;
        }
        return result;
    }
}
