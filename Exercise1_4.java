public class Exercise1_4 {
    public static void main(String[] args) {
        double principal = 5000.00;   // P = $5000.00 investment
        double rate = 0.04;           // r = 4% interest rate per year
        int years = 10;               // n = 10 years

        double amount = principal * Math.pow(1 + rate, years);

        System.out.println("After " + years + " years, the amount is $" + amount);
        System.out.printf("Formatted amount: $%.2f%n", amount);
    }
}
//（注：内容由AI生成）
