/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs3capstoneproject.notesapp;

import java.util.HashMap;

/**
 *
 * @author mishra_930372
 */
public class Data implements java.io.Serializable{
        private HashMap<String,User> users; //stores all users
        private User loggedIn;
	
	public Data(){
            read();
            users = new HashMap<>();
            User admin = new User("admin","admin123");
            users.put("admin", admin);
        } //will call the read method 
	private void read(){
            
        } //reads any previously written to disk data
	public void write(){
            
        } //write the hashmap to disk
	public boolean newUser(User user){
            if(users.containsKey(user.getUsername()))
                return false;
            users.put(user.getUsername(),user);
            return true;
            
        } //creates a new user
	public User getUser(String username){
            if(users.containsKey(username))
                return users.get(username);
            return null;
        } 
	public boolean deleteUser(User user){
            if(users.containsKey(user.getUsername())){
                users.remove(user.getUsername());
                return true;
            }
            return false;
        } //deletes a user
        
        public void setLoggedIn(User user){
            loggedIn = user;
        }
        
        public User getLoggedIn(){
            return loggedIn;
        }

}
