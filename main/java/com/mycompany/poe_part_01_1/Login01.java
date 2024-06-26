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
public class Login01 {
    //Declarations
    String userFirstName;
    String userLastName;
            
    
    
String password = JOptionPane.showInputDialog(null,
        "Enter your password: ", "Password",JOptionPane.QUESTION_MESSAGE);
String userName = JOptionPane.showInputDialog(null,
        "Please Enter your UserName: ", "UserName", JOptionPane.QUESTION_MESSAGE);
    
    public static boolean checkUsernameComplexity(String username){
          return username.length() <=5 || username.contains("_");
    }
    
    public static boolean checkPasswordComplexity(String password){
         String pattern = "(.*[A-Z].*)(.*@#$%^&+=.)(.*\\d*.).{8,}";

           return password.matches(pattern);
    }
         
        // Create instance of the login01 class
         Login01 login01 = new Login01();
    
        // Create a method to register user
 
        public String registerUser (){
          String regMessage;
          
        // Prompt user to enter username
              if (checkUsernameComplexity(userName) == true){ 
                  regMessage = "Username successfully captured";
              } else {
                  regMessage = "Username does not meet complexity requirements";
              }
         // Prompt user to enter password
                 if (checkPasswordComplexity(password) == true){
                  regMessage = "\nPassword succcessfully captured";
              } else {
                   regMessage = "\nPassword does not meet complexity requirements";
}
               return "User is successfully registered";
              }
                  
              
           
    // Create a method to verify login details


        public static boolean loginUser(String userName, String password){
 
          return userName.equals(userName) && password.equals(password);
    
        }
        
        public String returnLoginStatus(boolean loginStatus){
        if(loginStatus) {
            return "Welcome" + userFirstName + " " + userLastName + "It is great to see you again.";
        } else {
            return "Login Failed. Username or password incorrectly captured,please retry.";

     
        }
        }
}
    

