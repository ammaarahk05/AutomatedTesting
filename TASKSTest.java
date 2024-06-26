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
public class TASKSTest {
    
    public TASKSTest() {
    }
    
   @Test
    public void testCheckTaskDescriptionSuccess() {
        TASKS task = new TASKS();
        String description = "Create Login to Authenticate users";
        String expected = "Task successfully captured.";
        String actual = task.checkTaskDescription(description);
        
       
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckTaskDescriptionFailure() {
       TASKS task = new TASKS();
        // Declaration and Assignments
       String description = "Task will be longer than 50 characters. Task will fail";
       String expected = "Please enter a task description of less than 50 characters.";
       String actual = task.checkTaskDescription(description);
      
       assertEquals(expected, actual);
    }
    
     @Test
    public void testCreateTaskID() {
       TASKS task = new TASKS();
      String[] developerDetails = {"Robyn Harrison", "Mike Smith", "Edward Harrison"};
        int[] taskNumbers = {1, 2, 3};
     String[] taskNames = {"Login Feature", "Create Add Features", "Create Reports"};
      // Create a For loop to test taskID
    for (int i = 0; i < developerDetails.length; i++) {
        String expected = "LO:" + taskNumbers[i] + ":" + taskNames[i].substring(0, 3).toUpperCase();
        String actual = task.createTaskID(developerDetails[i], taskNumbers[i], taskNames[i]);
        assertEquals(expected, actual);
    }
}


    
    @Test
    public void testReturnTotalHoursForTwoTasks() {
        
        TASKS task1 = new  TASKS();
        task1.setTaskDuration(8);

         TASKS task2 = new  TASKS();
        task2.setTaskDuration(10);

        // Set a task array
         TASKS[] tasksArray = { task1, task2 };
        TASKS.setTasks(tasksArray);

    
        int expected = 18;
        int actual = Tasks.returnTotalHours();
        
        
        assertEquals(expected, actual);
    }
    
     @Test
    public void testReturnTotalHoursForFiveTasks() {
        // Create instances of the Tasks Class
         TASKS task1 = new  TASKS();
        task1.setTaskDuration(10);

         TASKS task2 = new  TASKS();
        task2.setTaskDuration(12);

         TASKS task3 = new  TASKS();
        task3.setTaskDuration(55);

         TASKS task4 = new  TASKS();
        task4.setTaskDuration(11);

         TASKS task5 = new  TASKS();
        task5.setTaskDuration(1);

        // Set tasks array
         TASKS[] tasksArray = { task1, task2, task3, task4, task5 };
        Tasks.setTasks(tasksArray);

        // Declaration and Assignments
        int expected = 89;
        int actual = Tasks.returnTotalHours();
        
        // AssertEquals Method
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckTaskDescription() {
    }

    @Test
    public void testPrintTaskDetails() {
    }

    @Test
    public void testReturnTotalHours() {
    }
}


