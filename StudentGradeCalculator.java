package Codsoft_Intern;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSubjects,totalMarks = 0;
        double averagePercentage;

//enter the number of subject
        System.out.println("enter the number of subject");
        totalSubjects = sc.nextInt();

        // input marks for each subject and calculate total marks
        for (int i = 1; i<= totalSubjects;i++){
            System.out.println("enter marks for subject "+i+"  out of 100");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        //calculate average percentage
         averagePercentage = (double) totalMarks / totalSubjects;

        //determine the grade based on average percentage
        char grade;
        if (averagePercentage >= 90){
            grade='A';
        } else if (averagePercentage >= 80){
            grade = 'B';
        }
        else  if (averagePercentage >= 70){
            grade = 'C';
        } else if (averagePercentage >= 60){
            grade = 'D';
        } else if (averagePercentage >= 50){
            grade = 'E';
        }
        else {
            grade= 'F';
        }
        //Display the result
        System.out.println("Total Marks:" +totalMarks);
        System.out.println("Average Percentage:"+averagePercentage+"%");
        System.out.println("Grade is :"+grade);
        sc.close();

    }
}
