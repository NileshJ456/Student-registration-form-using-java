/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    //Declaring attributes
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int enrollmentID;
    private int courseDuration;
    private int tuitionFee;
    //constructor
    public Student(String dateOfBirth,String studentName,int courseDuration,int tuitionFee){
        this.dateOfBirth=dateOfBirth;
        this.studentName=studentName;
        this.courseDuration=courseDuration;
        this.tuitionFee=tuitionFee;
        this.courseName=" ";
        this.dateOfEnrollment=" ";
        this.enrollmentID=0;
    }
    //corresponding accessor method.
    public String getdateOfBirth() {
        return this.dateOfBirth;
    }
    public String getcourseName() {
        return this.courseName;
    }
    public String getstudentName() {
        return this.studentName;
    }
    public String getdateOfEnrollment() {
        return this.dateOfEnrollment;
    }
    public int getenrollmentID() {
        return this.enrollmentID;
    }
    public int getcourseDuration() {
        return this.courseDuration;
    }
    public int gettuitionFee() {
        return this.tuitionFee;
    }
    //setter method
    public void setcourseName(String value) {
        this.courseName=value;
    }
    public void setenrollmentID(int number) {
        this.enrollmentID=number;
    }
    //setter method for class dropout
     public void setdateOfBirth(String value){
        this.dateOfBirth=value;
    }
    public void setstudentName(String value){
        this.studentName=value;
    }
    public void setcourseDuration(int number){
        this.courseDuration=number;
    }
    public void settuitionFee(int number){
        this.tuitionFee=number;
    }
    //mutator method
    public void setdateOfEnrollment(String value) {
        this.dateOfEnrollment=value;
    }
    //display
    public void display(){
        if(enrollmentID==0||dateOfBirth==""||courseName==""||studentName==""||dateOfEnrollment==""||courseDuration==0||tuitionFee==0){
            System.out.println("All paramaters have not been set properly.");
        }
        else
        System.out.println("enrollmentId= "+this.enrollmentID);
        System.out.println("dateOfBirth= "+this.dateOfBirth);
        System.out.println("courseName= "+this.courseName);
        System.out.println("studentName= "+this.studentName);
        System.out.println("yearsEnrolled= "+this.dateOfEnrollment);
        System.out.println("courseDuration= "+this.courseDuration);
        System.out.println("tuitionFee= "+this.tuitionFee);
    } 
}
