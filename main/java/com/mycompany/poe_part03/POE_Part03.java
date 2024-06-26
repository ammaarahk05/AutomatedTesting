/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part03;

import javax.swing.JOptionPane;

/**
 *
 * @author ammaa
 */
public class POE_Part03 {

    public static void main(String[] args) {
       
        // Declare arrays
    private static final int MAX_TASKS = 100;
    private static String[] developers = new String[MAX_TASKS];
    private static String[] taskNames = new String[MAX_TASKS];
    private static int[] taskIDs = new int[MAX_TASKS];
    private static int[] taskDuration = new int[MAX_TASKS];
    private static String[] taskStatuses = new String[MAX_TASKS];
    private static int taskCount = 0;
    
    public static void main(String[] args) {
    // Using test data, populate arrays
       taskManagers = taskManagers.populateArrays();

   // Create an instance of the methods class & call the methods
    TaskManagers taskManagers = new TaskManagers();
    taskManagers.displayTaskReports();
    taskManagers.displayDoneTasks();
     String longestTaskDetails = TaskManagers.displayLongestTask();
    taskManagers.searchForTask("Create Login");
    taskManagers.searchForDeveloperTasks("Samantha Paulson");
    taskManagers.deleteTask("Create Reports");
  // Display the Task Report to show updated list
     taskManagers.displayTaskReports();
     


  // Populate arrays using test data
    developers[0]= "Mike Smith";
    taskNames[0]= "Create Login";
    taskIDs[0]= 1;
    taskDuration[0]= 5;
    taskStatuses[0]= "To Do";
    taskCount++;
    
     developers[1]= "Edward Harrison";
    taskNames[1]= "Create Add Features";
    taskIDs[1]= 2;
    taskDuration[1]= 8;
    taskStatuses[1]= "Doing";
    taskCount++;
    
     developers[2]= "Samantha Paulson";
    taskNames[2]= "Create Reports";
    taskIDs[2]= 3;
    taskDuration[2]= 2;
    taskStatuses[2]= "Done";
    taskCount++;
    
     developers[3]= "Glenda Oberholzer";
    taskNames[3]= "Add Arrays";
    taskIDs[3]= 3;
    taskDuration[3]= 11;
    taskStatuses[3]= "To Do";
    taskCount++;
    

    // Loop the selection menu using a while loop
        while (true) {
            // Create an Area to make use of drop-down JOptionPane
            String[] options = {
                "Display Task Report", "Search for task", "Delete Task","Exit"
            };
            String choice = (String) JOptionPane.showInputDialog(
                null, "Choose an option", "Task Manager",JOptionPane.INFORMATION_MESSAGE, null, options, options[0]
            );
    
      if (choice == null) {
    // User chose cancel, exit the program
    System.exit(0);
            }
    
     // Switch statement invoking the modules based on users selection from the menu
            switch (choice) {
                case "Display Task Report":
                     JOptionPane.showMessageDialog(null, displayTaskReport(), "Task Report", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "Search for Task":
                    String taskName = JOptionPane.showInputDialog(null, "Enter task name to search:", JOptionPane.INFORMATION_MESSAGE);
                    if (taskName != null && !taskName.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, searchForTask(taskName), "Task Search", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Task name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                
                case "Delete Task":
                     String deleteTaskName = JOptionPane.showInputDialog(null, "Enter task name to delete:",JOptionPane.INFORMATION_MESSAGE);
                     break;
                case "Exit":
                    System.exit(0);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Invalid choice. Try again.", "INVALID", 
                            JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // call the displayLongestTask method using an instance
       String longestTaskDetails = TaskManagers.displayLongestTask();

      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
        
        
        
    

