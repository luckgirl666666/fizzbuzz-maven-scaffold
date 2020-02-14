import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {
    @ParameterizedTest
    @CsvSource({"1,1",
    "3,Fizz",
    "5,Buzz",
    "15,FizzBuzz"})

    public void num_test(int input,String output) {
        assertEquals(new Num().print(input),output);
    }
}
