/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part_01_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ammaa
 */
public class TASKS {
    

    // Declarations
    private  String taskDescription;
    
    private String taskDetails;
    private int taskDuration;
    
    
   
    
    public static String checkTaskDescription(String taskDescription){
        if (taskDescription.length() <= 50) {
            return "Task successfully captured.";
            
        } else {
            return "Please enter a task decription of less than 50 characters.";
        }
    }
    
    
    
     public static String createTaskID( String developerDetails,int taskNumber, String taskName){
       String initials = taskName.substring(0, Math.min(taskName.length(), 2));
       String lastThreeLetters = developerDetails.substring(Math.max(0, developerDetails.length() - 3));
        return initials.toUpperCase() + ":" + taskNumber + ":" + lastThreeLetters.toUpperCase();
}
    
    
    public static String printTaskDetails(String taskName, int taskNumber, String taskDescription, int taskDuration, String taskID, String taskStatus) {
        return "Task Name: " + taskName + "\n" +
               "Task Number: " + taskNumber + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task Duration: " + taskDuration + " hours\n" +
               "Task ID: " + taskID + "\n" +
               "Task Status: " + taskStatus;
    }
    
    
    
    public static int returnTotalHours() {
        int totalHours = 0;
      for ( TASKS task : task) {
            totalHours += task.taskDuration;
        }
        return totalHours;
    }
    
     static void setTasks( TASKS[] tasksArray) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setTaskDuration(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



    


    
    

