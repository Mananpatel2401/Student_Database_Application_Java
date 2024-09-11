import java.util.*;

public class StudentDatabaseApp {
    public static void main(String[] args)  {    

        System.out.println("Enter the number of new Students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudent = sc.nextInt();

        Student[] Stu = new Student[numOfStudent];

        for(int i=0; i<numOfStudent; i++){
            Stu[i] = new Student();
            Stu[i].email();
            Stu[i].payTuition();
        }

        for(int i=0; i<numOfStudent; i++){
            System.out.println(Stu[i].showStatus());
        }
        
    }
}
