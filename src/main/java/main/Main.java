/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

//import computer.Computer;
//import course.Course;
import student.Student;

/**
 *
 * @author joker
 */
public class Main 
{
    public static void main(String[] args) {
        
        Student student = new Student();
        
        student.setFirstName("Milica");
        student.setLastName("Zivanovic");
        student.setYearOfBirth(1985);
       
        student.getCourse().setName("QA");
        student.getCourse().setNumberOfClasses(60);
    
        student.getComputer().setProcessTact(4.0);
        student.getComputer().setMemory(16.00);
        student.getComputer().setHardDrive(2000);
        
        student.info();        
        
        
        }
        
        
        
        //Student student = new Student();
        
    //  Course course = new Course();
    //  Computer computer = new Computer();
        
     

       
    }
        
        
        
        
