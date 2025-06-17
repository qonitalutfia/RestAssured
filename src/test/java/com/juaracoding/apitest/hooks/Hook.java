package com.juaracoding.apitest.hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hook {

    @BeforeAll
    public static void setUp() {
        System.out.println("[INFO] Running setup before all test scenarios (BeforeAll)");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("[INFO] Running cleanup after all test scenarios (AfterAll)");
    }
}
