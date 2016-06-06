package Lesson09;

/**
 * Created by intelisoft on 06.06.2016.
 */
public class Truck extends MashineClass{
    private int loadingCapacity;

    public Truck(String markName, String govNumber, DriverWorker driverWorker, int run, int loadingCapacity)
    {
        super(markName, govNumber, driverWorker, run);
        this.loadingCapacity = loadingCapacity;
    }

    public int getLoadingCapacity()
    {
        return loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity)
    {
        this.loadingCapacity = loadingCapacity;
    }
}
