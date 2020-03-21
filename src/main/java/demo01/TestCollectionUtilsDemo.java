package demo01;


import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @description:
 * @author: luw
 * @time: 2020/3/14 8:54
 */

public class TestCollectionUtilsDemo {

    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        s1.add("1");
        s1.add("2");
        s2.add("5");
        s2.add("3");
        s2.add("4");
        test1(s1, s2);
    }

    //交集
    private static void test1(ArrayList<String> s1, ArrayList<String> s2) {
        //boolean b = CollectionUtils.containsAny(s1, s2);//true
        //boolean b = CollectionUtils.contains(s2.iterator(), s1.get(1));
        List list = CollectionUtils.arrayToList(s1.toArray());
        //boolean b = CollectionUtils.containsInstance(s1, s2.get(0));
        boolean b = CollectionUtils.hasUniqueObject(s1);
        String firstMatch = CollectionUtils.findFirstMatch(s1, s2);
        CollectionUtils.isEmpty(s1);
        Collection<String> strings = Collections.unmodifiableCollection(s1);
        System.out.printf("输出的结果为%s,或者%b", firstMatch, b);
    }
}
