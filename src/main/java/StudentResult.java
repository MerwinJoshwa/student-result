
package main.java;
public class StudentResult {

    public int calculateTotal(int maths, int science, int english) {
        return maths + science + english;
    }

    public double calculateAverage(int total) {
        return total / 3.0;
    }

    public String getGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        StudentResult result = new StudentResult();

        int maths = 80;
        int science = 90;
        int english = 70;

        int total = result.calculateTotal(maths, science, english);
        double average = result.calculateAverage(total);
        String grade = result.getGrade(average);

        System.out.println("Total: " + total + "/300");
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
