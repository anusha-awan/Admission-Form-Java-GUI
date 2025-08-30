import java.util.*;
import javax.swing.*;

public class menutools4 {
    static List<Student> students = new ArrayList<>();
    static int rollNumberCounter = 100; // Start roll number from 100 or any initial number.

    // Method to display final merit list
    static void displayFinalMeritList() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.totalScore, s1.totalScore); // Sort by total score
            }
        });
/*
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Final Merit List:");
        int rank = 1;
        // Display the header
        System.out.printf("%-7s %-12s %-10s %-20s %s%n", "RANK", "ROLL.NO", "FORM.NO", "NAMES", "TOTAL SCORE");
        // Display the top 3 students
        for (Student student : students) {
            if (rank <= 3) {
                System.out.printf("%-7d %-12s %-10s %-20s %15f%n", rank, student.rollNumber, student.formNumber, student.name, student.totalScore);
                rank++;
            } else {
                break;
            }
        }
        System.out.println("-----------------------------------------------------------------------------");*/
    }

    // Method to calculate total merit score
    static double calculateTotalScore(Student student) {
        double ttestMarks = 30, tinterviewMarks = 10;
        double matricWeightage = (student.matricMarks / student.tmatricmarks) * 0.1;
        double fscWeightage = (student.fscMarks / student.tfsc) * 0.5;
        double testWeightage = (student.testMarks / ttestMarks) * 0.3;
        double interviewWeightage = (student.interviewMarks / tinterviewMarks) * 0.1;
        return (matricWeightage * 100) + (fscWeightage * 100) + (testWeightage * 100) + (interviewWeightage * 100);
    }

    // This method is triggered when the form is submitted, you can add the Student object to the list.
    /*static void submitForm(String formNumber, String name, String fatherName, float matricMarks, float fscMarks, float tMatricMarks, float tFscMarks) {
        String rollNumber = rollNumberCounter++ + "/BS/CS/23";
        Student student = new Student(formNumber, name, fatherName, matricMarks, fscMarks, tMatricMarks, tFscMarks, rollNumber);
        students.add(student);
        JOptionPane.showMessageDialog(null, "Form submitted successfully! Roll Number: " + rollNumber, "Success", JOptionPane.INFORMATION_MESSAGE);
    }*/

    // Method to update test and interview scores
    static void updateTestInterviewScores(String formNumber, float testScore, float interviewScore) {
        for (Student student : students) {
            if (student.formNumber.equals(formNumber)) {
                student.testMarks = testScore;
                student.interviewMarks = interviewScore;
                // Calculate total score after updating marks
                student.totalScore = (float) calculateTotalScore(student);
                JOptionPane.showMessageDialog(null, "Test and Interview scores updated successfully!\nTotal Score: " + student.totalScore, "Success", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Student not found for Form Number: " + formNumber, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
