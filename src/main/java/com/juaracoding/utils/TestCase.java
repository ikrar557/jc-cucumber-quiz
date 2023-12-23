package com.juaracoding.utils;

public enum TestCase {

    T1("User Login With Blank Username"),

    T2("User Login With Blank Password"),

    T3("User Login Invalid with Wrong Username"),

    T4("User Login Valid"),

    T5("User add all product to cart"),

    T6("User input blank first name"),

    T7("User input blank last name"),

    T8("User input blank postal code"),

    T9("User input valid information"),

    T10("User completes checkout after successful Scenario #4");


    private String testCaseName;

    TestCase(String value) {
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }

}
