/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs3capstoneproject.notesapp;

import java.awt.Color;
import java.time.LocalDateTime;

/**
 *
 * @author mishra_930372
 */
public class Note {
        private String data; //actual string content of the note
	private LocalDateTime date; //date the note was created
        private Color priority;

	public Note(String data, Color priority){
            this.data = data;
            date = LocalDateTime.now();
            this.priority = priority;
        } 

	public String getData(){
            return data;
        } 

	public LocalDateTime getDate(){
            return date;
        } 

	public void setNote(String newNote){
            data = newNote;
        } 

}
