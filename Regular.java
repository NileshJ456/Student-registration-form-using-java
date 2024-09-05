/**
 * Write a description of class Regular here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Regular extends Student
{
    //declaring attributes
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    //constructor
    public Regular(int enrollmentID,String dateOfBirth,String courseName,String studentName,String dateOfEnrollment,int courseDuration,int tuitionFee,int numOfModules,int numOfCreditHours,double daysPresent)
    {
        //Call made to superclass constructor
        super(dateOfBirth,studentName,enrollmentID,tuitionFee);
        //call made to parent class mutator methods
        super.setdateOfEnrollment(dateOfEnrollment);
        super.setenrollmentID(enrollmentID);
        super.setcourseName(courseName);
        //Assigning following attributes with parameter values
        this.numOfModules=numOfModules;
        this.numOfCreditHours=numOfCreditHours;
        this.daysPresent=daysPresent;
        //Set the value false
        this.isGrantedScholarship=false;
    }
    //corresponding accessor merthod.
    public int getnumOfModules(){
        return this.numOfModules;
    }

    public int getnumOfCreditHours(){
        return this.numOfCreditHours;
    }

    public double getdaysPresent(){
        return this.daysPresent;
    }

    public boolean getisGrantedScholarship(){
        return this.isGrantedScholarship;
    }

    public void presentPercentage(double daysPresent){
        double percentage=daysPresent/super.getcourseDuration()*100;
        //using conditional clause
        if(super.getcourseDuration()<daysPresent){
            System.out.println("Number of days exceeds course duration");
            return;
        }
        //if percentage is 80 or above it is true or else false
        if(percentage>=80){
            isGrantedScholarship=true;
        }
        else{
            isGrantedScholarship=false;
        }
    }
    //display course name,enrollmentID and date of enrollment
    public void grantCertificate(String courseName,int enrollmentID,String dateOfEnrollment){
        System.out.println("Congratulations! The student has graduated.");
        System.out.println("Course Name="+courseName);
        System.out.println("Enrollment Id="+enrollmentID);
        System.out.println("Date of Enrollment="+dateOfEnrollment);
        //display the scholarship has been granted only if isGrantedScholarship is true
        if(isGrantedScholarship=true){
            System.out.println("The scholarship has been granted.");
        }
    }

    public double calculatePresentPercentage(double daysPresent) {
        // Calculate present percentage
        double totalDays = 100.0; 
        double presentPercentage = (daysPresent / totalDays) * 100.0;
        return presentPercentage; 
    }
    
    public void display(){
        // Calling the display method in the Student class
        super.display();
        System.out.println("Number of Modules= "+this.numOfModules);
        System.out.println("Number of Credit Hours= "+this.numOfCreditHours);
        System.out.println("Days Present= "+this.daysPresent);
    }
}
