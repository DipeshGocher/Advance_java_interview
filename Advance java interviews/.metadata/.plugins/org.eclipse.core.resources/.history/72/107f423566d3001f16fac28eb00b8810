package com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

public class TestBeforeClass {

    // This method runs once before any test methods in the class
    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class - runs once before any test method");
    }

    // This method runs before each test method
    @Before
    public void before() {
        System.out.println("before - runs before each test method");
    }

    // Test method 1
    @Test
    public void testAddition() {
        System.out.println("Test 01: Testing addition");
        int result = 2 + 3;
        assertEquals(5, result);
    }

    // Test method 2
    @Test
    public void testMultiplication() {
        System.out.println("Test 02: Testing multiplication");
        int result = 2 * 3;
        assertEquals(6, result);
    }
}
