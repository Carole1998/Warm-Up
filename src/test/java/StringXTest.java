import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringXTest {

    StringX s = new StringX();

    @Test
    @DisplayName("Simple Test should work")
    public void test1() {
        assertEquals(s.stringX("xxHxix"), "xHix");
        assertEquals(s.stringX("abxxxcd"), "abcd");
        assertEquals(s.stringX("xabxxxcdx"), "xabcdx");
    }
    @Test
    @DisplayName("Edge cases")
    public void test2(){
        assertEquals(s.stringX(""),"");
        assertEquals(s.stringX("xx"),"xx");
        assertEquals(s.stringX("xxx"),"xx");
    }
}
