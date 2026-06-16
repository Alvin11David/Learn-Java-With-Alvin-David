public class PrintVariables {
    public static void main(String[] args) {
        String courseName = "Learn Java Programming With Alvin David";
        System.out.println("Welcome to " + courseName);

        String firstName = "Alvin";
        String secondName = "David";
        String fullNames = firstName + secondName;
        System.out.println(fullNames);

        int x = 32;
        int y = 34;
        int sum = x + y;
        System.out.println(sum);

        //Or You can rewrite it as
        int x1 = 34, y1 = 32;
        System.out.println(x1 + y1);
    }
}