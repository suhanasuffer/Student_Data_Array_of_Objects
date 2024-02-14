import java.util.*;
import java.io.*;

public class UserIp {
 private ArrayList<Student> students;
 private Scanner scanner;
 public StudentManager() {
 students = new ArrayList<>();
 scanner = new Scanner(System.in);
 }
 public void addStudent() {
  System.out.print("Enter PRN: ");
  String prn = scanner.next();
  System.out.print("Enter Name: ");
  String name = scanner.next();
  System.out.print("Enter DoB: ");
  String dob = scanner.next();
  System.out.print("Enter Marks: ");
  double marks = scanner.nextDouble();
  students.add(new Student(prn, name, dob, marks));
  System.out.println("Student added successfully.");
 }
 public void displayAllStudents() {
  if (students.isEmpty()) {
  System.out.println("No students available.");
  return;
 }
 System.out.println("All Students:");
 for (Student student : students) {
  System.out.println(student);
 }
 }
 public void searchByPRN() {
  System.out.print("Enter PRN to search: ");
  String prn = scanner.next();
  for (Student student : students) {
   if (student.getPRN().equals(prn)) {
    System.out.println("Student found: " + student);
  return;
 }
 }
 System.out.println("Student with PRN " + prn + " not found.");
 }
 public void searchByName() {
  System.out.print("Enter Name to search: ");
  String name = scanner.next();
  for (Student student : students) {
   if (student.getName().equals(name)) {
    System.out.println("Student found: " + student);
    return;
 }
 }
 System.out.println("Student with Name " + name + "not found.");
 }
 public void searchByPosition() {
  if (students.isEmpty()) {
  System.out.println("No students available.");
  return;
 }
 System.out.print("Enter position to search: ");
 int position = scanner.nextInt();
 if (position >= 0 && position < students.size()) {
  System.out.println("Student at position " + position + ": " + students.get(position));
 } else {
  System.out.println("Invalid position.");
 }
 }
 public void updateStudent() {
  System.out.print("Enter PRN of student to update:");
  String prn = scanner.next();
  for (Student student : students) {
   if (student.getPRN().equals(prn)) {
    System.out.print("Enter new Marks: ");
    double marks = scanner.nextDouble();
    student.setMarks(marks);
    System.out.println("Student marks updated successfully.");
    return;
 }
 }
 System.out.println("Student with PRN " + prn + " not found.");
 }
 public void deleteStudent() {
  System.out.print("Enter PRN of student to delete:");
  String prn = scanner.next();
  for (int i = 0; i < students.size(); i++) {
   if (students.get(i).getPRN().equals(prn)) {
   students.remove(i);
   System.out.println("Student deleted successfully.");
   return;
 }
 }
 System.out.println("Student with PRN " + prn + " not found.");
 }
}


