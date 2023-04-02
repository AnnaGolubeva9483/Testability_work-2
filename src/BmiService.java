public class BmiService {
    public int calculate (double weightInKg, double heightInMeter) {
        double index = weightInKg / (heightInMeter * heightInMeter);
        return (int) index;
    }
}
