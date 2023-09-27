// file "Main.java"
import java.util.Scanner;

//Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
// який повинен приймати радіус та використовуючи PI порахувати площу кола і виводить результат в консоль.
// Створити клас Main, де запустити цей метод.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть радіус: ");
        MyArea.areaOfCircle( input.nextDouble() );
    }
}