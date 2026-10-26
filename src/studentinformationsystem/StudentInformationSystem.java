
public class StudentInformationSystem { // Declares the class named StudentInformationSystem

    public static void main(String[] args) { // Main method: the program starts running here

        String studentName = "Muhammad Fitri bin Asmadi"; // Stores the student's name
        String studentID = "S88487"; // Stores the student's ID

        int mark1 = 45; // Stores the student's first mark
        int mark2 = 40; // Stores the student's second mark

        int total = mark1 + mark2; // Adds both marks and stores the total

        System.out.println("Student Information System"); // Displays the program title
        System.out.println("Student Name: " + studentName); // Displays the student's name
        System.out.println("Student ID: " + studentID); // Displays the student's ID
        System.out.println("Mark 1: " + mark1); // Displays the first mark
        System.out.println("Mark 2: " + mark2); // Displays the second mark
        System.out.println("Total Mark: " + total); // Displays the total of both marks

        if (total >= 80) { // Checks whether the total is 80 or higher
            System.out.println("Result: Excellent"); // Displays Excellent if the condition is true
        } else if (total >= 50) { // Checks whether the total is 50 to 79 if the first condition is false
            System.out.println("Result: Good"); // Displays Good if this condition is true
        } else { // Runs when the total is below 50
            System.out.println("Result: Needs Improvement"); // Displays Needs Improvement
        } // Ends the if-else statement

    } // Ends the main method

} // Ends the StudentInformationSystem class
