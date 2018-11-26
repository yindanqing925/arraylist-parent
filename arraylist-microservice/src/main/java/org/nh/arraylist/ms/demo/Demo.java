package org.nh.arraylist.ms.demo;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello World.");
        System.out.println(CollectionUtils.isNotEmpty(null));
        System.out.println(StringUtils.isNotEmpty(null));
    }
}
