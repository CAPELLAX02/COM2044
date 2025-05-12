import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicCourseRegistrationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many courses do you want to enter? ");
        int numberOfCourses = input.nextInt();
        input.nextLine();

        List<Course> courses = new ArrayList<>();

        for (int i = 1; i <= numberOfCourses; i++) {
            System.out.print("Enter course " + i + " name: ");
            String name = input.nextLine();

            System.out.print("Instructor: ");
            String instructor = input.nextLine();

            System.out.print("Max seats: ");
            int maxSeats = input.nextInt();

            System.out.print("Currently enrolled students: ");
            int enrolledStudents = input.nextInt();
            input.nextLine();

            courses.add(new Course(name, instructor, maxSeats, enrolledStudents));
        }

        System.out.println("\nAll courses:");
        for (Course c : courses) {
            c.displayInfo();
        }

        System.out.println("\nCourses with available seats:");
        for (Course c : courses) {
            if (c.hasAvailableSeats()) {
                System.out.println("- " + c.courseName);
            }
        }

        System.out.print("\nEnter course name to enroll: ");
        String courseToEnroll = input.nextLine();

        boolean found = false;

        for (Course c : courses) {
            if (c.courseName.equalsIgnoreCase(courseToEnroll)) {
                found = true;
                if (c.hasAvailableSeats()) {
                    c.enroll();
                    System.out.println("Enrollment successful!");
                } else {
                    System.out.println("Sorry, the course is full.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Course not found.");
        }

        input.close();
    }
}

class Course {
    String courseName;
    String instructor;
    int maxSeats;
    int enrolledStudents;

    public Course(String courseName, String instructor, int maxSeats, int enrolledStudents) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.maxSeats = maxSeats;
        this.enrolledStudents = enrolledStudents;
    }

    boolean hasAvailableSeats() {
        return enrolledStudents < maxSeats;
    }

    void enroll() {
        if (hasAvailableSeats()) {
            enrolledStudents++;
        }
    }

    void displayInfo() {
        System.out.println("- " + courseName + " (" + instructor + ") | Seats: " + enrolledStudents + "/" + maxSeats);
    }
}
