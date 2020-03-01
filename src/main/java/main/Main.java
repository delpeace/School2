/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import student.Student;

/**
 *
 * @author joker
 */
public class Main 
{
    public static void main(String[] args) {
        
        //Student student = new Student();
        Student student = new Student("Mladen", "Zivanovic", 1984);
        student.info();
        
    }
}