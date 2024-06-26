/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part_01_1;

import com.mycompany.poe_part_01_1.TASKS.Tasks;
import javax.swing.JOptionPane;

/**
 *
 * @author ammaa
 */
public class POE_Part_01_1 {

    // Global Variable
    public static String Message;
    String message;
    public static void main(String[] args) {
        
        /*
        Program to create an account by entering username, password,
        first name and last name:
        If username contains an underscore and is more than
        5 characters long return Login Failed
        If password does not contain atleast 8 characters,a capital letter,
        a number and a special character return Login Failed
        */
        
      
        // Declarations
        String optionMessage = " ";
        int userChoice ;
        int numTasks = 0;
        int taskNumber = 0;
        int totalHours = 0;
        String message;
        
        
       // Define the array to store tasks
        TASKS[] tasks = null;

       
        // Prompt the user to enter first and last name
       
        String userFirstName = JOptionPane.showInputDialog(null,
            "Enter your First Name: ","First Name", JOptionPane.QUESTION_MESSAGE);
        String userLastName = JOptionPane.showInputDialog(null,
            "Enter your Last Name: ","Last Name", JOptionPane.QUESTION_MESSAGE);
        
        
       
        // Prompt the user to enter username
        String userName = JOptionPane.showInputDialog(null,
        "Please Enter your UserName: ", "UserName", JOptionPane.QUESTION_MESSAGE);
        
        boolean userNameChecker = Login01.checkUsernameComplexity(userName);
        
        if (userNameChecker)
        {JOptionPane.showMessageDialog(null,"Username succesfully captured", Message,JOptionPane.INFORMATION_MESSAGE);
            
        } else {
           JOptionPane.showMessageDialog(null,"Username is incorrectly formatted,Please ensure username contains an underscore and is less than 5 characters in length",
                   Message,JOptionPane.INFORMATION_MESSAGE);
        
                }
        
        
        // Prompt the user to enter a password
        String password = JOptionPane.showInputDialog(null,
        "Enter your password: ", "Password",JOptionPane.QUESTION_MESSAGE);
        
        boolean passwordChecker = Login01.checkPasswordComplexity(password);
        
        if (passwordChecker)
        {JOptionPane.showMessageDialog(null,"Password succesfully captured", Message,JOptionPane.INFORMATION_MESSAGE);
            
        } else {
           JOptionPane.showMessageDialog(null,"Password is incorrectly formatted,Please ensure password contains atleast 8 characters, a capital letter,a number and a special character",
                   Message,JOptionPane.INFORMATION_MESSAGE);
        
                }
        
 
        // POE part 2 

    
        // Prompt user to enter Login details
        String username = JOptionPane.showInputDialog(null, "Please enter your Username: ", JOptionPane.QUESTION_MESSAGE);
         password = JOptionPane.showInputDialog(null, "Please enter your password: ", JOptionPane.QUESTION_MESSAGE);
       
        
        // Check validity of Login Status
        if (username.equals("username") && password.equals("password")){
          JOptionPane.showMessageDialog(null, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
           JOptionPane.showMessageDialog(null, "Incorrect username or password", "Error", JOptionPane.ERROR_MESSAGE); 
         return;
        }
        
        // Display Welcome message if login successful
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban",null,JOptionPane.INFORMATION_MESSAGE);
         
        // Display Menu Options                                                         
         boolean programLoop = true;

        while (programLoop) {
        int choice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please select one of the following Options:\nOption 1: Add Tasks\nOption 2: View Tasks\nOption 3: Quit", "Menu Options",
                 JOptionPane.QUESTION_MESSAGE));
        
         // Switch Statement to display Options
        switch (choice){
            case 1:
                optionMessage = "Add Tasks selected";
                numTasks = Integer.parseInt(JOptionPane.showInputDialog(null,"How many tasks do you want to enter? ",JOptionPane.QUESTION_MESSAGE));
                // Create Array to store task details
                 Tasks[] tasks = new Tasks[numTasks];
                 totalHours = 0; 
                 
                // Create a loop for task details
                 for (int i = 0; i < numTasks; i++) {
                    TASKS task = new TASKS();

                // Prompt user to enter task details
                 String taskName = JOptionPane.showInputDialog(null,"Please enter Task Name",JOptionPane.QUESTION_MESSAGE);
                 
                 String taskDescription = JOptionPane.showInputDialog(null,"Please enter Task Description",JOptionPane.QUESTION_MESSAGE);
                // Call the checkTaskDescription method
                  message = Tasks.checkTaskDescription(taskDescription);
                
                // Check if user entered correct task description, if not use a loop to display it
                   if (!message.equals("successfully captured")) {
                     JOptionPane.showInputDialog(null,"Please enter Task Description",JOptionPane.QUESTION_MESSAGE);
                   }
                        
                 String developerDetails = JOptionPane.showInputDialog(null,"Please enter Developer Details",JOptionPane.QUESTION_MESSAGE);
                         
                 int taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter task Duration (in hours)",JOptionPane.QUESTION_MESSAGE));
                        
                // Generate Task ID 
                Tasks.createTaskID(developerDetails, taskNumber, taskName);
                 
                 String taskStatus = JOptionPane.showInputDialog(null, "Please enter Task Status (To Do/Done/Doing)", JOptionPane.QUESTION_MESSAGE);
                 
                // Add task duration to total hours
                 totalHours += taskDuration;
                
                 // Create a task array to store task details
                   TASKS[i] = task;
            String taskID;
                  
                // Display Task Details for all tasks
               JOptionPane.showInputDialog(null, "Task Name: " + taskName + "\n" + 
                       "Task Number: " + taskNumber + "\n" + 
                       "Task Description: " + taskDescription + "\n" +
                       "Task Duration: " + taskDuration + " hours\n" +
                       "Task ID: " + taskID + "\n" +
                       "Task Status: " + taskStatus);
                                
                totalHours = Tasks.returnTotalHours();
                
               // Display total hours accumulated
                JOptionPane.showMessageDialog(null, "Total Task Hours: " + totalHours, "TOTAL HOURS", JOptionPane.INFORMATION_MESSAGE);
                
              // Display task details message
                Tasks.printTaskDetails(taskName, taskNumber, taskDescription, taskDuration, taskName, taskStatus);
                  
           }
        
               break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Coming Soon", "Report", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
            // Quit option selected
            JOptionPane.showMessageDialog(null, "Quitting the program.", "Quit", JOptionPane.INFORMATION_MESSAGE);
            // end the program with an exit loop
            programLoop = false; 
            break;
            default:
            JOptionPane.showMessageDialog(null, "Invalid option chosen.", "Error", JOptionPane.ERROR_MESSAGE);
            break;
            
        }
    
        }
    }
}
       
   // POE PART 03 (main)

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
    taskManagers.displayLongestTask();
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
                     JOptionPane.showMessageDialog(null,"Task Report", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "Search for Task":
                    String taskName = JOptionPane.showInputDialog(null, "Enter task name to search:",JOptionPane.INFORMATION_MESSAGE);
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


        // call the displayLongestTask method using an instance
       String longestTaskDetails = TaskManagers.displayLongestTask();

        }
    }
    
    
        
    
    
        


