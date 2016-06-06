package Lesson09;

/**
 * Created by intelisoft on 06.06.2016.
 */
public interface Machine {
    String getListLightCars();
    String getListTrucks();
    int choiceOnLoadingCaparity(int c);
    String getList_LC_onRun(int a);
    String getList_Truck_onRun(int b);
}
