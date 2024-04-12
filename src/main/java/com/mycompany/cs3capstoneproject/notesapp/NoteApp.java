/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs3capstoneproject.notesapp;

/**
 *
 * @author mishra_930372
 */
public class NoteApp {

    public Data data;
    public User loggedIn;
    public NoteApp(){
        data = new Data();
    }
    
    public User login(String username, String password){
        User user = data.getUser(username);
        if(user != null){
            
            if(user.checkPass(password)){
                System.out.println("s");
                loggedIn = user;
                mainWindow.runMainWindow();
                return user;
                
            }
            
        }
        return null;
    }
    
    
    
}
