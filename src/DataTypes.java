public class DataTypes {
    public static void main(String[] args) {
        //First comment

        /* Hello World
        I am working on thus file
        Please do not hesitate to ask me
        If you have a questions!
         */

        // Variables: int
        int number0fStudents = 30;
        int maxScore = 100;
        System.out.println(number0fStudents);
        System.out.println(maxScore);

        //Variables: double
        double temperature = 3.4;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        // Variables: float
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        // Casting
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        // Char
        char symbol = '$';
        System.out.println(symbol);

        // Exercise
        char v = 86;
        System.out.println(v);
        char i = 105;
        System.out.println(i);
        char t = 116;
        System.out.println(t);
        char o = 111;
        System.out.println(o);
        char l = 108;
        System.out.println(l);
        char d = 100;
        System.out.println(d);
        char s = 115;
        System.out.println(s);

        // Boolean is / has
        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSummer = false;
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
        System.out.println(isSummer);
    }
}
