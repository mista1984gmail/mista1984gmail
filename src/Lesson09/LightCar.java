package Lesson09;

/**
 * Created by intelisoft on 06.06.2016.
 */
public class LightCar extends MashineClass{
    private int numbersOfPlaces;

    public LightCar(String markName, String govNumber, DriverWorker driverWorker, int run, int numbersOfPlaces)
    {
        super(markName, govNumber, driverWorker, run);
        this.numbersOfPlaces = numbersOfPlaces;
    }

    public int getNumbersOfPlaces()
    {
        return numbersOfPlaces;
    }

    public void setNumbersOfPlaces(int numbersOfPlaces)
    {
        this.numbersOfPlaces = numbersOfPlaces;
    }

}
