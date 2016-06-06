package Lesson09;

/**
 * Created by intelisoft on 06.06.2016.
 */
public abstract class MashineClass implements Machine {
    private String markName;
    private String govNumber;
    private DriverWorker driverWorker;
    private int run;


    public MashineClass(String markName, String govNumber, DriverWorker driverWorker, int run) {
        this.markName = markName;
        this.govNumber = govNumber;
        this.run = run;
        this.driverWorker = driverWorker;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String getGovNumber() {
        return govNumber;
    }

    public void setGovNumber(String govNumber) {
        this.govNumber = govNumber;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getDriverWorker() {
        return driverWorker.getFioName();
    }

    public void setDriverWorker(DriverWorker driverWorker) {
        this.driverWorker = driverWorker;
    }

    @Override
    public String getListLightCars() {
        return null;
    }

    @Override
    public String getListTrucks() {
        return null;
    }

    @Override
    public int choiceOnLoadingCaparity(int c) {
        return 0;
    }

    @Override
    public String getList_LC_onRun(int a) {
        return null;
    }

    @Override
    public String getList_Truck_onRun(int b) {
        return null;
    }
}
