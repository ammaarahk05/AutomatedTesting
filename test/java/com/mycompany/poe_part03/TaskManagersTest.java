/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe_part03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ammaa
 */
public class TaskManagersTest {
    
    public TaskManagersTest() {
    }

    @Test
    public void testSearchForTask() {
        TaskManagers taskManagers = new TaskManagers();
    String taskName = "Create Login";
    String expectedResponse = "Mike Smith, Create Login";
    String[] actualResponse = taskManagers.searchForTask(taskName);

    assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testSearchForDeveloperTasks() {
        TaskManagers taskManagers = new TaskManagers();
    String developerName = "Samantha Paulson";
    String expectedResponse = "Create Reports";
    String[] actualResponse = taskManagers.searchForDeveloperTasks(developerName);

    assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testDeleteTask() {
        TaskManagers taskManagers = new TaskManagers();
    String taskName = "Create Reports";
    String expectedResponse = "Entry 'Create Reports' successfully Deleted.";
    String[] actualResponse = taskManagers.deleteTask(taskName);

    assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void testDisplayTaskReport() {
        TaskManagers taskManagers = new TaskManagers();
    String expectedResponse = generateExpectedTaskReport();
    String[] actualResponse = taskManagers.displayTaskReport();

    assertEquals(expectedResponse, actualResponse);
}

// Helper method to generate the expected task report
  private String generateExpectedTaskReport() {
    StringBuilder report = new StringBuilder();
    report.append("Task Report:\n");
    report.append("Task Name: Create Login\n");
    report.append("Task ID: 1\n");
    report.append("Task Duration: 5\n");
    report.append("Task Status: To Do\n\n");
    // Add more tasks to the report as needed
    return report.toString();
}


        
    }
    
    

