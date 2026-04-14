package com.mycompany.chatpro;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionsTest {

    @Test
    public void testIsValidPassword() {
        // Replace with actual test logic
        Conditions cond = new Conditions();
        
        // Test valid password
        assertTrue(cond.isValidPassword("StrongP@ss1"));
        
        // Test invalid password (too short)
        assertFalse(cond.isValidPassword("weak"));
    }

    @Test
    public void testIsValidUsername() {
        Conditions cond = new Conditions();
        
        // Test valid username
        assertTrue(cond.isValidUsername("john_doe123"));
        
        // Test invalid username (contains spaces)
        assertFalse(cond.isValidUsername("john doe"));
    }

    @Test
    public void testIsValidCellNum() {
    Conditions cond = new Conditions();
    boolean result = cond.isValidCellNum("+27831234567");
    System.out.println("Result: " + result);  // Add this to debug
    assertTrue(result);  // Line 36
    }

}
