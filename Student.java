
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
    // Getter for rollNumber
    public String getRollNumber() {
        return this.rollNumber;
    }
}
