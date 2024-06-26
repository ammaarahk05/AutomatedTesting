/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part03;

import javax.swing.JOptionPane;

/**
 *
 * @author ammaa
 */
public class TaskManagers {
    
    public String displayDoneTasks() {
        StringBuilder report = new StringBuilder();
        report.append("Done Tasks:\n");
        for (int i = 0; i < taskCount; i++) {
            if (taskStatuses[i].equals("Done")) {
                report.append("Developer: " + developers[i] + "\n");
                report.append("Task Name: " + taskNames[i] + "\n");
                report.append("Task Duration: " + taskDuration[i] + "\n\n");
            }
        }
        return report.toString();
    }
}

    public static String displayLongestTask() {
    if (taskCount == 0) {
        return "No tasks available.";
    }

    int maxDurationIndex = 0;
    for (int i = 1; i < taskCount; i++) {
        if (taskDuration[i] > taskDuration[maxDurationIndex]) {
            maxDurationIndex = i;
        }
    }

    String result = "Developer: " + developers[maxDurationIndex] +
                    "\nTask Name: " + taskNames[maxDurationIndex] +
                    "\nTask Duration: " + taskDuration[maxDurationIndex] +
                    "\nTask Status: " + taskStatuses[maxDurationIndex];

    JOptionPane.showMessageDialog(null, result, "Longest Task", JOptionPane.INFORMATION_MESSAGE);
    return result;
}



    

 
      public String searchForDeveloperTasks() {
         String developerName = JOptionPane.showInputDialog(null, "Enter developer name to search:");
         StringBuilder report = new StringBuilder();
          report.append("Tasks for " + developerName + ":\n");
       boolean found = false;
    for (int i = 0; i < taskCount; i++) {
        if (developers[i].equals(developerName)) {
            found = true;
            report.append("Task Name: " + taskNames[i] + "\n");
            report.append("Task Status: " + taskStatuses[i] + "\n\n");
        }
    }
    if (found) {
        return report.toString();
    } else {
        return "No tasks found for " + developerName;

     // Create an instance of the searchForDeveloperTasks method
        taskManagers.searchForDevelpoperTasks("Samantha Paulson");
    }
}



      public String deleteTask(String[]taskNames,int[]taskIDs,String[]taskDuration,String[]taskStatuses,int taskCount) {
         String taskName = JOptionPane.showInputDialog(null, "Enter task name to delete:");
      // Define & Initialise the index variable
        int index = -1;
        
    for (int i = 0; i < taskCount; i++) {
      if (taskNames[i].equals(taskName)) {
            index = i;
            break;
}
}
      if (index != -1) {
        for (int i = index; i < taskCount - 1; i++) {

        taskNames[i] = taskNames[i + 1];
        taskIDs[i] = taskIDs[i + 1];
        taskDuration[i] = taskDuration[i + 1];
        taskStatuses[i] = taskStatuses[i + 1];
    }
        taskCount--;
    JOptionPane.showMessageDialog(null, "Task deleted successfully!", "Task Deletion", JOptionPane.INFORMATION_MESSAGE);
     return "Task deleted successfully!";
      } else {
    JOptionPane.showMessageDialog(null, "Task not found!", "Task Deletion", JOptionPane.INFORMATION_MESSAGE);
     return "Task not found!";

    // Create an instance of the deleteTask method
        taskManagers.deleteTask("Create Reports");
    }
}




    
       public static String displayTaskReport() {
    StringBuilder report = new StringBuilder();
    report.append("Task Report:\n");
    for (int i = 0; i < taskCount; i++) {
        report.append("Task Name: " + taskNames[i] + "\n");
        report.append("Task ID: " + taskIDs[i] + "\n");
        report.append("Task Duration: " + taskDuration[i] + "\n");
        report.append("Task Status: " + taskStatuses[i] + "\n\n");
    }
    return report.toString();

     // Create an instance of the displayTaskReport method
         taskManagers.displayTaskReport();
}


    

