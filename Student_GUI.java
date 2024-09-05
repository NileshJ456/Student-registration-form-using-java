import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Student_GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student_GUI 
{
    private JFrame frame1;
    private JPanel panel1;
    private JLabel lblid,lblDOB1,lblcoursename,lblstudentname1,lblDOE,lblcourseduration1,lbltuitionfee1,lblnoofmodules,lblnoofcrhours,lbldayspresent;
    private JTextField txtid,txtcoursename,txtstudentname1,txtcourseduration1,txttuitionfee1,txtnoofmodules,txtnoofcrhours,txtdayspresent;
    private JComboBox DOB1,DOB2,DOB3,DOE1,DOE2,DOE3;
    private JButton btn1a,btn1b,btnbook,btngrant,btndisplay1,btnclear1;

    private JFrame frame2;
    private JPanel panel2;
    private JLabel lblid1,lblDOB2,lblstudentname2,lblcourseduration2,lbltuitionfee2,lblremmodules,lblmonthsattend,lbldropout;
    private JTextField txtid1,txtstudentname2,txtcourseduration2,txttuitionfee2,txtnoofremmodules,txtnoofmonthsattend ;
    private JComboBox DOB4,DOB5,DOB6,DOD1,DOD2,DOD3;
    private JButton btn2a,btn2b,btndisplay2,btnpaybills,btnremove,btnclear2; 

    private JFrame frame;
    private JPanel panel;
    private JLabel lbltitle;
    private JButton mainbtn1,mainbtn2;

    private ArrayList<Student> arrayList = new ArrayList<>();
    private ArrayList<Student> arrayList1 = new ArrayList<>();

    public Student_GUI(){
        frame= new JFrame("Student GUI");

        panel= new JPanel();
        panel.setBackground(Color.decode("#54ADEA"));
        panel.setLayout(null);
        frame.add(panel);

        lbltitle= new JLabel("Student Registration Form");
        lbltitle.setBounds(123,37,454,76);
        lbltitle.setFont(new Font("Times New Roman",Font.BOLD,36));
        panel.add(lbltitle);

        frame1 = new JFrame("Regular GUI");

        panel1 = new JPanel();
        panel1.setBackground(Color.decode("#F75C52"));
        panel1.setLayout(null);
        frame1.add(panel1);

        lblid = new JLabel("Enrollment ID: ");
        lblDOB1 = new JLabel("Date Of Birth: ");
        lblcoursename = new JLabel("Course name: ");
        lblstudentname1 = new JLabel("Student name: "); 
        lblDOE  = new JLabel("Date Of Enrollment: ");
        lblcourseduration1  = new JLabel("Course Duration: ");
        lbltuitionfee1  = new JLabel("Tuition Fee: ");
        lblnoofmodules  = new JLabel("Number of Modules: ");
        lblnoofcrhours  = new JLabel("Number of Credit Hours: ");
        lbldayspresent  = new JLabel("Days Present: ");

        lblid.setBounds(44,62,93,20);
        lblDOB1.setBounds(44,115,89,20);
        lblcoursename.setBounds(44,168,92,20);
        lblstudentname1.setBounds(44,221,95,20);
        lblDOE.setBounds(44,274,131,20);
        lblcourseduration1.setBounds(44,327,107,20);
        lbltuitionfee1.setBounds(44,380,77,20);
        lblnoofmodules.setBounds(40,433,130,20);
        lblnoofcrhours.setBounds(40,486,156,20);
        lbldayspresent.setBounds(40,539,92,20);

        panel1.add(lblid);
        panel1.add(lblDOB1);
        panel1.add(lblcoursename);
        panel1.add(lblstudentname1);
        panel1.add(lblDOE);
        panel1.add(lblcourseduration1);
        panel1.add(lbltuitionfee1);
        panel1.add(lblnoofmodules);
        panel1.add(lblnoofcrhours);
        panel1.add(lbldayspresent);

        txtid = new JTextField();
        txtcoursename = new JTextField();
        txtstudentname1 = new JTextField();
        txtcourseduration1 = new JTextField();
        txttuitionfee1 = new JTextField();
        txtnoofmodules = new JTextField();
        txtnoofcrhours = new JTextField();
        txtdayspresent = new JTextField();

        txtid.setBounds(213,62,104,32);
        txtcoursename.setBounds(213,168,180,32);
        txtstudentname1.setBounds(213,221,180,32);
        txtcourseduration1.setBounds(213,327,180,32);
        txttuitionfee1.setBounds(213,380,180,32);
        txtnoofmodules.setBounds(213,433,42,32);
        txtnoofcrhours.setBounds(213,486,64,32);
        txtdayspresent.setBounds(213,539,64,32);

        panel1.add(txtid);
        panel1.add(txtcoursename);
        panel1.add(txtstudentname1);
        panel1.add(txtcourseduration1);
        panel1.add(txttuitionfee1);
        panel1.add(txtnoofmodules);
        panel1.add(txtnoofcrhours);
        panel1.add(txtdayspresent);

        String days[] = {"1","2","3","4","5","6","7","8","9","10"};
        DOB1 = new JComboBox(days);

        String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        DOB2 = new JComboBox(months);

        String years[] ={"2000","2001","2002","2003","2004","2005"};
        DOB3 = new JComboBox(years);

        DOB1.setBounds(213,115,51,32);
        DOB2.setBounds(264,115,63,32);
        DOB3.setBounds(327,115,66,32);

        panel1.add(DOB1);
        panel1.add(DOB2);
        panel1.add(DOB3);

        String day[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        DOE1 = new JComboBox(day);

        String month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        DOE2 = new JComboBox(month);

        String year[] ={"2018","2019","2020","2021","2022","2023"};
        DOE3 = new JComboBox(year);

        DOE1.setBounds(213,274,51,32);
        DOE2.setBounds(264,274,63,32);
        DOE3.setBounds(327,274,66,32);

        panel1.add(DOE1);
        panel1.add(DOE2);
        panel1.add(DOE3);

        btn1a = new JButton();
        btn1a.setBounds(213,590,83,32);
        btn1a.setText("Submit");
        panel1.add(btn1a);
        btn1a.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == btn1a)
                    {
                        Regular();
                    }
                }
            });

        btn1b = new JButton();
        btn1b.setBounds(500,750,173,32);
        btn1b.setText("Go back to Student GUI");
        panel1.add(btn1b);
        btn1b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    frame.setVisible(true);
                    frame1.setVisible(false);
                }
            });

        btnbook= new JButton();
        btngrant=new JButton();
        btndisplay1=new JButton();
        btnclear1=new JButton();

        btnbook.setBounds(209,651,120,38);
        btngrant.setBounds(369,651,131,38);
        btndisplay1.setBounds(49,651,120,38);
        btnclear1.setBounds(540,656,120,38);

        btnbook.setText("Book");
        btngrant.setText("Grant_Certificate");
        btndisplay1.setText("Display");
        btnclear1.setText("Clear");

        panel1.add(btnbook);
        panel1.add(btngrant);
        panel1.add(btndisplay1);
        panel1.add(btnclear1);

        btndisplay1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == btndisplay1)
                    {
                        Display1();
                    }
                }
            });

        btnclear1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == btnclear1)
                    {
                        Clear1();
                    }
                }
            });

        btngrant.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == btngrant)
                    {
                        grantcertificate();
                    }
                }
            });

        btnbook.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calculatepresentpercentage();
                }
            });    

        frame1.setSize(700,850);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(false);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainbtn1= new JButton();
        mainbtn1.setBounds(32,304,190,59);
        mainbtn1.setText("Go to Regular GUI");
        panel.add(mainbtn1);
        mainbtn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    frame1.setVisible(true);
                    frame.setVisible(false);
                }
            });

        frame2 = new JFrame("Dropout GUI");

        panel2 = new JPanel();
        panel2.setBackground(Color.decode("#42AB4C"));
        panel2.setLayout(null);
        frame2.add(panel2);

        lblid1 = new JLabel("Enrollment ID: ");
        lblDOB2 = new JLabel("Date Of Birth: ");
        lblstudentname2 = new JLabel("Student Name: ");
        lblcourseduration2 = new JLabel("Course Duration: ");
        lbltuitionfee2 = new JLabel("Tuition Fee: ");
        lblremmodules = new JLabel("Number Of Remaining Modules: ");
        lblmonthsattend = new JLabel("Number Of Months Attended: ");
        lbldropout = new JLabel("Date Of Dropout: ");

        lblid1.setBounds(58,59,89,20);
        lblDOB2.setBounds(58,117,89,20);
        lblstudentname2.setBounds(58,185,93,20);
        lblcourseduration2.setBounds(58,250,106,20);
        lbltuitionfee2.setBounds(58,315,77,20);
        lblremmodules.setBounds(58,380,204,20);
        lblmonthsattend.setBounds(58,445,185,20);
        lbldropout.setBounds(58,515,110,20);

        panel2.add(lblid1);
        panel2.add(lblDOB2);
        panel2.add(lblstudentname2);
        panel2.add(lblcourseduration2);
        panel2.add(lbltuitionfee2);
        panel2.add(lblremmodules);
        panel2.add(lblmonthsattend);
        panel2.add(lbldropout);

        txtid1 = new JTextField();
        txtstudentname2 = new JTextField();
        txtcourseduration2 = new JTextField();
        txttuitionfee2 = new JTextField();
        txtnoofremmodules = new JTextField();
        txtnoofmonthsattend = new JTextField();

        txtid1.setBounds(179,53,75,32);
        txtstudentname2.setBounds(179,179,180,32);
        txtcourseduration2.setBounds(177,243,84,32);
        txttuitionfee2.setBounds(151,307,119,32);
        txtnoofremmodules.setBounds(262,375,57,32);
        txtnoofmonthsattend.setBounds(262,441,57,32);

        panel2.add(txtid1);
        panel2.add(txtstudentname2);
        panel2.add(txtcourseduration2);
        panel2.add(txttuitionfee2);
        panel2.add(txtnoofremmodules);
        panel2.add(txtnoofmonthsattend);

        String dayss[] = {"1","2","3","4","5","6","7","8","9","10"};
        DOB4 = new JComboBox(days);

        String monthss[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        DOB5 = new JComboBox(months);

        String yearss[] ={"2000","2001","2002","2003","2004","2005"};
        DOB6 = new JComboBox(years);

        DOB4.setBounds(179,111,59,32);
        DOB5.setBounds(238,111,59,32);
        DOB6.setBounds(297,111,80,32);

        panel2.add(DOB4);
        panel2.add(DOB5);
        panel2.add(DOB6);

        String daysss[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
        DOD1 = new JComboBox(day);

        String monthsss[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        DOD2 = new JComboBox(month);

        String yearsss[] ={"2020","2021","2022","2003","2024","2025"};
        DOD3 = new JComboBox(year);

        DOD1.setBounds(172,503,60,32);
        DOD2.setBounds(232,503,59,32);
        DOD3.setBounds(291,503,80,32);

        panel2.add(DOD1);
        panel2.add(DOD2);
        panel2.add(DOD3);

        btn2a = new JButton();
        btn2a.setBounds(172,573,83,32);
        btn2a.setText("Submit");
        panel2.add(btn2a);
        btn2a.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == btn2a)
                    {
                        Dropout();
                    }
                }
            });

        btn2b = new JButton();
        btn2b.setBounds(500,710,172,32);
        btn2b.setText("Go back to Student GUI");
        panel2.add(btn2b);
        btn2b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    frame.setVisible(true);
                    frame2.setVisible(false);
                }
            });

        btndisplay2 =new JButton();
        btnpaybills = new JButton();
        btnremove = new JButton();
        btnclear2 = new JButton();

        btndisplay2.setBounds(61,638,120,43);
        btnpaybills.setBounds(216,638,120,43);
        btnremove.setBounds(371,638,120,43);
        btnclear2.setBounds(526,638,120,43);

        btndisplay2.setText("Display");
        btnpaybills.setText("Pay Bills");
        btnremove.setText("Remove");
        btnclear2.setText("Clear");

        panel2.add(btndisplay2);
        panel2.add(btnpaybills);
        panel2.add(btnremove);
        panel2.add(btnclear2);

        btndisplay2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == btndisplay2)
                    {
                        Display2();
                    }
                }
            });

        btnclear2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == btnclear2)
                    {
                        Clear2();
                    }
                }
            });

        btnpaybills.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == btnpaybills)
                    {
                        payBills();
                    }
                }
            });

        btnremove.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    if(e.getSource() == btnremove)
                    {
                        removeDropoutStudent();
                    }
                }
            });     

        frame2.setSize(700,800);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(false);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        mainbtn2 = new JButton();
        mainbtn2.setBounds(465,304,190,59);
        mainbtn2.setText("Go to Dropout GUI");
        panel.add(mainbtn2);
        mainbtn2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    frame2.setVisible(true);
                    frame.setVisible(false);
                }
            });

        frame.setSize(700,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    } 

    public void Regular() { 
        try{
            //Declaring variables
            int enrollmentId = Integer.parseInt(txtid.getText());
            String dateOfBirth = DOB1.getSelectedItem().toString() + "_" + (DOB2.getSelectedIndex() + 1) + "_" + DOB3.getSelectedItem().toString();
            String courseName = txtcoursename.getText();
            String studentName = txtstudentname1.getText();
            String dateOfEnrollment = DOE1.getSelectedItem().toString() + "_" + (DOE2.getSelectedIndex() + 1) + "_" + DOE3.getSelectedItem().toString();
            int courseDuration = Integer.parseInt(txtcourseduration1.getText());
            int tuitionFee = Integer.parseInt(txttuitionfee1.getText());
            int numOfModules = Integer.parseInt(txtnoofmodules.getText());
            int numOfCreditHours = Integer.parseInt(txtnoofcrhours.getText());
            double daysPresent = Double.parseDouble(txtdayspresent.getText());

            // Check for empty fields
            if (txtid.getText().isEmpty() || dateOfBirth.isEmpty() || courseName.isEmpty() || studentName.isEmpty() || dateOfEnrollment.isEmpty() || txtcourseduration1.getText().isEmpty() || txttuitionfee1.getText().isEmpty() || txtnoofmodules.getText().isEmpty() || txtnoofcrhours.getText().isEmpty() || txtdayspresent.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please fill all the fields!", "Alert", JOptionPane.WARNING_MESSAGE);
            } 
            else if (!courseName.matches("[a-zA-Z]+") || !studentName.matches("[a-zA-Z]+"))
            {
                JOptionPane.showMessageDialog(null, "Invalid inputs. Please enter valid inputs.", "Alert", JOptionPane.WARNING_MESSAGE);
            } 
            else {
                boolean registered = false;
                for (Student student : arrayList) {
                    if (student instanceof Regular)
                    {
                        if(student.getenrollmentID()== enrollmentId||student.getdateOfBirth()== dateOfBirth||student.getcourseName()== courseName||student.getstudentName()== studentName||student.getdateOfEnrollment()== dateOfEnrollment||student.getcourseDuration()== courseDuration||student.gettuitionFee()==tuitionFee)
                        { 
                            JOptionPane.showMessageDialog(null, "The student is already registered.", "Alert", JOptionPane.WARNING_MESSAGE);
                            registered = true;
                            break;
                        }
                    }
                }

                if (!registered) {
                    Regular obj = new Regular(enrollmentId, dateOfBirth, courseName, studentName, dateOfEnrollment, courseDuration, tuitionFee, numOfModules, numOfCreditHours, daysPresent); // Fixed variable name
                    arrayList.add(obj);
                    JOptionPane.showMessageDialog(null, "Thank you for registering.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }

                // Clear input fields
                txtid.setText("");
                DOB1.setSelectedIndex(0);
                DOB2.setSelectedIndex(0);
                DOB3.setSelectedIndex(0);
                txtcoursename.setText("");
                txtstudentname1.setText("");
                DOE1.setSelectedIndex(0);
                DOE2.setSelectedIndex(0);
                DOE3.setSelectedIndex(0);
                txtcourseduration1.setText("");
                txttuitionfee1.setText("");
                txtnoofmodules.setText("");
                txtnoofcrhours.setText("");
                txtdayspresent.setText("");
            }
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame1,"Please enter a valid value!!!", "Alert", JOptionPane.WARNING_MESSAGE);

        }

    }

    public void Display1()
    {
        StringBuilder output = new StringBuilder();
        for (Student student : arrayList) {
            if (student instanceof Regular) {
                Regular regularStudent = (Regular) student;
                output.append("Enrollment ID: ").append(regularStudent.getenrollmentID()).append("\n");
                output.append("Date of Birth: ").append(regularStudent.getdateOfBirth()).append("\n");
                output.append("Course Name: ").append(regularStudent.getcourseName()).append("\n");
                output.append("Student Name: ").append(regularStudent.getstudentName()).append("\n");
                output.append("Date of Enrollment: ").append(regularStudent.getdateOfEnrollment()).append("\n");
                output.append("Course Duration: ").append(regularStudent.getcourseDuration()).append(" months\n");
                output.append("Tuition Fee: Rs ").append(regularStudent.gettuitionFee()).append("\n");
                output.append("Number of Modules: ").append(regularStudent.getnumOfModules()).append("\n");
                output.append("Number of Credit Hours: ").append(regularStudent.getnumOfCreditHours()).append("\n");
                output.append("Days Present: ").append(regularStudent.getdaysPresent()).append("\n");
                output.append("\n");
            }
        }

        if (output.length() > 0) {
            JOptionPane.showMessageDialog(null, output.toString(), "Regular Students Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No regular students registered yet.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void calculatepresentpercentage(){
        //Calculate present percentage
        int enrollmentId = Integer.parseInt(txtid.getText());
        double daysPresent = Double.parseDouble(txtdayspresent.getText());

        Student student = findStudent(enrollmentId);
        if (student != null && student instanceof Regular) {
            Regular regularStudent = (Regular) student;
            double presentPercentage = regularStudent.calculatePresentPercentage(daysPresent);

            // Display information dialog
            JOptionPane.showMessageDialog(frame, "Present Percentage for Regular Student with ID " + enrollmentId + ":  " + presentPercentage + "%");
        } 
        else {
            JOptionPane.showMessageDialog(frame, "Invalid student ID: " + enrollmentId, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    //Helper method to calculate present percentage
    public Student findStudent(int enrollmentId) {
        for (Student student : arrayList) {
            if (student.getenrollmentID() == enrollmentId) {
                return student;
            }
        }
        return null;
    }

    public void grantcertificate(){
        int enrollmentId = Integer.parseInt(txtid.getText());
        String courseName = txtcoursename.getText();
        String dateOfEnrollment =  DOE1.getSelectedItem().toString() + "_" + (DOE2.getSelectedIndex() + 1) + "_" + DOE3.getSelectedItem().toString();

        Student student = findStudent(enrollmentId);
        if (student != null && student instanceof Regular) {
            Regular regularstudent = (Regular) student;
            regularstudent.grantCertificate(courseName,enrollmentId,dateOfEnrollment);

            // Display information dialog
            JOptionPane.showMessageDialog(frame, "Certificate granted to Regular Student with ID: " + enrollmentId);
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid student ID: " + enrollmentId, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Clear1(){
        txtid.setText("");
        DOB1.setSelectedIndex(0);
        DOB2.setSelectedIndex(0);
        DOB3.setSelectedIndex(0);
        txtcoursename.setText("");
        txtstudentname1.setText("");
        DOE1.setSelectedIndex(0);
        DOE2.setSelectedIndex(0);
        DOE3.setSelectedIndex(0);
        txtcourseduration1.setText("");
        txttuitionfee1.setText("");
        txtnoofmodules.setText("");
        txtnoofcrhours.setText("");
        txtdayspresent.setText("");
    }

    public void Dropout(){
        try{
            int enrollmentId = Integer.parseInt(txtid1.getText());
            String dateOfBirth = DOB4.getSelectedItem().toString() + "_" + (DOB5.getSelectedIndex() + 1) + "_" + DOB6.getSelectedItem().toString();
            String studentName = txtstudentname2.getText();
            int courseDuration = Integer.parseInt(txtcourseduration2.getText());
            int tuitionFee = Integer.parseInt(txttuitionfee2.getText());
            int numOfRemainingModules=  Integer.parseInt(txtnoofremmodules.getText());
            int numOfMonthsAttended=  Integer.parseInt(txtnoofmonthsattend.getText());
            String dateOfDropout= DOD1.getSelectedItem().toString() + "_" + (DOD2.getSelectedIndex() + 1) + "_" + DOD3.getSelectedItem().toString();

            // Check for empty fields
            if (txtid1.getText().isEmpty()||dateOfBirth.isEmpty() || studentName.isEmpty() ||dateOfDropout.isEmpty()|| txtcourseduration2.getText().isEmpty() || txttuitionfee2.getText().isEmpty() || txtnoofremmodules.getText().isEmpty() || txtnoofmonthsattend.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please fill all the fields!!", "Alert", JOptionPane.WARNING_MESSAGE);
            } 
            else if (!studentName.matches("[a-zA-Z]+"))
            {
                JOptionPane.showMessageDialog(null, "Invalid inputs. Please enter valid inputs.", "Alert", JOptionPane.WARNING_MESSAGE);
            } 
            else {
                boolean registered = false;
                for (Student student : arrayList1) {
                    if (student instanceof Dropout)
                    {
                        Dropout dropoutstudent = (Dropout) student;
                        if(dropoutstudent.getenrollmentID()== enrollmentId)
                        { 
                            JOptionPane.showMessageDialog(null, "The student is already registered.", "Alert", JOptionPane.WARNING_MESSAGE);
                            registered = true;
                            break;
                        }
                    }
                }

                if (!registered) {
                    Dropout obj = new Dropout(enrollmentId,dateOfBirth,studentName,courseDuration,tuitionFee ,numOfRemainingModules ,numOfMonthsAttended,dateOfDropout);
                    arrayList1.add(obj);
                    JOptionPane.showMessageDialog(null, "Thank you for registering.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }

                // Clear input fields
                txtid1.setText("");
                DOB4.setSelectedIndex(0);
                DOB5.setSelectedIndex(0);
                DOB6.setSelectedIndex(0);
                txtstudentname2.setText("");
                txtcourseduration2.setText("");
                txttuitionfee2.setText("");
                txtnoofremmodules.setText("");
                txtnoofmonthsattend.setText("");
                DOD1.setSelectedIndex(0);
                DOD2.setSelectedIndex(0);
                DOD3.setSelectedIndex(0);
            }
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame1,"Please enter a valid value!!!", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void Display2(){
        StringBuilder show = new StringBuilder();
        for (Student student1 : arrayList1) {
            if (student1 instanceof Dropout) {
                Dropout dropoutStudent = (Dropout) student1;
                show.append("Enrollment Id: ").append(dropoutStudent.getenrollmentID()).append("\n");
                show.append("Date of Birth: ").append(dropoutStudent.getdateOfBirth()).append("\n");
                show.append("Student Name: ").append(dropoutStudent.getstudentName()).append("\n");
                show.append("Date of Dropout: ").append(dropoutStudent.getdateOfDropout()).append("\n");
                show.append("Course Duration: ").append(dropoutStudent.getcourseDuration()).append("\n");
                show.append("Tuition Fee: Rs ").append(dropoutStudent.gettuitionFee()).append("\n");
                show.append("Number Of Remaining Modules: ").append(dropoutStudent.getnumOfRemainingModules()).append("\n");
                show.append("Number Of Months Attended: ").append(dropoutStudent.getnumOfMonthsAttended()).append(" months\n");
                show.append("\n");
            }
        }

        if (show.length() > 0) {
            JOptionPane.showMessageDialog(null, show.toString(), "Dropout Students Information", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            JOptionPane.showMessageDialog(null, "No dropout students registered yet.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void Clear2(){
        //Clear input fields
        txtid1.setText("");
        DOB4.setSelectedIndex(0);
        DOB5.setSelectedIndex(0);
        DOB6.setSelectedIndex(0);
        txtstudentname2.setText("");
        txtcourseduration2.setText("");
        txttuitionfee2.setText("");
        txtnoofremmodules.setText("");
        txtnoofmonthsattend.setText("");
        DOD1.setSelectedIndex(0);
        DOD2.setSelectedIndex(0);
        DOD3.setSelectedIndex(0);
    }

    public void payBills() {
        int enrollmentId = Integer.parseInt(txtid1.getText());

        // Assuming you have a method to search for student by enrollment ID
        Dropout dropoutStudent = findDropoutStudent(enrollmentId);

        if (dropoutStudent != null) {
            dropoutStudent.billsPayable();

            JOptionPane.showMessageDialog(frame2, "Bills paid for Dropout student with Enrollment ID: " + enrollmentId,"Payment Successful",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame2,"No Dropout student found with Enrollment ID: " + enrollmentId,"Payment Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    private Dropout findDropoutStudent(int enrollmentId) {
        for (Student student : arrayList1) {
            if (student instanceof Dropout && student.getenrollmentID()== enrollmentId) {
                return (Dropout) student;
            }
        }
        return null;
    }

    public void removeDropoutStudent() {
        String enrollmentIdInput = JOptionPane.showInputDialog(null, "Enter Enrollment ID to remove student:", "Remove Student", JOptionPane.QUESTION_MESSAGE);

        if (enrollmentIdInput != null && !enrollmentIdInput.isEmpty()) {
            int enrollmentIdToRemove = Integer.parseInt(enrollmentIdInput);
            boolean removed = false;

            for (Iterator<Student> iterator = arrayList1.iterator(); iterator.hasNext();) {
                Student student = iterator.next();
                if (student instanceof Dropout) {
                    Dropout dropoutStudent = (Dropout) student;

                    if (dropoutStudent.getenrollmentID() == enrollmentIdToRemove) {
                        iterator.remove();
                        removed = true;
                        break;
                    }
                }
            }

            if (removed) {
                JOptionPane.showMessageDialog(null, "Student removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Enrollment ID or student not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid Enrollment ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Create an instance of your Student_GUI class
        Student_GUI studentGUI = new Student_GUI();
    }
}

