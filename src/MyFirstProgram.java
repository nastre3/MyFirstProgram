public class MyFirstProgram {
    public static void main(String[] args) {
        hi("stranger"); // конкретное значение параметра
        hi("user");
        double len = 5;
        System.out.println("S квадрата со стороной " + len + " = " + calculateArea(len));
        double a = 4;
        double b = 6;
        System.out.println("S прямоугольника со сторонами " + a + " и " + b + " = " + calculateArea(a, b));

    }

    private static double calculateArea(double a, double b) {
        return a * b;
    }

    private static double calculateArea(double l) {
        return l * l;
    }

    private static void hi(String somebody) { // somebody - параметр/аргумент ф-ии; void - ф-ия не возвращает значение
        System.out.println("Hi " + somebody);
    }
}
