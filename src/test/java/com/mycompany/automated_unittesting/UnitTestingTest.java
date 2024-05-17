/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unittesting;

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
public class UnitTestingTest {
    
    public UnitTestingTest() {
    }
   
    @Test
    public void testAdditionMethod(){
        
        // Create an instance of the class
        UnitTesting ut = new UnitTesting();
        
        int expected = 4;
        int actual = ut.addition(2, 2);
        
        assertEquals(expected,actual);
    }

     @Test
    public void testSubtractionMethod(){
        
        // Create an instance of the class
        UnitTesting ut = new UnitTesting();
        
        int expected = 6;
        int actual = ut.subtraction(2, 2);
        
        assertEquals(expected,actual);
    }






   