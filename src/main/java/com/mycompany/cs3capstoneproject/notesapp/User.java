/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs3capstoneproject.notesapp;

import java.util.HashMap;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author mishra_930372
 */
public class User {
    
    
    private String username; //this user’s username
    private String password; //this user’s password - encryped
    private HashMap<Integer,Note> notes; //this user’s list of notes

    public User( String username, String password){
     
        this.username = username;
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public void changePass(String newPass){
        password = BCrypt.hashpw(newPass, BCrypt.gensalt());
    } 

    public boolean checkPass(String password){
        return BCrypt.checkpw(password, this.password);
    } 

    

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public HashMap<Integer, Note> getNotes() {
        return notes;
    }

    public void setNotes(HashMap<Integer, Note> notes) {
        this.notes = notes;
    }
    
    

}
