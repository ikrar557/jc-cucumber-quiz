package com.juaracoding.utils;

public enum TestCase {

    T1("User Login With Blank Username"),

    T2("User Login With Blank Password"),

    T3("User Login Invalid with Wrong Username"),

    T4("User Login Valid");

    private String testCaseName;

    TestCase(String value) {
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
