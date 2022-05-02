/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        int arrayIndex = 0;
        for (int index = start; index < end; index++) {
            if (index % 15 == 0) {
                result[arrayIndex] = "FizzBuzz";
            } else if (index % 5 == 0) {
                result[arrayIndex] = "Buzz";
            } else if (index % 3 == 0) {
                result[arrayIndex] = "Fizz";

            } else {
                result[arrayIndex] = String.valueOf(index);
            }
            arrayIndex++;
        }
        return result;
    }
}
