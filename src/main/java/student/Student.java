/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import course.Course;
import computer.Computer;

/**
 *
 * @author joker
 */
public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;


    public String getFirstName () {
        return this.firstName;
}
    
    public String getLastName () {
        return this.lastName;
    }
    
    public int getYearOfBirth () {
        return this.yearOfBirth;
    }
    
    public Course getCourse() {
       return this.course;
    }
    
    public Computer getComputer() {
        return this.computer;
    }
    
    public void setFirstName(String customFirstName) {
        this.firstName = customFirstName;
    }
    
    public void setLastName(String customLastName) {
        this.lastName = customLastName;
    }
    
    public void setYearOfBirth(int customYearOfBirth) {
        this.yearOfBirth = customYearOfBirth;
    }
    
/*  public Student() {
        this.firstName = "Milica";
        this.lastName = "Zivanovic";
        this.yearOfBirth = 1985;
    }
*/
    
    public Student(String customFirstName, String customLastName, int customYearOfBirth) {
        this.firstName = customFirstName;
        this.lastName = customLastName;
        this.yearOfBirth = customYearOfBirth;
    }
    
    public Student(Course customCourse, Computer customComputer) {
        this.course = customCourse;
        this.computer = customComputer;
    }
    
    public Student() {
        course = new Course();
        computer = new Computer();
    }
    
            
    
    public void info() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Year of Birth: " + this.yearOfBirth);
        System.out.print("Course name: " + course.getName());
        System.out.println("Course number of classes: " + course.getNumberOfClasses());
        System.out.println("Process tact: " + computer.getProcessTact());
        System.out.println("Memory: " + computer.getMemory());
        System.out.println("Hard drive: " + computer.getHardDrive());
        
        
        
    }
    
    //Course course = new Course();
    //Computer computer = new Computer();
    
    
    
}
    