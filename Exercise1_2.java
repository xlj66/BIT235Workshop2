import java.util.Scanner;

public class Exercise1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit");
    }
}
//（注：内容由AI生成）
