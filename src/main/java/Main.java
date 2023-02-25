import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {

        // Арифметические операторы
        int x = 20;
        int y = 15;

        int sum = x + y; // сложение +
        System.out.println("addition result: " + sum);
        int diff = x - y; // вычитание -
        System.out.println("subtraction result: " + diff);
        int product = x * y; // умножение *
        System.out.println("multiplication result: " + product);
        int division = x / y; // деление /
        System.out.println("division result: " + division);
        int divisionResidues = x % y; // остаток от деления %
        System.out.println("Remainder of the division: " + divisionResidues);

        // Операторы сравнения
        boolean isEqual = y == x;
        System.out.println(isEqual);
        boolean isNotEqual = y != x;
        System.out.println(isNotEqual);
        boolean isGreater = x > y;
        System.out.println(isGreater);
        boolean isLess = x < y; // меньше
        System.out.println(isLess);
        boolean isGreaterOrEqual = x >= y;
        System.out.println(isGreaterOrEqual);
        boolean isLessOrEqual = x <= y;
        System.out.println(isLessOrEqual);

        //Логические операции
        boolean o = true;
        boolean p = false;
        boolean i = true;
        boolean result1 = o && p && i;
        System.out.println("o && p && i = " + result1); //And
        boolean result2 = o || p || i;
        System.out.println("o || p || i = " + result2 ); // Or
        boolean result3 = !i;
        System.out.println("!i not true? : " + result3); // not equal

        //переполнение при вычислении
        byte n = 30;
        byte m = 40;
        byte result = n * m; //types: possible lossy conversion from int to byte
        System.out.print("Result overflow " + result);

        // вычисление комбинаций разных типов данных
        double k = 1.55;
        int j = 1000;
        System.out.println("Result different types of data:" + (k + j));
    }
}
