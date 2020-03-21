
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {
        String str1 = ",lisi,,w,";
        String[] split = str1.split(",");
        String join = StringUtils.join(CollectionUtils.arrayToList(split), ',');
        System.out.println(join);
        System.out.println(split.length);
        Arrays.stream(split).forEach(k -> System.out.println(k));
        System.out.println(split);
    }
}
