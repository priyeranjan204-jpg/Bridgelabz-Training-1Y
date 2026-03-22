package com.gla.Abstraction;

interface Sec {

    static boolean check(String p) {
        return p.length() >= 8;
    }
}
