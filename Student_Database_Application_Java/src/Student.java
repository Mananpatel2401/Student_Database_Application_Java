import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String Courses;
    private int tuitionBalance;
    private static int costofcourse = 600;
    private static int id = 1000;

    
    // Constructor to get name and year for student

    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName =  sc.nextLine();

        System.out.print("Enter student Last name: ");
        this.lastName = sc.nextLine();

        System.out.println("1 - Fresher\n2 - Junior\n3 - Senior\nEnter student gradutation year: ");
        this.gradeYear = sc.nextInt();

        idGenerater();
        //System.out.println(firstName+" "+lastName+" "+gradeYear+" "+ studentID);
    }

    // ID generater

    private void idGenerater(){
        id++;
        // Grade level + id + 5 int id
        this.studentID = gradeYear+""+id;
    }

    // Enrollment in course

    public void email(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")){
                Courses = Courses + "\n" + course;
                tuitionBalance = tuitionBalance + costofcourse;
            }
            else {
                break;
            }
        } while (1 != 0);
            //System.out.println("Enrollde in: "+ Courses);
            //System.out.println("Tution Balance: "+ tuitionBalance);
    }


    // view balance

    public void viewBalance(){
        System.out.println("Your Balance is: "+tuitionBalance);
    }

    // pay tution fee

    public void payTuition(){
        System.out.print("Enter your payment: ");
        Scanner sc=new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for the payment of "+payment);
        viewBalance();
    }

    //Show status 

    public String showStatus(){
        return "Name: "+ firstName+ " "+lastName+"\nCourses Enrolled: "+Courses + "\nBalance: "+tuitionBalance;

    }
    
}
