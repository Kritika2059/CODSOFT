import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==========Student Grade Calculator==========");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int noOfSubjects = scan.nextInt();
        int ObtainedMarks = 0;

        for (int i = 0; i < noOfSubjects; i++) {
            System.out.println("Enter marks of each subjects");
            System.out.println("Enter your marks of subject " + (i+1) + ":");
            int submarks = scan.nextInt();
            ObtainedMarks = ObtainedMarks + submarks;
        }

        int fullMarls = noOfSubjects * 100;
        double percentage = (double) (ObtainedMarks * 100) / fullMarls;

        char grade;
        String feedback = new scan.next();
        if (percentage >= 80) {
            grade = 'A';
            feedback = 'Excellent';
        } else if (percentage >=60 ) {
            grade = 'B';
            feedback = 'Good';
        } else if (percentage >= 40) {
            grade = 'C';
            feedback = 'Acceptable';
        } else if (percentage >= 32) {
            grade = 'D';
            feedback = 'Insufficient';
        } else {
            grade = 'E';
            feedback = 'Very Insufficient';
        }

        System.out.println("_______________Student Details____________________");
        System.out.println(" =>Total Marks Obtained = " + ObtainedMarks);
        System.out.println(" =>Percentage : " + percentage);
        System.out.println(" =>Grade : " + grade);
        System.out.println(" =>Your Performance is : " + feedback);
        scan.close();
    }
}