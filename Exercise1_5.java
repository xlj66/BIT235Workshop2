public class Exercise1_5 {
    public static void main(String[] args) {
        double pi = 3.14;

        double earthDiameter = 7600.0;      // miles
        double sunDiameter = 865000.0;      // miles

        double earthRadius = earthDiameter / 2;
        double sunRadius = sunDiameter / 2;

        double earthVolume = (4.0 / 3.0) * pi * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * pi * Math.pow(sunRadius, 3);

        double ratio = sunVolume / earthVolume;

        System.out.println("Volume of the Earth = " + earthVolume + " cubic miles");
        System.out.println("Volume of the Sun = " + sunVolume + " cubic miles");
        System.out.println("Ratio of the Sun's volume to the Earth's volume = " + ratio);
    }
}
//（注：内容由AI生成）
