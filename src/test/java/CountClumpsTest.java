/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CountClumpsTest {

    @Test
    public void test1() {
        CountClumps c = new CountClumps();
        assertTrue(c.countClumps(1, 2, 2, 3, 4, 4)==2);
        assertTrue(c.countClumps(1, 1, 2, 1, 1)==2);
        assertTrue(c.countClumps(1, 1, 1, 1, 1)==1);
    }
}
