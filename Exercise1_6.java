public class Exercise1_6 {
    public static void main(String[] args) {
        double tankCapacity = 40.0;              // liters (full tank)
        double normalConsumption = 8.0;          // liters per 100 km on normal roads
        double roughConsumption = normalConsumption * 1.15;   // 15% more on rough roads

        double normalDistance = tankCapacity / normalConsumption * 100;
        double roughDistance = tankCapacity / roughConsumption * 100;

        System.out.println("Distance on normal roads: " + normalDistance + " km");
        System.out.println("Distance on rough roads: " + roughDistance + " km");
    }
}
//（注：内容由AI生成）
