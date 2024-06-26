/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe_part_01_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ammaa
 */

public class Login01Test {
    
    public Login01Test() {
    }
    
    

    @Test
    public void testCheckUsernameComplexityPassEquals() {
        Login01Test login01 = new Login01Test();
        String expected = "kyl_1";
        boolean actual = Login01.checkUsernameComplexity("kyl_1");
        assertEquals(expected,actual); 
    
    }
    @Test
    public void testCheckUsernameComplexityFailEquals() {
        Login01Test login01 = new Login01Test();
        String expected = "kyl!!!!!!!";
        boolean actual = Login01.checkUsernameComplexity("kyl!!!!!!!");
        assertEquals(expected,actual); 
    
    }
    
   
    
    @Test
    public void testCheckUsernameComplexityPass() {
        Login01Test login01 = new Login01Test();
        boolean expected = true;
        boolean actual = Login01.checkUsernameComplexity("kyl_1");
        assertTrue(actual); 
    
    }
    
    
    
    @Test
    public void testCheckUsernameComplexityFail() {
        Login01Test login01 = new Login01Test();
        boolean expected = true;
        boolean actual = Login01.checkUsernameComplexity("kyl!!!!!!!");
        assertFalse(actual);
    
    }
    
    
  
    @Test
    public void testCheckPasswordComplexityPassEquals() {
        Login01Test login01 = new Login01Test();
        String expected = "Ch&&sec@ke99!";
        boolean actual = Login01.checkPasswordComplexity("Ch&&sec@ke99!");
        assertEquals(expected,actual); 
    
    }
    
     @Test
    public void testCheckPasswordComplexityFailEquals() {
        Login01Test login01 = new Login01Test();
        String expected = "password";
        boolean actual = Login01.checkPasswordComplexity("password");
        assertEquals(expected,actual); 
    
    }
    
    @Test
    public void testCheckPasswordComplexityPass() {
         Login01Test login01 = new Login01Test();
        boolean expected = true;
        boolean actual = Login01.checkPasswordComplexity("Ch&&sec@ke99!");
        assertTrue(actual);  
    
    }
    
    @Test
    public void testCheckPasswordComplexityFail() {
        Login01Test login01 = new Login01Test();
        boolean expected = true;
        boolean actual = Login01.checkPasswordComplexity("password");
        assertFalse(actual); 
    
    }
    
    @Test
    void testRegisterUser() {
        Login01Test login = new Login01Test();
        String registrationMessage = login.registerUser();
        assertTrue(registrationMessage.contains("successfully"), "Registration failed");
    }

    @Test
    void testLoginUserPass() {
        Login01Test login = new Login01Test();
        boolean expected = true;
        boolean actual = Login01.loginUser("kyl_1","Ch&&sec@ke99!");
        assertTrue(actual);
    
    }

     @Test
    void testLoginUserFail() {
        Login01Test login = new Login01Test();
        boolean expected = true;
        boolean actual = Login01.loginUser("kyl!!!!!!!","password");
        assertFalse(actual);
    
    }
    
   
    @Test
    void testReturnLoginStatus() {
        Login01Test login = new Login01Test();
        boolean expected = true;
        
       
    }

}

    
    

