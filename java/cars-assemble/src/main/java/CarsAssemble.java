public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carProducedEachHour = 221;

        if (speed < 0 || speed > 10)
            return 0;
        // Check for 100% success rate.
        else if (speed >= 1 && speed <= 4)
            return speed * carProducedEachHour;
        // Check for 90% success rate.
        else if (speed >= 5 && speed <= 8)
            return speed * carProducedEachHour * 0.9;
        // Check for 80% success rate.
        else if (speed == 9)
            return speed * carProducedEachHour * 0.8;
        // Check for 77% success rate.
        return speed * carProducedEachHour * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }

}
