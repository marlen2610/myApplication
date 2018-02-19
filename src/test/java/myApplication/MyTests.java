package myApplication;


import static org.junit.Assert.*;

import org.junit.Test;

public class MyTests {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested
        // assert statements
        assertTrue("10 x 0 must be 0", tester.multiply(10, 0) == 0);
        assertTrue("0 x 10 must be 0", tester.multiply(0, 10) == 0);
        assertTrue("0 x 0 must be 0", tester.multiply(0, 0) == 0);
    }
}