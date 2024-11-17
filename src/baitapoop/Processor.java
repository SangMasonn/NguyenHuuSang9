package baitapoop;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi tat ca sinh vien");
            System.out.println("3. Tim kiem sinh vien bang ID");
            System.out.println("4. Xoa sinh vien bang ID");
            System.out.println("5. Chinh sua sinh vien bang ID");
            System.out.println("6. Thoat");
            System.out.print("Chon mot tuy chon: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Thêm sinh viên mới
                    System.out.print("Nhap ID: ");
                    String studentId = scanner.nextLine();

                    System.out.print("Nhap ho va ten: ");
                    String fullName = scanner.nextLine();

                    System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
                    String dobStr = scanner.nextLine();
                    Date dateOfBirth = null;
                    try {
                        dateOfBirth = dateFormat.parse(dobStr);
                    } catch (ParseException e) {
                        System.out.println("Ngay sinh khong hop le.");
                        break;
                    }

                    System.out.print("Nhap nganh hoc: ");
                    String major = scanner.nextLine();

                    System.out.print("Nhap GPA: ");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine();

                    Student newStudent = new Student(studentId, fullName, dateOfBirth, major, gpa);
                    studentList.addStudent(newStudent);
                    System.out.println("Them sinh vien thanh cong!");
                    break;

                case 2:

                    studentList.displayAllStudents();
                    break;

                case 3:

                    System.out.print("Nhap ID sinh vien can tim: ");
                    String idToFind = scanner.nextLine();
                    Student foundStudent = studentList.findStudentById(idToFind);
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfo();
                    } else {
                        System.out.println("Khong tim thay sinh vien voi ID nay.");
                    }
                    break;

                case 4:

                    System.out.print("Nhap ID sinh vien can xoa: ");
                    String idToDelete = scanner.nextLine();
                    boolean deleted = studentList.deleteStudentById(idToDelete);
                    if (deleted) {
                        System.out.println("Xoa sinh vien thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sinh vien với ID nay.");
                    }
                    break;

                case 5:

                    System.out.print("Nhap ID sinh vien can chinh sua: ");
                    String idToEdit = scanner.nextLine();
                    Student studentToEdit = studentList.findStudentById(idToEdit);
                    if (studentToEdit != null) {
                        System.out.print("Nhap ho va ten moi (de trong de giu nguyen): ");
                        String newFullName = scanner.nextLine();
                        if (!newFullName.isEmpty()) {
                            studentToEdit.setFullName(newFullName);
                        }

                        System.out.print("Nhap ngay sinh mới (dd/MM/yyyy, de trong de giu nguyen): ");
                        String newDobStr = scanner.nextLine();
                        if (!newDobStr.isEmpty()) {
                            try {
                                Date newDateOfBirth = dateFormat.parse(newDobStr);
                                studentToEdit.setDateOfBirth(newDateOfBirth);
                            } catch (ParseException e) {
                                System.out.println("Ngày sinh không hợp lệ.");
                            }
                        }

                        System.out.print("Nhập ngành học mới (de trong de giu nguyen): ");
                        String newMajor = scanner.nextLine();
                        if (!newMajor.isEmpty()) {
                            studentToEdit.setMajor(newMajor);
                        }

                        System.out.print("Nhap GPA moi (de trong de giu nguyen): ");
                        String newGpaStr = scanner.nextLine();
                        if (!newGpaStr.isEmpty()) {
                            try {
                                float newGpa = Float.parseFloat(newGpaStr);
                                studentToEdit.setGpa(newGpa);
                            } catch (NumberFormatException e) {
                                System.out.println("GPA không hợp lệ.");
                            }
                        }
                        System.out.println("Chinh sua thong tin sinh vien thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sinh vien voi ID nay.");
                    }
                    break;

                case 6:
                    // Thoát chương trình
                    running = false;
                    System.out.println("Chuong trinh ket thuc.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
        }

    }
}
