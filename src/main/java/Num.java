import org.apache.commons.lang3.StringUtils;

import static java.lang.String.valueOf;

public class Num {
    public String print(int input) {
        String o = "";
        if (input % 3 == 0) {
            o += "Fizz";
        }
        if (input % 5 == 0) {
            o += "Buzz";
        }
        if (StringUtils.isBlank(o)) {
            return valueOf(input);
        }
        return o;
    }
}
