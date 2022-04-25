import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringXTest {
    StringX string = new StringX();

    @Test
    @DisplayName("Simple Test should work")
    public void test1() {
        assertEquals(string.stringX("xxHxix"), "xHix");
        assertEquals(string.stringX("abxxxcd"), "abcd");
        assertEquals(string.stringX("xabxxxcdx"), "xabcdx");
    }
    @Test
    @DisplayName("Edge cases")
    public void test2(){
        assertEquals(string.stringX(""),"");
        assertEquals(string.stringX("xx"),"xx");
        assertEquals(string.stringX("xxx"),"xx");
    }
}
