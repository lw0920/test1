package demo01;

import java.util.logging.Logger;

/**
 * @description:
 * @author: luw
 * @time: 2020/3/19 0:11
 */

public class ReturnFinallyDemo {

    public static void main(String[] args) {
        //开发了心得功能git
        //dev
        //kaifale xinde gongneng
        int i = returnDemo();
        System.out.println(i);
    }

    public static int returnDemo() {
        int a;
        try {
            a = 10;

        } catch (Exception e) {
            a = 20;

        }finally {
            int b = 1 / 0;
            a=30;

        }
        return a;
    }
}
