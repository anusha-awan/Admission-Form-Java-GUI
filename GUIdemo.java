import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUIdemo extends JFrame {

    public GUIdemo() {
        // Frame settings
        ImageIcon image = new ImageIcon("C:\\Users\\KhanHouse\\Desktop\\GCU\\SEM 3\\OOPS - SS\\ASSIGNMENTS\\oops project - Copy\\6440-BS-SE-23\\src");
        this.setTitle("BSCS ADMISSION SYSTEM");
        this.setSize(800, 670);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(3, 50, 53));
        this.setResizable(false);

        this.setVisible(true);
        // Main panel with CardLayout
        JPanel mainPanel = new JPanel(new CardLayout());
        this.add(mainPanel);

        // Start panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(0, 0, 3));   //3,50,50 tealgreen

        JLabel label = new JLabel("GCU Admission Management System", SwingConstants.CENTER);
        label.setBounds(50, 20, 700, 60);
        label.setFont(new Font("Algerian", Font.BOLD, 25));
        label.setForeground(new Color(255, 255, 255));
        panel.add(label);

        JButton button = new JButton("1. Enter Form");
        button.setBounds(260, 120, 233, 45);
        button.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button.setBackground(new Color(179, 255, 229));
        panel.add(button);

        JButton button2 = new JButton("2. Test Candidate List");
        button2.setBounds(260, 180, 233, 45);
        button2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button2.setBackground(new Color(179, 255, 229));
        panel.add(button2);

        JButton button3 = new JButton("3. Enter Test/Interview Marks");
        button3.setBounds(260, 240, 233, 45);
        button3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button3.setBackground(new Color(179, 255, 229));
        panel.add(button3);

        JButton button4 = new JButton("4. Final Merit List");
        button4.setBounds(260, 300, 233, 45);
        button4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button4.setBackground(new Color(179, 255, 229));
        panel.add(button4);

        JButton button5 = new JButton("5. Exit");
        button5.setBounds(260, 360, 233, 45);
        button5.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button5.setBackground(new Color(179, 255, 229));
        panel.add(button5);
        //START OF FORM PANEL
//----------------------------------------------------------------------------------------------------
        // Form entry panel
        JPanel formentrypanel = new JPanel();
        formentrypanel.setLayout(null);
        formentrypanel.setBackground(new Color(0, 0, 3));           //3,50,53

//REGISTER BOX
        JLabel registerlabel = new JLabel("REGISTER YOURSELF", SwingConstants.CENTER);
        registerlabel.setBounds(100, 20, 500, 50);
        registerlabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        registerlabel.setForeground(new Color(255, 255, 0));
        formentrypanel.add(registerlabel);

//FORM no:
        JTextField formnoField = new JTextField();
        formnoField.setText("Enter form Number");
        formnoField.setBounds(200, 70, 300, 32);            //370, 50, 220, 30
        formnoField.setBackground(new Color(179, 255, 229));
        formentrypanel.add(formnoField);
        formnoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formnoField.setText("");
            }
        });
//NAME

        JTextField nameField = new JTextField("Enter your name");
        nameField.setBounds(200, 120, 300, 32);
        nameField.setBackground(new Color(179, 255, 229));
        formentrypanel.add(nameField);
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameField.setText("");
            }
        });

//FatherName
        JTextField fathernameField = new JTextField("Enter Father Name");
        fathernameField.setBounds(200, 170, 300, 32);
        fathernameField.setBackground(new Color(179, 255, 229));
        formentrypanel.add(fathernameField);

        fathernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fathernameField.setText("");
            }
        });

//text field for marks matric
        JTextField tmatricmarksField = new JTextField("Enter total matric marks (out of 1100/1200/1250)");
        tmatricmarksField.setBounds(200, 220, 300, 32);
        tmatricmarksField.setBackground(new Color(179, 255, 229));
        formentrypanel.add(tmatricmarksField);
        tmatricmarksField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tmatricmarksField.setText("");
            }
        });

        JTextField matricmarksField = new JTextField("Enter obtain matric marks ");
        matricmarksField.setBounds(200, 270, 300, 32);
        matricmarksField.setBackground(new Color(179, 255, 229));
        formentrypanel.add(matricmarksField);
        matricmarksField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                matricmarksField.setText("");
            }
        });

//text field for fsc marks
        JTextField tfscmarksField = new JTextField("Enter total fsc marks (out of 1100/1200/1250) ");
        tfscmarksField.setBounds(200, 320, 300, 32);
        tfscmarksField.setBackground(new Color(179, 255, 229));
        formentrypanel.add(tfscmarksField);
        tfscmarksField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfscmarksField.setText("");
            }
        });

        JTextField fscmarksField = new JTextField("Enter obtain fsc marks ");
        fscmarksField.setBounds(200, 370, 300, 32);
        fscmarksField.setBackground(new Color(179, 255, 229));
        formentrypanel.add(fscmarksField);
        fscmarksField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fscmarksField.setText("");
            }
        });

        JButton submitbutton1 = new JButton("SUBMIT FORM");
        submitbutton1.setBounds(260, 420, 180, 25);
        submitbutton1.setFont(new Font("Arial Black", Font.BOLD, 14));
        submitbutton1.setBackground(new Color(255, 255, 0));
        formentrypanel.add(submitbutton1);

        JButton Prevbutton1 = new JButton("<<PREV");
        Prevbutton1.setBounds(10, 10, 150, 30);
        Prevbutton1.setBackground(new Color(255, 255, 255));
        Prevbutton1.setFont(new Font("Arial Black", Font.BOLD, 14));
        formentrypanel.add(Prevbutton1);
//------------------------------------------------------------------------------------------- 1 PANEL COMPLETE


        //2ND PANEL
        JPanel scoreentrypanel = new JPanel();
        scoreentrypanel.setLayout(null);
        scoreentrypanel.setBackground(new Color(0, 0, 3));           //3,50,53

        JLabel scorelabel = new JLabel("UPDATE SCORE");
        scorelabel.setBounds(300, 60, 500, 50);
        scorelabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        scorelabel.setForeground(new Color(255, 255, 0));
        scoreentrypanel.add(scorelabel);

        JTextField testformnoField = new JTextField();
        testformnoField.setText("Enter your form number");
        testformnoField.setBounds(210, 120, 350, 42);
        testformnoField.setBackground(new Color(179, 255, 229));
        scoreentrypanel.add(testformnoField);
        testformnoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                testformnoField.setText("");
            }
        });

        JTextField testscoreField = new JTextField();
        testscoreField.setText("Enter test score (out of 30)");
        testscoreField.setBounds(210, 180, 350, 42);            //370, 50, 220, 30
        testscoreField.setBackground(new Color(179, 255, 229));
        scoreentrypanel.add(testscoreField);
        testscoreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                testscoreField.setText("");
            }
        });

        JTextField interviewscoreField = new JTextField();
        interviewscoreField.setText("Enter interview results (out of 10)");
        interviewscoreField.setBounds(210, 235, 350, 42);
        interviewscoreField.setBackground(new Color(179, 255, 229));
        scoreentrypanel.add(interviewscoreField);

        JButton submitbutton2 = new JButton("SUBMIT SCORE");
        submitbutton2.setBounds(290, 315, 200, 25);
        submitbutton2.setFont(new Font("Arial Black", Font.BOLD, 14));
        submitbutton2.setBackground(new Color(255, 255, 0));
        scoreentrypanel.add(submitbutton2);
        interviewscoreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                interviewscoreField.setText("");
            }
        });
        JButton Prevbutton2 = new JButton("<<PREV");
        Prevbutton2.setBounds(10, 10, 150, 30);
        Prevbutton2.setBackground(new Color(255, 255, 255));
        Prevbutton2.setFont(new Font("Arial Black", Font.BOLD, 14));
        scoreentrypanel.add(Prevbutton2);
//----------------------------------------------------------------------------------------------- panel2 complete
        //panel 3
        // Test Candidate List Panel
        JPanel testCandidateListPanel = new JPanel();
        testCandidateListPanel.setLayout(new BorderLayout());
        testCandidateListPanel.setBackground(new Color(0, 0, 3));

        JLabel candidateListLabel = new JLabel("Test Candidate List", SwingConstants.CENTER);
        candidateListLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        candidateListLabel.setForeground(new Color(255, 255, 0));
        testCandidateListPanel.add(candidateListLabel, BorderLayout.NORTH);

// Text Area to Display Student Details
        JTextArea studentListArea = new JTextArea();
        studentListArea.setEditable(false);
        studentListArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        studentListArea.setBackground(new Color(179, 255, 229));
        testCandidateListPanel.add(new JScrollPane(studentListArea), BorderLayout.CENTER);

        JButton prevButton3 = new JButton("<<PREV");
        prevButton3.setFont(new Font("Arial Black", Font.BOLD, 14));
        prevButton3.setBackground(new Color(255, 255, 255));
        testCandidateListPanel.add(prevButton3, BorderLayout.SOUTH);


        // Add panels to mainPanel
        mainPanel.add(panel, "Start");
        mainPanel.add(formentrypanel, "FormEntry");
        mainPanel.add(scoreentrypanel, "Score entry");
        mainPanel.add(testCandidateListPanel, "TestCandidateList");
        // CardLayout navigation
        CardLayout cl = (CardLayout) (mainPanel.getLayout());

        button.addActionListener(e -> cl.show(mainPanel, "FormEntry"));
        button3.addActionListener(e -> cl.show(mainPanel, "Score entry"));
        button5.addActionListener(e -> System.exit(0));

        Prevbutton1.addActionListener(e -> cl.show(mainPanel, "Start"));
        Prevbutton2.addActionListener(e -> cl.show(mainPanel, "Start"));
        prevButton3.addActionListener(e -> cl.show(mainPanel, "Start"));
        submitbutton1.addActionListener(e -> {
            // Capture form data from the text fields
            String formNumber = formnoField.getText();
            String name = nameField.getText();
            String fatherName = fathernameField.getText();
            float tMatricMarks;
            float matricMarks;
            float tFscMarks;
            float fscMarks;

            try {
                // Parse numeric values
                tMatricMarks = Float.parseFloat(tmatricmarksField.getText());
                matricMarks = Float.parseFloat(matricmarksField.getText());
                tFscMarks = Float.parseFloat(tfscmarksField.getText());
                fscMarks = Float.parseFloat(fscmarksField.getText());

                // Perform eligibility check (FSc percentage >= 50%)
                double fscPercentage = (fscMarks / tFscMarks) * 100;
                if (fscPercentage >= 50) {
                    // Create a new student and add to the list
                    String rollNumber = menutools1.rollNumberCounter++ + "/BS/CS/23";
                    Student student = new Student(formNumber, name, fatherName, matricMarks, fscMarks, tMatricMarks, tFscMarks, rollNumber);
                    menutools1.students.add(student);

                    // Show success message
                    JOptionPane.showMessageDialog(this, "Form submitted successfully! Roll Number: " + rollNumber,
                            "Success", JOptionPane.INFORMATION_MESSAGE);


                    // Clear the form fields
                    formnoField.setText("Enter form Number");
                    nameField.setText("Enter your name");
                    fathernameField.setText("Enter Father Name");
                    tmatricmarksField.setText("Enter total matric marks (out of 1100/1200/1250)");
                    matricmarksField.setText("Enter obtain matric marks");
                    tfscmarksField.setText("Enter total fsc marks (out of 1100/1200/1250)");
                    fscmarksField.setText("Enter obtain fsc marks");

                    // Return to main screen
                    cl.show(mainPanel, "Start");

                } else {
                    // Show eligibility failure message
                    JOptionPane.showMessageDialog(this, "Student is not eligible (FSc marks < 50%).",
                            "Eligibility Check Failed", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                // Handle invalid number input
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values for marks.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });


/*
        submitbutton1.addActionListener(e -> {
            try {
                // Capture form data
                String formNumber = formnoField.getText().trim();
                String name = nameField.getText().trim();
                String fatherName = fathernameField.getText().trim();
                float tMatricMarks = Float.parseFloat(tmatricmarksField.getText().trim());
                float matricMarks = Float.parseFloat(matricmarksField.getText().trim());
                float tFscMarks = Float.parseFloat(tfscmarksField.getText().trim());
                float fscMarks = Float.parseFloat(fscmarksField.getText().trim());

                // Validate inputs
                if (formNumber.isEmpty() || name.isEmpty() || fatherName.isEmpty() ||
                        tMatricMarks <= 0 || matricMarks <= 0 || tFscMarks <= 0 || fscMarks <= 0) {
                    throw new IllegalArgumentException("Please fill all fields with valid data.");
//                    JOptionPane.showMessageDialog(this,"Please fill all fields with valid data", "Missing Field"
//                            ,JOptionPane.INFORMATION_MESSAGE);
                }

                // Check eligibility
                //*double fscPercentage = (fscMarks / tFscMarks) * 100;
                //if (fscPercentage >= 50) {
                //*    // Generate roll number
                String rollNumber = menutools1.rollNumberCounter++ + "/BS/CS/23";

                // Create and store the student
                Student student = new Student(formNumber, name, fatherName, matricMarks, fscMarks, tMatricMarks, tFscMarks, rollNumber);
                menutools1.students.add(student);

                // Success message
                JOptionPane.showMessageDialog(this, "Form submitted successfully! Roll Number: " + rollNumber,
                        "Success", JOptionPane.INFORMATION_MESSAGE);

                // Clear the form fields
                formnoField.setText("Enter form Number");
                nameField.setText("Enter your name");
                fathernameField.setText("Enter Father Name");
                tmatricmarksField.setText("Enter total matric marks (out of 1100/1200/1250)");
                matricmarksField.setText("Enter obtain matric marks");
                tfscmarksField.setText("Enter total fsc marks (out of 1100/1200/1250)");
                fscmarksField.setText("Enter obtain fsc marks");

                // Return to main screen
                cl.show(mainPanel, "Start");
                */
/*} else {
                    // Eligibility failure
                    JOptionPane.showMessageDialog(this, "Student is not eligible (FSc marks < 50%).",
                            "Eligibility Check Failed", JOptionPane.ERROR_MESSAGE);
                *//*

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input! Please enter numeric values where required.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),
                        "Input Error", JOptionPane.WARNING_MESSAGE);
            }
        });

*/

        button2.addActionListener(e -> {
            // Populate the student list
            StringBuilder studentList = new StringBuilder("Form No.           | Name                   | Roll Number \n");
            studentList.append("-------------------------------------------------------------------------------------------\n");
            for (Student student : menutools1.students) {
                // Check if the student object is valid and the roll number is correctly initialized
                if (student != null && student.getRollNumber() != null) {
                    studentList.append(String.format("%-9s   \t |%-19s         | %-28s\n",
                            student.formNumber, student.name, student.getRollNumber()));
                } else {
                    studentList.append(String.format("%-8s     |   %-16s    | %-23s\n",
                            student.formNumber, student.name, "N/A"));
                }
            }
            // Set the background color of the text area to black
            studentListArea.setText(studentList.toString());
            studentListArea.setBackground(new Color(3, 50, 53));  // Setting the background color to black
            studentListArea.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
            studentListArea.setForeground(new Color(255, 255, 255));  // Setting the text color to white for contrast


            cl.show(mainPanel, "TestCandidateList");
        });
        submitbutton2.addActionListener(e -> {
            try {
                // Retrieve form number, test score, and interview score
                String formNumber2 = testformnoField.getText().trim();
                float testscore = Float.parseFloat(testscoreField.getText().trim());
                float interviewscore = Float.parseFloat(interviewscoreField.getText().trim());

                // Validate inputs
                if (formNumber2.isEmpty() || testscore <= 0 || interviewscore <= 0) {
                    throw new IllegalArgumentException("Please fill all fields with valid data.");
                }

                // Find the student with the given form number
                Student student = null;
                for (Student s : menutools1.students) {
                    if (s.formNumber.equals(formNumber2)) {
                        student = s;
                        break;
                    }
                }

                // Check if student was found
                if (student == null) {
                    JOptionPane.showMessageDialog(this, "Student not found for Form Number: " + formNumber2,
                            "Student Not Found", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Update the student's test score and interview score
                student.testMarks = testscore;
                student.interviewMarks = interviewscore;

                // Calculate total score (adjust according to your requirements)
                student.totalScore = student.testMarks + student.interviewMarks;

                // Check eligibility: example criterion, adjust as per your logic
                //student.isEligible = (student.totalScore >= 40); // Adjust eligibility condition here

                // Provide feedback to the user
                JOptionPane.showMessageDialog(this, "Test and Interview scores updated successfully!\n" +
                                "Total Score: " + (student.totalScore + "\n"),
                        "Success", JOptionPane.INFORMATION_MESSAGE);

                // Clear input fields
                testformnoField.setText("Enter your form number");
                testscoreField.setText("Enter test score (out of 30)");
                interviewscoreField.setText("Enter interview results (out of 10)");

                // Return to main screen
                cl.show(mainPanel, "Start");

            } catch (NumberFormatException ex) {
                // Handle invalid number format
                JOptionPane.showMessageDialog(this, "Invalid input! Please enter numeric values where required.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                // Handle validation exception
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Input Error", JOptionPane.WARNING_MESSAGE);
            }
        });
        button4.addActionListener(e -> {
            if (menutools1.students.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No students available to display the merit list.", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Ask user for the number of students to display
                String input = JOptionPane.showInputDialog(null, "How many top students do you want to display?", "Input", JOptionPane.QUESTION_MESSAGE);

                if (input != null && !input.trim().isEmpty()) {
                    try {
                        int topStudents = Integer.parseInt(input.trim());

                        // Check if the number of students is greater than the available students
                        if (topStudents > menutools1.students.size()) {
                            JOptionPane.showMessageDialog(null, "There are not enough students to display. Maximum available: " + menutools1.students.size(), "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            // Prepare the merit list
                            StringBuilder meritList = new StringBuilder();
                            meritList.append("FINAL MERIT LIST:\n");
                            meritList.append("----------------------------------------------------------------------------------------------------------------------------\n");
                            meritList.append(String.format("%-7s \t%-23s %-16s %-37s %s%n", "RANK", "ROLL.NO", "FORM.NO", "     NAMES", "TOTAL SCORE (%)"));

                            // Calculate total scores and sort students
                            for (Student student : menutools1.students) {
                                student.totalScore = (float) menutools4.calculateTotalScore(student); // Calculate total score as a percentage
                            }

                            // Sort students by total score (descending)
                            menutools1.students.sort((s1, s2) -> Float.compare(s2.totalScore, s1.totalScore));

                            // Add only top students to the list
                            for (int i = 0; i < topStudents; i++) {
                                Student student = menutools1.students.get(i);
                                meritList.append(String.format("%-6d\t%-40s %-22s %-37s %18.2f%n",
                                        i + 1,
                                        student.rollNumber,
                                        student.formNumber,
                                        student.name,
                                        student.totalScore));
                            }

                            meritList.append("----------------------------------------------------------------------------------------------------------------------------\n");

                            // Display the merit list in a new JFrame
                            JFrame meritFrame = new JFrame("Merit List");
                            meritFrame.setSize(800, 600);
                            meritFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            meritFrame.setLayout(new BorderLayout());

                            JTextArea textArea = new JTextArea(meritList.toString());
                            textArea.setEditable(false);
                            textArea.setBackground(new Color(3, 50, 53));
                            textArea.setFont(new Font("Times New Roman", Font.BOLD, 16));
                            textArea.setForeground(new Color(255,255,255));
                            textArea.setMargin(new Insets(10, 10, 10, 10));

                            JScrollPane scrollPane = new JScrollPane(textArea);
                            meritFrame.add(scrollPane, BorderLayout.CENTER);

                            meritFrame.setVisible(true);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }}


