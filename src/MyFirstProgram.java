public class MyFirstProgram {
    public static void main(String[] args) {
        hi("stranger"); // конкретное значение параметра
        hi("user");

        Square s = new Square(5);
        System.out.println("S квадрата со стороной " + s.l + " = " + s.calculateArea());

        Rectangle r = new Rectangle(3, 4);
        System.out.println("S прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.calculateArea());

    }

    private static void hi(String somebody) { // somebody - параметр/аргумент ф-ии; void - ф-ия не возвращает значение
        System.out.println("Hi " + somebody);
    }

}
