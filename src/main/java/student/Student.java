/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author joker
 */
public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;


    public String getFirstName () {
        return this.firstName;
}
    
    public String getLastName () {
        return this.lastName;
    }
    
    public int getYearOfBirth () {
        return this.yearOfBirth;
    }
    
    public void SetFirstName(String customFirstName) {
        this.firstName = customFirstName;
    }
    
    public void SetLastName(String customLastName) {
        this.lastName = customLastName;
    }
    
    public void SetYearOfBirth(int customYearOfBirth) {
        this.yearOfBirth = customYearOfBirth;
    }
    
    
    public Student() {
        this.firstName = "Milica";
        this.lastName = "Zivanovic";
        this.yearOfBirth = 1985;
    }
    
    public Student(String customFirstName, String customLastName, int customYearOfBirth) {
        this.firstName = customFirstName;
        this.lastName = customLastName;
        this.yearOfBirth = customYearOfBirth;
    }
    
    public void info() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Year of Birth: " + this.yearOfBirth);
    }
    
    
}
    