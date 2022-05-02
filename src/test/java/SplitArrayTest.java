/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SplitArrayTest {

    @Test
    public void test1() {
        SplitArray s = new SplitArray();
        assertTrue(s.splitArray(new int[]{2,2}));
        assertFalse(s.splitArray(new int[]{2,3}));
    }
}
