package baitapoop;

import java.util.Date;

public class Student {

    String studentId;
    String fullName;
    Date dateOfBirth;
    String major;
    float gpa;

    public Student(String studentId, String fullName, Date dateOfBirth, String major, float gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }

    public void enterStudentInfo() {

    }

    public void displayStudentInfo() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }

    Object getStudentId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setMajor(String newMajor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setGpa(float newGpa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setDateOfBirth(Date newDateOfBirth) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setFullName(String newFullName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
