package org.test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author jianghm
 * @date 2015/4/15
 */
public class BaseTest {

    public static void main(String[] args) {
        boolean abc = Boolean.valueOf("true");
        boolean abd = true;

        System.out.println(abc);
        System.out.println(abd);
        System.out.println(Boolean.getBoolean("true"));
        System.out.println(Boolean.TYPE);
        System.out.println(Package.getPackage("org.test"));

    }
}
