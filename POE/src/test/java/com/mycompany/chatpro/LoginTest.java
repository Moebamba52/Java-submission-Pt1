
package com.mycompany.chatpro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkUserman method, of class Login.
     */
    @Test
    public void testCheckUserman() {
        System.out.println("checkUserman");
        String username = "";
        boolean expResult = false;
        boolean result = Login.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassword method, of class Login.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "";
        boolean expResult = false;
        boolean result = Login.checkPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhone method, of class Login.
     */
    @Test
    public void testCheckCellPhone() {
        System.out.println("checkCellPhone");
        String cellNum = "";
        boolean expResult = false;
        boolean result = Login.checkCellPhone(cellNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkResgisterUser method, of class Login.
     */
    @Test
    public void testCheckResgisterUser() {
        System.out.println("checkResgisterUser");
        String username = "";
        boolean expResult = false;
        boolean result = Login.checkResgisterUser(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String inputUsername = "";
        String inputPassword = "";
        String storedUsername = "";
        String storedPassword = "";
        boolean expResult = false;
        boolean result = Login.loginUser(inputUsername, inputPassword, storedUsername, storedPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
