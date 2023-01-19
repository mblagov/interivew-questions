package com.mblagov.interview;

import java.util.Collection;
import java.util.Set;

public class InterfacesAndExceptions {

    class Exception1 extends Exception {
    }

    class Exception2 extends Exception {
    }

    interface I1 {
        public Set foo() throws Exception1;
    }

    interface I2 {
        public Collection foo() throws Exception2;
    }

    /* class A implements I1, I2 {

        @Override
        public ??? foo() throws ??? {

        }
    } */

    public static void main(String[] args) {

    }
}
