package com.insightfullogic.java8.examples.libraries;

// BEGIN body
public interface Child extends Parent {

    @Override
    public default void welcome() {
        message("Child: Hi!");
    }

}
// END body