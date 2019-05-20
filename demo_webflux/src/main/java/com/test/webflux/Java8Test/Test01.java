package com.test.webflux.Java8Test;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("HELLO","WORLD","AAAA");
        list1.forEach(item-> System.out.println(item.toUpperCase()));

        List<String> list2 = new ArrayList<>();
        list2.forEach(item->list2.add(item.toUpperCase()));

        list2.forEach(item-> System.out.println(item.toUpperCase()));

        List<Map<String, String>> aa = new ArrayList<Map<String,String>>();
        Map<String, String> t1 = new HashMap<>();
        Map<String, String> t2 = new HashMap<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        t1.put("a","a1");
        t1.put("b","b1");
        t2.put("a","a2");
        t2.put("b","b2");
        aa.add(t1);
        aa.add(t2);
        //aa.stream().forEach(item-> {list3.add(item.get("a"));list2.add(item.get("b"));});
        //list3.forEach(item-> System.out.println(item));
        //list4.forEach(item-> System.out.println(item));
        aa.stream().map(item->item.get("a").toUpperCase()).forEach(item-> System.out.println(item));




    }
}





