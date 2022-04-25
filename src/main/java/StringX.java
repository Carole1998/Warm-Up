/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.util.Arrays;

public class StringX {
    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x' || i == 0 || i == str.length() - 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public int stringMatch(String a, String b) {
        int length = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < length - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }
        return count;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        int arrayIndex = 0;
        for (int index = start; index < end; index++) {
            if (index % 3 ==0) {
                result[arrayIndex] = "Fizz";
            } else if (index % 5 ==0) {
                result[arrayIndex] = "Buzz";
            } else if (index % 15 ==0) {
                result[arrayIndex] = "FizzBuzz";
            } else {
                result[arrayIndex] = String.valueOf(index);
            }
            arrayIndex++;
        }
        return result;
    }
}