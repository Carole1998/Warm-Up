import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class StringMatchTest {

    @Test
    public void test1() {
        StringX s = new StringX();
        assertEquals(s.stringMatch("aa", "bb"), 0);
        assertEquals(s.stringMatch("xxcaazz", "xxbaaz"), 3);
        assertEquals(s.stringMatch("abc", "abc"), 2);
        assertEquals(s.stringMatch("abc", "axc"), 0);
    }
}
