package com.he.testdanli.single;

public class Single1 {

    private Single1() {
    }

    private static class Single1Inner {
        private static final Single1 SINGLE_1 = new Single1();
    }

    public static Single1 getInstance() {
        return Single1Inner.SINGLE_1;
    }
}
