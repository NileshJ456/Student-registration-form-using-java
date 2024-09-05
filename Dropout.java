
/**
 * Write a description of class Dropout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dropout extends Student
{
    //declaring attributes
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    //constructor
    public Dropout(int enrollmentId,String dateOfBirth,String studentName,int courseDuration,int tuitionFee,int numOfRemainingModules,int numOfMonthsAttended,String dateOfDropout){
        //call made to superclass constructor
        super( dateOfBirth,studentName, courseDuration, tuitionFee);
        //call made to parent class setter method
        super.setenrollmentID(0);
        super.setcourseName("");
        super.setdateOfEnrollment("");
        //Assigning following attributes with parameter values and given values
        this.numOfRemainingModules= numOfRemainingModules;
        this.numOfMonthsAttended=numOfMonthsAttended;
        this.dateOfDropout=dateOfDropout;
        this.remainingAmount=0;
        this.hasPaid=false; 
    }
    //corresponding accessor method
    public int getnumOfRemainingModules(){
        return this.numOfRemainingModules;
    }
    
    public int getnumOfMonthsAttended(){
        return this.numOfMonthsAttended;
    }

    public String getdateOfDropout(){
        return this.dateOfDropout;
    }

    public int getremainingAmount(){
        return this.remainingAmount;
    }

    public boolean gethasPaid(){
        return this.hasPaid;
    }
    //method to calculate pending tuition fee amount
    public void billsPayable(){
        if(!hasPaid){
            remainingAmount = calculateRemainingAmount();
            hasPaid = true;
        }
    }

    private int calculateRemainingAmount() {
        return (getcourseDuration() - getnumOfMonthsAttended()) * gettuitionFee();

    }

    public void removeStudent(){
        if(hasPaid=true){
            setdateOfBirth("");
            setcourseName("");
            setstudentName("");
            setdateOfEnrollment("");
            setcourseDuration(0);
            settuitionFee(0);
            setenrollmentID(0);
            this.dateOfDropout="";
            this.numOfRemainingModules=0;
            this.numOfMonthsAttended=0;
            this.remainingAmount=0;
        }
        else{
            System.out.println("All bills not cleared");
        }

    }

    public void display() {
        // Calling the display method in the Student class
        super.display(); 
        System.out.println("Number of Remaining Modules=" + numOfRemainingModules);
        System.out.println("Number of Months Attended=" + numOfMonthsAttended);
        System.out.println("Date of Dropout=" + dateOfDropout);
        System.out.println("Remaining Amount=" + remainingAmount);
    }
}
