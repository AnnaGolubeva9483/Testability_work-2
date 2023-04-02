public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 53.2;
        double heightInMeter = 1.64;
        int index = service.calculate(weightInKg, heightInMeter);
        System.out.println(index);
    }
}