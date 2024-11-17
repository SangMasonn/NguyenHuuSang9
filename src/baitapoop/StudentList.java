
package baitapoop;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList = new ArrayList<>();

  
    public void displayAllStudents() {
        for (Student student : studentList) {
            student.displayStudentInfo();
        }
    }

  
    public Student findStudentById(String idToFind) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(idToFind)) {
                return student;
            }
        }
        return null;
    }

    
    public boolean deleteStudentById(String idToDelete) {
        Student student = findStudentById(idToDelete);
        if (student != null) {
            studentList.remove(student);
            return true;
        }
        return false;
    }

  
    public boolean editStudentById(String idToEdit) {
        Student student = findStudentById(idToEdit);
        if (student != null) {
           
            return true;
        }
        return false;
    }

 
    public void addStudent(Student student) {
        studentList.add(student);
    }
}
