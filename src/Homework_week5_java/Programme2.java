/* 2. Rewrite the student mark sheet programme
(From java-homework-week3 programmes) using if else and while loop. */
package Homework_week5_java;
import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) {
        //Scanner declaration for input from user at run time
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Student Name : ");
        String name = sc.next();
        System.out.println("Please Enter the Roll number : ");
        int rollNumber = sc.nextInt();
        System.out.println("Please enter the Marks of Maths subject : ");
        int math = sc.nextInt();
        if (math < 0 || math > 100)
        {
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter the correct marks : ");
            math = sc.nextInt();
        }
        System.out.print("Please enter the Marks of Science subject : ");
        int scienceMarks = sc.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks : ");
            scienceMarks = sc.nextInt();
        }
        System.out.print("Please enter the  Marks of English subject : ");
        int englishMarks = sc.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks :");
            englishMarks = sc.nextInt();
        }
        int total = sum(math, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(math, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNumber, math, scienceMarks, englishMarks, total, percentage, result, grade);
        sc.close();

    }
    //calculating for sum
    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    //Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result)
    {
        String grade = null;
        int count = 1;
        while(count>0) {
            count++;
            if (result.equalsIgnoreCase("Pass")) {
                if (percentage >= 80) {
                    grade = "A+";
                } else if (percentage >= 60) {
                    grade = "A";
                } else if (percentage >= 50) {
                    grade = "B";
                } else if (percentage >= 35) {
                    grade = "C";
                }
            } else {
                grade = "-";
            }
        }
        return grade;

    }

    //Printing the Marks Sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("|      Mark Sheet           |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }

}
