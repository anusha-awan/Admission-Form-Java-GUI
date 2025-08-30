//*************************************
//                   IMPORT FILES
//**************************************

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//********************************************
//                   Classes Used
//                  *class Student
//                *class BSCSAdmissionProgram
//*******************************************

/*
class Student {                                 //class 1
    // Attributes
    String formNumber;
    String name;
    String fatherName;
    float matricMarks;
    float tmatricmarks;
    float tfsc;
    float fscMarks;
    float testMarks;
    float interviewMarks;
    float totalScore;
    boolean isEligible;
    String rollNumber;

//*************************************
//                   CONSTRUCTOR
//**************************************


    public Student(String formNumber, String name, String fatherName, float matricMarks,
                   float fscMarks, float tmatricmarks, float tfsc, String rollNumber) {
        this.formNumber = formNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.matricMarks = matricMarks;
        this.fscMarks = fscMarks;
        this.testMarks = 0;
        this.interviewMarks = 0;
        this.isEligible = false;
        this.totalScore = 0;
        this.tfsc = tfsc;
        this.tmatricmarks = tmatricmarks;
        this.rollNumber = rollNumber;
    }
}*/

class BSCSAdmissionProgram {                         //class 2

    //STATIC ATTRIBUTES
    //* static ArrayList<Student> students
    //* static Scanner scanner
    //* roll Number Counter

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int rollNumberCounter = 1;

//*************************************
//                   ANSI Escape Code
//                  (to add colour)
//**************************************


    static String Black = "\u001b[30m";
    static String Red = "\u001b[31m";
    static String Green = "\u001b[32m";
    static String Yellow = "\u001b[33m";
    static String Blue = "\u001b[34m";
    static String Magenta = "\u001b[35m";
    static String Cyan = "\u001b[36m";
    static String White = "\u001b[37m";
    static String BrightBlack = "\u001b[30;1m";
    static String BrightRed = "\u001b[31;1m";
    static String BrightGreen = "\u001b[32;1m";
    static String BrightYellow = "\u001b[33;1m";
    static String BrightBlue = "\u001b[34;1m";
    static String BrightMagenta = "\u001b[35;1m";
    static String BrightCyan = "\u001b[36;1m";
    static String BrightWhite = "\u001b[37;1m";
    static String Reset = "\u001b[0m";

    static String BackgroundBlack = "\u001b[40m";
    static String BackgroundRed = "\u001b[41m";
    static String BackgroundGreen = "\u001b[42m";
    static String BackgroundYellow = "\u001b[43m";
    static String BackgroundBlue = "\u001b[44m";
    static String BackgroundMagenta = "\u001b[45m";
    static String BackgroundCyan = "\u001b[46m";
    static String BackgroundWhite = "\u001b[47m";
    static String BackgroundBrightBlack = "\u001b[40;1m";
    static String BackgroundBrightRed = "\u001b[41;1m";
    static String BackgroundBrightGreen = "\u001b[42;1m";
    static String BackgroundBrightYellow = "\u001b[43;1m";
    static String BackgroundBrightBlue = "\u001b[44;1m";
    static String BackgroundBrightMagenta = "\u001b[45;1m";
    static String BackgroundBrightCyan = "\u001b[46;1m";
    static String BackgroundBrightWhite = "\u001b[47;1m";





//**************************************
//                  STATIC  METHODS
//************************************
    /*public static void main(String[] args)
    static void formEntry()
    static void testScoreEntry()
    static void displayTestList()
    static void displayFinalMeritList()
    static double calculateTotalScore(Student student)
    Functions (Methods)*/

    public static void main(String[] args) {                            //function1
        System.out.println(Yellow+ "\t\t\t--------------------------------------------------------"+Reset);
        System.out.println(Green+"\t\t\t*************BSCS Admission Program*********************"+Reset);
        System.out.println(Yellow+"\t\t\t--------------------------------------------------------"+Reset);
        while (true) {

            System.out.println(BrightYellow+"\t1. Form Entry"+Reset);
            System.out.println(BrightYellow+"\t2. Display Test List"+Reset);
            System.out.println(BrightYellow+"\t3. Test/Interview Score Entry"+Reset);
            System.out.println(BrightYellow+"\t4. Display Final Merit List"+Reset);
            System.out.println(BrightYellow+"\t5. Exit"+Reset);
            System.out.print("\tChoose an option: ");
            int option =scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    formEntry();
                    break;
                case 2:
                    displayTestList();
                    break;
                case 3:
                    testScoreEntry();
                    break;
                case 4:
                    displayFinalMeritList();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println(Red+"Invalid option. Please choose again."+Reset);
                    System.out.println("-----------------------------------------------------------------------------");
            }
        }
    }
// Method to enter student form details
// **************************************
//                 FUNCTIONS
//***************************************
    //1. main(String[] args)
    //2. formEntry()
    //3. testScoreEntry()
    //4. displayTestList()
    //3. testScoreEntry()
    //4. displayTestList()
    //5. displayFinalMeritList()
    //6. calculateTotalScore(Student student)



    static void formEntry() {                           //function2
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print(Cyan+"Enter form number: "+Reset);
        String formNumber = scanner.nextLine();

        System.out.print(Cyan+"Enter full name: "+Reset);
        String name = scanner.nextLine();

        System.out.print(Cyan+"Enter father's name: "+Reset);
        String fatherName = scanner.nextLine();

        System.out.print(Cyan+"Enter total matric marks (out of 1100/1150/1200): "+Reset);
        float tmatricmarks = scanner.nextFloat();

        System.out.print(Cyan+"Enter matric marks: ");
        float matricMarks = scanner.nextFloat();

        System.out.print(Cyan+"Enter total FSc marks (out of 1100/1150/1200): "+Reset);
        float tfsc = scanner.nextFloat();

        System.out.print(Cyan+"Enter FSc marks: "+Reset);
        float fscMarks = scanner.nextFloat();

        //scanner.nextLine();

        // Check eligibility (FSc percentage >= 50%)
        double fscPercentage = (fscMarks / tfsc) * 100;
        if (fscPercentage >= 50) {
            String rollNumber = (rollNumberCounter++) + BrightYellow+ "/BS/CS/23" + Reset;
            Student student = new Student(formNumber, name, fatherName, matricMarks, fscMarks, tmatricmarks, tfsc, rollNumber);
            students.add(student);
            System.out.println(BrightGreen+"Student is eligible for the entry test examination. Form submitted successfully."+Reset +
                    Cyan+ "\n |Your Roll Number| : "+ Reset + BrightYellow + rollNumber + Reset);
            student.isEligible = true;
            System.out.println("-----------------------------------------------------------------------------");
        } else {
            System.out.println(Red+"Student is not eligible for admission (intermediate marks are less than 50%)."+Reset);
            System.out.println("-----------------------------------------------------------------------------");
        }
    }

    // Method to enter test scores
    static void testScoreEntry() {                                      //function3
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print(Cyan+"Enter form number: "+Reset);
        String formNumber = scanner.nextLine();
        for (Student student : students) {
            if (student.formNumber .equals(formNumber)) {
                System.out.print(Cyan+"Enter test marks (out of 30): "+Reset);
                float testMarks = scanner.nextFloat();

                System.out.print(Cyan+"Enter interview marks (out of 10): "+Reset);
                float interviewMarks = scanner.nextFloat();

                student.testMarks = testMarks;
                student.interviewMarks = interviewMarks;

                student.totalScore = (float) calculateTotalScore(student);
                student.isEligible = true;
                System.out.println(BrightGreen+"Test score updated successfully."+Reset);
                System.out.println("-----------------------------------------------------------------------------");
                return;
            }
        }
        System.out.println(Red+"Student not found."+Reset);
        System.out.println("-----------------------------------------------------------------------------");
    }

    // Method to display students eligible for the test
    static void displayTestList() {                                               //function4
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Eligible Candidates for Entry Test:");
        System.out.println(BrightRed+"Form.No   Roll.No      StudentName"+Reset);
        for (Student student : students) {
            if (student.isEligible) {
                System.out.println(student.formNumber+ "        " +BrightYellow + student.rollNumber + Reset
                        + "     " +  student.name);
            }
        }
        System.out.println("-----------------------------------------------------------------------------");
    }



    // Method to display final merit list
    static void displayFinalMeritList() {                                           //function5
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2)
            {
                return Double.compare(s2.totalScore, s1.totalScore);
            }
        });


        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(Red+"Final Merit List:"+Reset);
        int rank = 1;
        //System.out.println(Green + "RANK     ROLL.NO     FORM.NO       NAME            TOTAL SCORE" + Reset);
        System.out.printf("%-7s %-12s %-10s %-20s %s%n", "RANK", "ROLL.NO", "FORM.NO", "         NAMES       ", "TOTAL SCORE");
        for (Student student : students) {
            if (rank <= 3) {
                //System.out.println(BrightRed+rank + ".      " +BrightYellow+student.rollNumber+Reset + "      " + student.formNumber + "          "
                //      + BrightRed+student.name + Reset + "             " + student.totalScore);
                System.out.printf("%-7d %-12s %5s %21s" + " " + "%15f%n", rank, student.rollNumber, student.formNumber, student.name, student.totalScore);
                rank++;
            } else {
                break;
            }
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    // Method to calculate total merit score
    static double calculateTotalScore(Student student) {                                    //function6
        double ttestMarks = 30, tinterviewMarks = 10;
        double matricWeightage = (student.matricMarks / student.tmatricmarks) * 0.1;
        double fscWeightage = (student.fscMarks / student.tfsc) * 0.5;
        double testWeightage = (student.testMarks / ttestMarks) * 0.3;
        double interviewWeightage = (student.interviewMarks / tinterviewMarks) * 0.1;
        return (matricWeightage * 100) + (fscWeightage * 100) + (testWeightage * 100) + (interviewWeightage * 100);
    }
}


