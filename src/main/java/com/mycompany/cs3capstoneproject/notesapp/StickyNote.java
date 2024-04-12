/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs3capstoneproject.notesapp;
import java.awt.Color;
/**
 *
 * @author mishra_930372
 */
public class StickyNote extends Note{
    public StickyNote(String content,Color priority){
        super(content,priority);
    }
    
    public String getNoteType(){
        return "sticky";
    }
}
