


package demo01;


import java.util.regex.Pattern;

public class StringFormatDemo {


    public static void main(String[] args) {
        String res = "aaaa";
        String format = String.format("% 9d", 99);
        System.out.printf("补位的结果为:%s", format);

        String ss = "1,2,3,4";
        String reg = "^\\d(,\\d)*$";
        Pattern pattern = Pattern.compile(reg);
        boolean matches = pattern.matcher(ss).matches();
        System.out.printf("%n匹配的结果为:%b", matches);

    }




}
