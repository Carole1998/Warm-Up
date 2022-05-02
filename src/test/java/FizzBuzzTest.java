import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {
    @Test
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertTrue (Arrays.toString(fizzBuzz.fizzBuzz(1,6)).equals("[1, 2, Fizz, 4, Buzz]"));
        assertTrue (Arrays.toString(fizzBuzz.fizzBuzz(1,8)).equals("[1, 2, Fizz, 4, Buzz, Fizz, 7]"));
        assertTrue(Arrays.toString(fizzBuzz.fizzBuzz(1,11)).equals("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz]"));
    }

}
