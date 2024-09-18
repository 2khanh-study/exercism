
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean isWithoutBirds = false;

        for (int bird: birdsPerDay) {
            if (bird == 0) {
                isWithoutBirds = true;
                break;
            }
        }

        return isWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;

        if (numberOfDays < 1){
            return 0;
        }
        if (numberOfDays > birdsPerDay.length) {
            for (int bird: birdsPerDay) {
                birdCount += bird;
            }
        }
        else {
            for (int i = 0; i <= numberOfDays; i++) {
                birdCount += i;
            }
        }

        return birdCount;
    }

    public int getBusyDays() {
        int busyDayCount = 0;

        for (int bird: birdsPerDay) {
            if (bird >= 5)
                busyDayCount = busyDayCount + 1;
        }

        return busyDayCount;
    }
}
