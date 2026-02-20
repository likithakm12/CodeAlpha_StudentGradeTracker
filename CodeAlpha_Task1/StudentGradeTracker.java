import java.util.*;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();   // clear buffer

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter name of student " + (i+1) + ": ");
            String name = sc.nextLine();
            names.add(name);

            System.out.print("Enter marks: ");
            int m = sc.nextInt();
            sc.nextLine();

            while (m < 0 || m > 100) {
                System.out.print("Invalid! Enter marks between 0-100: ");
                m = sc.nextInt();
                sc.nextLine();
            }

            marks.add(m);
        }

        int sum = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        for (int m : marks) {
            sum += m;
            if (m > highest) highest = m;
            if (m < lowest) lowest = m;
        }

        double avg = (double) sum / n;

        System.out.println("\n===== PERFORMANCE REPORT =====");
        System.out.println("Average Marks: " + avg);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        System.out.println("\nStudent Feedback:");

        for (int i = 0; i < marks.size(); i++) {
            int m = marks.get(i);
            String grade;
            String feedback;

            if (m >= 90) { grade = "A"; feedback = "Excellent"; }
            else if (m >= 75) { grade = "B"; feedback = "Good"; }
            else if (m >= 50) { grade = "C"; feedback = "Average"; }
            else { grade = "F"; feedback = "Needs Improvement"; }

            System.out.println(names.get(i) + " - " + m + " | Grade: " + grade + " | " + feedback);
        }

        sc.close();
    }
}