public class StudentData {
    public static void main(String[] args) {
        //Student Data Storing
        String studentName = "Alvin David";
        int studentNumber = 24;
        int studentAge = 25;
        float studentTuition = 200000.0f;
        char studentGrade = 'A';
        float studentCGPA = 4.45f;

        System.out.println(studentName);
        System.out.println(studentNumber);
        System.out.println(studentAge);
        System.out.println(studentTuition);
        System.out.println(studentGrade);
        System.out.println(studentCGPA);

        //Calculating the Area of a rectangle
        //Area = Length * Width
        int length = 26;
        int width = 12;
        int area;

        area = length * width;
        System.out.println("Our Length is: " + length + " Our Width is: " + width);
        System.out.println("The total area of the rectangle is " + area);
    }
}